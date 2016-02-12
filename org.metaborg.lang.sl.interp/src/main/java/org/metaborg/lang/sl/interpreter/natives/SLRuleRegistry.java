package org.metaborg.lang.sl.interpreter.natives;

import java.io.File;

import org.metaborg.meta.lang.dynsem.interpreter.RuleRegistry;

public class SLRuleRegistry extends RuleRegistry {

	public SLRuleRegistry(File specFile) {
		populate(this, specFile);
	}

}
