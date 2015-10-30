package org.metaborg.lang.sl.interp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Paths;
import java.util.concurrent.Callable;

import org.metaborg.meta.interpreter.framework.InterpreterException;
import org.metaborg.meta.interpreter.framework.SourceSectionUtil;
import org.spoofax.interpreter.terms.IStrategoTerm;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.debug.DebugSupportProvider;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.instrument.ToolSupportProvider;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.api.vm.TruffleVM;
import com.oracle.truffle.api.vm.TruffleVM.Symbol;

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

	public <T> Callable<T> getCallable(String filename, Reader inputReader,
			Writer outputWriter, Writer errWriter) {
		TruffleVM vm = TruffleVM.newVM().stdIn(inputReader)
				.stdOut(outputWriter).stdErr(errWriter).build();

		assert vm.getLanguages().containsKey("application/x-sllang");

		try {
			vm.eval(Source.fromFileName(filename).withMimeType(
					"application/x-sllang"));
		} catch (IOException e) {
			throw new InterpreterException("Eval failed", e);
		}
		Symbol program = vm.findGlobalSymbol("program");

		return new Callable<T>() {

			@Override
			@SuppressWarnings("unchecked")
			public T call() throws Exception {
				return (T) program.invoke(null).get();
			}
		};

	}

	@Override
	protected SLContext createContext(Env env) {
		return new SLContext(this, new BufferedReader(env.stdIn()),
				new PrintWriter(env.stdOut(), true), new PrintWriter(
						env.stdErr(), true));
	}

	@Override
	protected Object findExportedSymbol(SLContext ctx, String name,
			boolean dunno) {
		return name.equals("program") ? ctx.getProgram() : null;
	}

	@Override
	protected DebugSupportProvider getDebugSupport() {
		return null;
	}

	@Override
	protected Object getLanguageGlobal(SLContext ctx) {
		return ctx;
	}

	@Override
	protected ToolSupportProvider getToolSupport() {
		return null;
	}

	@Override
	protected boolean isObjectOfLanguage(Object arg0) {
		return arg0 instanceof SLProgram;
	}

}
