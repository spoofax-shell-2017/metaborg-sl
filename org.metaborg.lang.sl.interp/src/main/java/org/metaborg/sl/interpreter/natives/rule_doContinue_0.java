package org.metaborg.sl.interpreter.natives;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleRegistry;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class rule_doContinue_0 extends Rule {

	public rule_doContinue_0() {
		super(SourceSection.createUnavailable("Rule", "doContinue"),
				new FrameDescriptor(), RuleRegistry.makeKey("default",
						"doContinue", 0));
	}

	@Override
	public RuleResult execute(VirtualFrame frame) {

		Object[] components = new Object[2];
		System.arraycopy(frame.getArguments(), 1, components, 0, 2);
		throw new ContinueException(components);
	}
}
