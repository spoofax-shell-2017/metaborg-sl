package ds.manual.interpreter;

import com.github.krukow.clj_ds.PersistentMap;
import com.oracle.truffle.api.nodes.ControlFlowException;

import ds.generated.interpreter.A_V;

public class BreakException extends ControlFlowException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5561981070347202902L;
	private PersistentMap<String, A_V> env;

	public BreakException(PersistentMap<String, A_V> env) {
		this.env = env;
	}

	public PersistentMap<String, A_V> getEnv() {
		return env;
	}
}
