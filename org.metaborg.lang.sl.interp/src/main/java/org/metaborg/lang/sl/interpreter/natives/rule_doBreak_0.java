package org.metaborg.lang.sl.interpreter.natives;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class rule_doBreak_0 extends Rule {

	public rule_doBreak_0() {
		super(SourceSection.createUnavailable("Rule", "doBreak"),
				new FrameDescriptor());
	}

	@Override
	public int getArity() {
		return 0;
	}

	@Override
	public String getConstructor() {
		return "doBreak";
	}

	@Override
	public String getName() {
		return "default";
	}

	@Override
	public RuleResult execute(VirtualFrame frame) {
		Object[] components = new Object[2];
		System.arraycopy(frame.getArguments(), 1, components, 0, 2);
		throw new BreakException(components);
	}
}
