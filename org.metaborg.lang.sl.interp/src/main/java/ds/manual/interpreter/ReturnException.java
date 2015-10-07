package ds.manual.interpreter;

import com.github.krukow.clj_ds.PersistentMap;
import com.oracle.truffle.api.nodes.ControlFlowException;

import ds.generated.interpreter.A_V;

public class ReturnException extends ControlFlowException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8249108122742101820L;

	private A_V val;
	private PersistentMap<String, A_V> env;

	public ReturnException(A_V val, PersistentMap<String, A_V> env) {
		this.val = val;
		this.env = env;
	}

	public A_V getVal() {
		return val;
	}

	public PersistentMap<String, A_V> getEnv() {
		return env;
	}

}
