package org.metaborg.lang.sl.interp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.debug.DebugSupportProvider;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.instrument.ToolSupportProvider;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.source.Source;

import ds.generated.interpreter.A_Program;
import ds.manual.interpreter.A_Program_RootWrap;

@TruffleLanguage.Registration(name = "expr.lang", version = "0.0.1", mimeType = "application/x-exprlang")
public final class SLLanguage extends TruffleLanguage<SLContext> {

	public static final SLLanguage INSTANCE = new SLLanguage();

	private final SLParser parser;

	private SLLanguage() {
		parser = new SLParser(Paths.get("../lang.expr/include/Langexpr.tbl"));
	}

	@Override
	protected CallTarget parse(Source src, Node node, String... argumentNames)
			throws IOException {

		A_Program program = parser.parse(src);
		A_Program_RootWrap rootNode = new A_Program_RootWrap(program,
				new FrameDescriptor());

		return new CallTarget() {

			@Override
			public Object call(Object... arg0) {
				Node n = createFindContextNode();
				SLContext ctx = findContext(n);
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

	// public static void main(String[] args) throws IOException,
	// URISyntaxException {

	// TruffleVM vm = TruffleVM.newVM().build();
	//
	// assert vm.getLanguages().containsKey("application/x-exprlang");
	//
	// System.out.println("== running on " +
	// Truffle.getRuntime().getName());
	//
	// String[] args2 = null;
	// if (args.length == 2) {
	// args2 = args;
	// } else {
	// args2 = args[0].split(" ");
	// }
	// int repeats = 1;
	//
	// if (args2.length == 2) {
	// repeats = Integer.parseInt(args2[1]);
	// }
	//
	// vm.eval(Source.fromFileName(args2[0]).withMimeType(
	// "application/x-exprlang"));
	//
	// Symbol program = vm.findGlobalSymbol("program");
	// R_init_V res = null;
	// long st = 0;
	// long et = 0;
	// int repeatsbak = repeats;
	// while (repeats-- > 0) {
	// st = System.nanoTime();
	//
	// res = (R_init_V) program.invoke(null).get();
	// et = System.nanoTime();
	// }
	// repeats = repeatsbak;
	// st = System.nanoTime();
	// while (repeats-- > 0) {
	// res = (R_init_V) program.invoke(null).get();
	// }
	// et = System.nanoTime();
	// System.out.println("------------");
	// System.out.println(res.toStrategoTerm(new TermFactory()).toString());
	// System.out.println("============");
	// System.out.println("Duration: " + ((double) (et - st)) / repeatsbak
	// / 1000000 + " ms");

	// }

	@Override
	protected SLContext createContext(Env env) {
		return new SLContext(this, new BufferedReader(env.stdIn()),
				new PrintWriter(env.stdOut(), true));
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
