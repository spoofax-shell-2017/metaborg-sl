package org.metaborg.lang.sl.interpreter.natives;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class eqV_2 extends TermBuild {

	@Child protected TermBuild left;
	@Child protected TermBuild right;

	public eqV_2(TermBuild left, TermBuild right, SourceSection source) {
		super(source);
		this.left = left;
		this.right = right;
	}

	@Override
	public Object executeGeneric(VirtualFrame frame) {
		return executeBoolean(frame);
	}

	@Override
	public boolean executeBoolean(VirtualFrame frame) {
		return left.executeGeneric(frame).equals(right.executeGeneric(frame));
	}

	public static TermBuild create(SourceSection source, TermBuild left,
			TermBuild right) {
		return new eqV_2(left, right, source);
	}

}
