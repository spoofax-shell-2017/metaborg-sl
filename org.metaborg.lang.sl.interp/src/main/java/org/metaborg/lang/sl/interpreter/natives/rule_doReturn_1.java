package org.metaborg.lang.sl.interpreter.natives;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;

import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class rule_doReturn_1 extends Rule {

	public rule_doReturn_1() {
		super(SourceSection.createUnavailable("Rule", "onReturn"),
				FrameDescriptor.create());
		Truffle.getRuntime().createCallTarget(this);
	}

	@Override
	public int getArity() {
		return 1;
	}

	@Override
	public String getConstructor() {
		return "doReturn";
	}

	@Override
	public String getName() {
		return "default";
	}

	@Override
	public RuleResult execute(VirtualFrame frame) {
		RuleResult rr = new RuleResult();
		rr.result = frame.getArguments()[0];
		rr.components = new Object[2];
		System.arraycopy(frame.getArguments(), 1, rr.components, 0, 2);

		throw new ReturnException(rr);
	}
}
