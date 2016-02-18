package org.metaborg.lang.sl.interpreter.natives;

import java.io.File;

import org.metaborg.meta.lang.dynsem.interpreter.RuleRegistry;

public class SLRuleRegistry extends RuleRegistry {

	public SLRuleRegistry(File specFile) {
		init();
		populate(this, specFile);
	}

	public void init() {
		registerRule(new rule_onReturn_1());
		registerRule(new rule_doReturn_1());
	}

}
