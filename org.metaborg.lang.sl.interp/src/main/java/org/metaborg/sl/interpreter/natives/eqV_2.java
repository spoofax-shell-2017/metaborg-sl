package org.metaborg.sl.interpreter.natives;

import org.metaborg.meta.lang.dynsem.interpreter.PremiseFailure;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.premises.TermEqPremise;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.premises.TermEqPremiseNodeGen;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.profiles.BranchProfile;
import com.oracle.truffle.api.source.SourceSection;

public class eqV_2 extends TermBuild {

	@Child private TermEqPremise termeq;

	public eqV_2(TermBuild left, TermBuild right, SourceSection source) {
		super(source);
		this.termeq = TermEqPremiseNodeGen.create(source, left, right);
	}

	@Override
	public Object executeGeneric(VirtualFrame frame) {
		return executeBoolean(frame);
	}

	private final BranchProfile eqFailedTaken = BranchProfile.create();

	@Override
	public boolean executeBoolean(VirtualFrame frame) {
		try {
			termeq.execute(frame);
			return true;
		} catch (PremiseFailure pf) {
			eqFailedTaken.enter();
			return false;
		}

	}

	public static TermBuild create(SourceSection source, TermBuild left,
			TermBuild right) {
		return new eqV_2(left, right, source);
	}

}
