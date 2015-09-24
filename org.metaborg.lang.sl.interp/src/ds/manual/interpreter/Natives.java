package ds.manual.interpreter;

import ds.generated.interpreter.A_V;
import ds.generated.interpreter.BoolV_1;
import ds.generated.interpreter.NumV_1;
import ds.generated.interpreter.StringV_1;

public class Natives {

	public static int addI_2(int i1, int i2) {
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

		return v + "";
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
		return new ObjData();
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

	public static int subI_2(int i1, int i2) {
		return i1 - i2;
	}

}
