package org.metaborg.lang.sl.interpreter.natives;

import java.nio.file.Path;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleRegistry;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleRoot;

public class SLRuleRegistry extends RuleRegistry {

	public SLRuleRegistry(Path specPath) {
		super(specPath);
	}

	@Override
	protected void init() {
		registerRule(new RuleRoot(new rule_onReturn_1()));
		registerRule(new RuleRoot(new rule_doReturn_1()));
		registerRule(new RuleRoot(new rule_doBreak_0()));
		registerRule(new RuleRoot(new rule_onBreak_1()));
		registerRule(new RuleRoot(new rule_onContinue_1()));
		registerRule(new RuleRoot(new rule_doContinue_0()));
		registerRule(new RuleRoot(new rule_loop_2_uninitialized()));
	}
}
