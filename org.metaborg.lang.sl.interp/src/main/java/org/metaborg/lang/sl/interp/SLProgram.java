package org.metaborg.lang.sl.interp;

import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.interop.ForeignAccess;
import com.oracle.truffle.api.interop.TruffleObject;

public class SLProgram implements TruffleObject {

	private RootCallTarget callTarget;

	public void setCallTarget(RootCallTarget callTarget) {
		this.callTarget = callTarget;
	}

	public RootCallTarget getCallTarget() {
		return callTarget;
	}

	@Override
	public ForeignAccess getForeignAccess() {
		return SLProgramForeignAccess.INSTANCE;
	}

}
