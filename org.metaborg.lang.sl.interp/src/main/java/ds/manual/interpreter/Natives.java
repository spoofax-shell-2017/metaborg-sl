package ds.manual.interpreter;

import java.io.IOException;
import java.nio.charset.Charset;

import org.metaborg.lang.sl.desugar.desugar;
import org.metaborg.lang.sl.desugar.desugar_all_0_0;
import org.metaborg.lang.sl.interp.SLLanguage;
import org.metaborg.lang.sl.interp.SLProgramForeignAccess;
import org.metaborg.meta.interpreter.framework.IGenericNode;
import org.metaborg.meta.interpreter.framework.InterpreterException;
import org.metaborg.meta.interpreter.framework.SourceSectionUtil;
import org.spoofax.interpreter.terms.IStrategoTerm;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.interop.ForeignAccess;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.RootNode;
import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.api.source.SourceSection;

import ds.generated.interpreter.A_FunDef;
import ds.generated.interpreter.A_V;
import ds.generated.interpreter.BoolV_1;
import ds.generated.interpreter.FunV_3;
import ds.generated.interpreter.Generic_A_FunDef;
import ds.generated.interpreter.NullV_0;
import ds.generated.interpreter.NumV_1;
import ds.generated.interpreter.StringV_1;

public class Natives {

	public static long addI_2(long i1, long i2) {
		return i1 + i2;
	}

	public static String v2s_1(A_V v) {
		if (v instanceof StringV_1) {
			return ((StringV_1) v).get_1();
		}

		if (v instanceof BoolV_1) {
			return ((BoolV_1) v).get_1() + "";
		}

		if (v instanceof NumV_1) {
			return ((NumV_1) v).get_1() + "";
		}

		if (v instanceof NullV_0) {
			return "null";
		}

		if (v instanceof FunV_3) {
			return ((FunV_3) v).get_1();
		}

		return v + "";
	}

	public static String concatS_2(String s1, String s2) {
		return s1 + s2;
	}

	public static boolean andB_2(boolean b1, boolean b2) {
		return b1 && b2;
	}

	public static long divI_2(long i1, long i2) {
		return i1 / i2;
	}

	public static boolean eqV_2(A_V v1, A_V v2) {
		return v1.equals(v2);
	}

	public static long s2l_1(String s) {
		return Long.parseLong(s);
	}

	public static boolean ltI_2(long i1, long i2) {
		return i1 < i2;
	}

	public static boolean lteI_2(long i1, long i2) {
		return i1 <= i2;
	}

	public static ObjData newObj_0() {
		return new ObjData();
	}

	public static long mulI_2(long i1, long i2) {
		return i1 * i2;
	}

	public static boolean orB_2(boolean b1, boolean b2) {
		return b1 || b2;
	}

	public static boolean notB_1(boolean b1) {
		return !b1;
	}

	public static long subI_2(long i1, long i2) {
		return i1 - i2;
	}

	public static String println_1(String s) {
		SLLanguage.INSTANCE.getContext().getOutputWriter().println(s);
		return s;
	}

	public static boolean isS_1(A_V v) {
		return v instanceof StringV_1;
	}

	public static ForeignAccess getForeignAccess() {
		return SLProgramForeignAccess.INSTANCE;
	}

	public static long nanoTime_0() {
		return System.nanoTime();
	}

	public static String readln_0() {
		try {
			return SLLanguage.INSTANCE.getContext().getInputReader().readLine();
		} catch (IOException e) {
			throw new InterpreterException("Failed to read input stream", e);
		}
	}

	public static A_FunDef parseFunDef_1(String s) {
		IStrategoTerm funDefTerm = SLLanguage.INSTANCE.getParser().parse(
				Source.fromBytes(s.getBytes(), "Dynamically defined function",
						Charset.defaultCharset()), "FunDef");

		IStrategoTerm desugFunDefTerm = desugar_all_0_0.instance.invoke(
				desugar.init(), funDefTerm);

		GenericRootNode<A_FunDef> fakeRootNode = new GenericRootNode<>(
				new Generic_A_FunDef(
						SourceSectionUtil.fromStrategoTerm(desugFunDefTerm),
						desugFunDefTerm));
		fakeRootNode.specializeChild();
		return fakeRootNode.getChild();
	}

	private static class GenericRootNode<T extends Node> extends RootNode {

		@Child private T child;

		public GenericRootNode(T child) {
			super(SLLanguage.class, SourceSection.createUnavailable(
					"Dynamically defined", "function"), FrameDescriptor
					.create());
			this.child = child;
			this.adoptChildren();
		}

		public void specializeChild() {
			if (child instanceof IGenericNode) {
				IGenericNode gennode = (IGenericNode) child;
				gennode.specialize();
			}
		}

		public T getChild() {
			return child;
		}

		@Override
		public Object execute(VirtualFrame frame) {
			throw new InterpreterException("Not supported");
		}

	}
}
