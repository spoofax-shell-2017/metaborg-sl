package ds.manual.interpreter;

import ds.generated.interpreter.A_V;

public class Natives {

	public static int addI_2(int i1, int i2) {
		return i1 + i2;
	}

	public static String v2s_1(A_V lifted_6360) {
		// FIXME implement
		throw new RuntimeException("not implemented");
	}

	public static String concatS_2(String s1, String s2) {
		return s1 + s2;
	}

	public static boolean andB_2(boolean b1, boolean b2) {
		return b1 && b2;
	}

	public static int divI_2(int i1, int i2) {
		return i1 / i2;
	}

	public static boolean eqV_2(A_V v1, A_V v2) {
		return v1.equals(v2);
	}

	public static int s2i_1(String s) {
		return Integer.parseInt(s);
	}

	public static boolean ltI_2(int i1, int i2) {
		return i1 < i2;
	}

	public static boolean lteI_2(int i1, int i2) {
		return i1 <= i2;
	}

	public static ObjData newObj_0() {
		// FIXME implement
		throw new RuntimeException("not implemented");
	}

	public static int mulI_2(int i1, int i2) {
		return i1 * i2;
	}

	public static boolean orB_2(boolean b1, boolean b2) {
		return b1 || b2;
	}

	public static boolean notB_1(boolean b1) {
		return b1;
	}

}
