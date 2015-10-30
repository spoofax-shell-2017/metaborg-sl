package ds.manual.interpreter;

import com.github.krukow.clj_ds.PersistentMap;
import com.oracle.truffle.api.nodes.ControlFlowException;

import ds.generated.interpreter.A_C;
import ds.generated.interpreter.A_V;

public class BreakException extends ControlFlowException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5561981070347202902L;
	private PersistentMap<String, A_V> env;
	private A_C rootenv;

	public BreakException(A_C rootenv, PersistentMap<String, A_V> env) {
		this.env = env;
		this.rootenv = rootenv;
	}

	public PersistentMap<String, A_V> getEnv() {
		return env;
	}

	public A_C getRootenv() {
		return rootenv;
	}
}
