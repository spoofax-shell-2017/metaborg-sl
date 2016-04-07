package org.metaborg.lang.sl.interpreter.natives;

import java.util.Arrays;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;
import org.metaborg.meta.lang.dynsem.interpreter.terms.BuiltinTypesGen;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class rule_doReturn_1 extends Rule {

	public rule_doReturn_1() {
		super(SourceSection.createUnavailable("Rule", "doReturn"));
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
		Object[] arguments = frame.getArguments();
		Object resultValue = BuiltinTypesGen.asITerm(arguments[0])
				.allSubterms()[0];
		RuleResult rr = new RuleResult(resultValue, Arrays.copyOfRange(
				arguments, 1, arguments.length));

		throw new ReturnException(rr);
	}
}
