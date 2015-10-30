package ds.manual.interpreter;

import com.github.krukow.clj_ds.PersistentMap;
import com.oracle.truffle.api.nodes.ControlFlowException;

import ds.generated.interpreter.A_C;
import ds.generated.interpreter.A_V;

public class ReturnException extends ControlFlowException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8249108122742101820L;

	private A_V val;
	private PersistentMap<String, A_V> env;
	private A_C rootenv;

	public ReturnException(A_V val, A_C rootenv, PersistentMap<String, A_V> env) {
		this.val = val;
		this.env = env;
		this.rootenv = rootenv;
	}

	public A_V getVal() {
		return val;
	}

	public PersistentMap<String, A_V> getEnv() {
		return env;
	}

	public A_C getRootenv() {
		return rootenv;
	}
}
