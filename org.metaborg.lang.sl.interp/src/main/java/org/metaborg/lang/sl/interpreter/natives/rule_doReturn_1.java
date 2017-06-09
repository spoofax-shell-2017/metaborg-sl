package org.metaborg.lang.sl.interpreter.natives;

import java.util.Arrays;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleKind;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;
import org.metaborg.org.metaborg.lang.sl.interp.generated.TypesGen;
import org.metaborg.org.metaborg.lang.sl.interp.generated.terms.IVTerm;
import org.metaborg.org.metaborg.lang.sl.interp.generated.terms.doReturn_1_Term;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;

public class rule_doReturn_1 extends Rule {

	public rule_doReturn_1() {
		super(null, new FrameDescriptor(), RuleKind.TERM, DEFAULT_NAME,
				doReturn_1_Term.class);
	}

	@Override
	public RuleResult execute(VirtualFrame frame) {
		Object[] arguments = frame.getArguments();
		// the type of the first argument is likely to be very constant. let's
		// specialize to that. how?

		// we need expectation nodes for a node that we do not yet know

		IVTerm resValue = TypesGen.asdoReturn_1_Term(arguments[0]).get_1();

		RuleResult rr = new RuleResult(resValue, Arrays.copyOfRange(arguments, 1, arguments.length));

		throw new ReturnException(rr);
	}
}
