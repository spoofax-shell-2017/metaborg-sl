package ds.manual.interpreter;

import com.github.krukow.clj_ds.PersistentMap;
import com.oracle.truffle.api.nodes.ControlFlowException;

import ds.generated.interpreter.A_C;
import ds.generated.interpreter.A_V;

public class ContinueException extends ControlFlowException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7307482647055523720L;

	private PersistentMap<String, A_V> env;
	private A_C rootenv;

	public ContinueException(A_C rootenv, PersistentMap<String, A_V> env) {
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
