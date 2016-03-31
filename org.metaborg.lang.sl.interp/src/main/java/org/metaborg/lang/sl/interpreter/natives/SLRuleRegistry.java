package org.metaborg.lang.sl.interpreter.natives;

import java.io.File;

import org.metaborg.meta.lang.dynsem.interpreter.RuleRegistry;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleRoot;

import com.oracle.truffle.api.frame.FrameDescriptor;

public class SLRuleRegistry extends RuleRegistry {

	public SLRuleRegistry(File specFile) {
		init();
		populate(this, specFile);
	}

	public void init() {
		registerRule(new RuleRoot(new rule_onReturn_1(),
				FrameDescriptor.create()));
		registerRule(new RuleRoot(new rule_doReturn_1(),
				FrameDescriptor.create()));
		registerRule(new RuleRoot(new rule_doBreak_0(),
				FrameDescriptor.create()));
		registerRule(new RuleRoot(new rule_onBreak_1(),
				FrameDescriptor.create()));
		registerRule(new RuleRoot(new rule_onContinue_1(),
				FrameDescriptor.create()));
		registerRule(new RuleRoot(new rule_doContinue_0(),
				FrameDescriptor.create()));
		registerRule(new RuleRoot(new rule_loop_2_uninitialized(), FrameDescriptor.create()));
	}

}
