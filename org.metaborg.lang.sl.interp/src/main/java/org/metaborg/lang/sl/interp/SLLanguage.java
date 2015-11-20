package org.metaborg.lang.sl.interp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.concurrent.Callable;

import org.metaborg.meta.interpreter.framework.InterpreterException;
import org.metaborg.meta.interpreter.framework.SourceSectionUtil;
import org.spoofax.interpreter.terms.IStrategoTerm;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.MaterializedFrame;
import com.oracle.truffle.api.instrument.Visualizer;
import com.oracle.truffle.api.instrument.WrapperNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.api.vm.PolyglotEngine;
import com.oracle.truffle.api.vm.PolyglotEngine.Value;

import ds.generated.interpreter.A_Program;
import ds.generated.interpreter.Generic_A_Program;
import ds.manual.interpreter.A_Program_RootWrap;

@TruffleLanguage.Registration(name = "sl.lang", version = "0.0.1", mimeType = "application/x-sllang")
public final class SLLanguage extends TruffleLanguage<SLContext> {

	public static final SLLanguage INSTANCE = new SLLanguage();

	private final SLParser parser;

	private SLLanguage() {
		parser = new SLParser(
				Paths.get("../org.metaborg.lang.sl/include/SL.tbl"));
	}

	@Override
	protected CallTarget parse(Source src, Node node, String... argumentNames)
			throws IOException {
		IStrategoTerm programTerm = parser.parse(src, "Program");
		A_Program program = new Generic_A_Program(
				SourceSectionUtil.fromStrategoTerm(programTerm), programTerm);
		A_Program_RootWrap rootNode = new A_Program_RootWrap(program,
				new FrameDescriptor());

		return new CallTarget() {

			@Override
			public Object call(Object... arg0) {

				SLContext ctx = getContext();
				if (ctx.getProgram() == null) {
					SLProgram prog = new SLProgram();
					prog.setCallTarget(Truffle.getRuntime().createCallTarget(
							rootNode));
					ctx.setProgram(prog);
				}

				return null;
			}
		};
	}

	public SLParser getParser() {
		return parser;
	}

	public SLContext getContext() {
		return findContext(createFindContextNode());
	}

	public Callable<Value> getCallable(String filename,
			InputStream inputStream, OutputStream outputStream,
			OutputStream errStream) throws IOException {

		PolyglotEngine vm = PolyglotEngine.buildNew().setIn(inputStream)
				.setOut(outputStream).setErr(errStream).build();
		assert vm.getLanguages().containsKey("application/x-sllang");
		try {
			vm.eval(Source.fromFileName(filename).withMimeType(
					"application/x-sllang"));
		} catch (IOException e) {
			throw new InterpreterException("Eval failed", e);
		}
		Value program = vm.findGlobalSymbol("program");

		return new Callable<Value>() {

			@Override
			public Value call() throws Exception {
				return program.invoke(null);
			}
		};

	}

	@Override
	protected SLContext createContext(Env env) {
		final BufferedReader in = new BufferedReader(new InputStreamReader(
				env.in()));
		final PrintWriter out = new PrintWriter(env.out(), true);
		final PrintWriter err = new PrintWriter(env.err(), true);
		SLContext context = new SLContext(this, in, out, err);

		return context;
	}

	@Override
	protected Object findExportedSymbol(SLContext ctx, String name,
			boolean dunno) {
		return name.equals("program") ? ctx.getProgram() : null;
	}

	@Override
	protected Object evalInContext(Source source, Node node,
			MaterializedFrame mFrame) throws IOException {
		throw new IllegalStateException(
				"evalInContext not supported in this language");
	}

	@Override
	protected Object getLanguageGlobal(SLContext context) {
		return context;
	}

	@Override
	protected boolean isInstrumentable(Node node) {
		return false;
	}

	@Override
	protected Visualizer getVisualizer() {
		return null;
	}

	@Override
	protected boolean isObjectOfLanguage(Object arg0) {
		return arg0 instanceof SLProgram;
	}

	@Override
	protected WrapperNode createWrapperNode(Node arg0) {
		return null;
	}

}
