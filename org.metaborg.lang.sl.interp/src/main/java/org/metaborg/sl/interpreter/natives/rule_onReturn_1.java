package org.metaborg.sl.interpreter.natives;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleRegistry;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.premises.reduction.DynamicRelationDispatch;
import org.metaborg.meta.lang.dynsem.interpreter.terms.BuiltinTypesGen;
import org.metaborg.sl.interpreter.generated.terms.NullV_0_Term;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class rule_onReturn_1 extends Rule {

	@Child protected DynamicRelationDispatch dispatchNode;

	public rule_onReturn_1() {
		super(SourceSection.createUnavailable("Rule", "onReturn"),
				new FrameDescriptor(), RuleRegistry.makeKey("default",
						"onReturn", 1));
		this.dispatchNode = new DynamicRelationDispatch._Generic("default",
				getSourceSection());
	}

	@Override
	public RuleResult execute(VirtualFrame frame) {
		Object[] arguments = frame.getArguments();
		Object stmt = BuiltinTypesGen.asITerm(arguments[0]).allSubterms()[0];

		Object[] args = new Object[] { stmt, arguments[1], arguments[2] };

		RuleResult rr = null;
		try {
			RuleResult rrSub = dispatchNode.execute(frame, args);
			rr = new RuleResult(NullV_0_Term.SINGLETON, rrSub.components);
		} catch (ReturnException rex) {
			rr = rex.getResult();
		}
		return rr;
	}
}
