package org.metaborg.sl.interpreter.natives;

import java.util.Arrays;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleRegistry;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;
import org.metaborg.meta.lang.dynsem.interpreter.terms.BuiltinTypesGen;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class rule_doReturn_1 extends Rule {

	public rule_doReturn_1() {
		super(SourceSection.createUnavailable("Rule", "doReturn"),
				new FrameDescriptor(), RuleRegistry.makeKey("default",
						"doReturn", 1));
	}

	@Override
	public RuleResult execute(VirtualFrame frame) {
		Object[] arguments = frame.getArguments();
		// the type of the first argument is likely to be very constant. let's
		// specialize to that. how?

		// we need expectation nodes for a node that we do not yet know

		Object resultValue = BuiltinTypesGen.asITerm(arguments[0])
				.allSubterms()[0];

		RuleResult rr = new RuleResult(resultValue, Arrays.copyOfRange(
				arguments, 1, arguments.length));

		throw new ReturnException(rr);
	}
}
