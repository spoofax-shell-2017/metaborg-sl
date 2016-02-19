package org.metaborg.lang.sl.interpreter.natives;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;

import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class rule_doReturn_1 extends Rule {

	public rule_doReturn_1() {
		super(SourceSection.createUnavailable("Rule", "doReturn"),
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
		Object[] arguments = frame.getArguments();
		rr.result = arguments[1];
		rr.components = new Object[2];
		System.arraycopy(arguments, 2, rr.components, 0, arguments.length - 2);

		throw new ReturnException(rr);
	}
}
