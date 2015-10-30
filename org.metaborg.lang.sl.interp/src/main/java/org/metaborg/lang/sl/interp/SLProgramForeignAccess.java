package org.metaborg.lang.sl.interp;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.interop.ForeignAccess;
import com.oracle.truffle.api.interop.ForeignAccess.Factory;
import com.oracle.truffle.api.interop.Message;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.nodes.RootNode;

public class SLProgramForeignAccess implements Factory {

	public static final ForeignAccess INSTANCE = ForeignAccess
			.create(new SLProgramForeignAccess());

	@Override
	public CallTarget accessMessage(Message tree) {
		if (Message.createExecute(0).equals(tree)) {
			return Truffle.getRuntime().createCallTarget(
					new SLForeignCallerNode());
		} else {
			throw new IllegalArgumentException(tree.toString()
					+ " not supported");
		}
	}

	@Override
	public boolean canHandle(TruffleObject o) {
		return o instanceof SLProgram;
	}

	private static class SLForeignCallerNode extends RootNode {

		public SLForeignCallerNode() {
			super(SLLanguage.class, null, null);
		}

		@Override
		public Object execute(VirtualFrame frame) {
			SLProgram prog = (SLProgram) ForeignAccess.getReceiver(frame);

			return prog.getCallTarget().call(new Object[] {});
		}

	}
}
