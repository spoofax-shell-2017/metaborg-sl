package ds.manual.interpreter;

import java.util.HashMap;
import java.util.Map;

import com.oracle.truffle.api.source.SourceSection;

import ds.generated.interpreter.A_V;
import ds.generated.interpreter.NullV_0;

public class ObjData {

	private Map<String, A_V> store = new HashMap<>();

	public A_V writeProp(String prop, A_V v) {
		return store.put(prop, v);
	}

	public A_V readProp(String prop) {
		A_V v = store.get(prop);
		if (v == null) {
			v = new NullV_0(SourceSection.createUnavailable("cucu", "baubau"));
		}
		return v;
	}

}