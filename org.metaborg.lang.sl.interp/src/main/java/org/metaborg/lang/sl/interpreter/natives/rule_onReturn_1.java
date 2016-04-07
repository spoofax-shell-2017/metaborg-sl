package org.metaborg.lang.sl.interpreter.natives;

import org.metaborg.lang.sl.interpreter.generated.terms.NullV_0_Term;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.premises.reduction.DynamicRelationDispatch;
import org.metaborg.meta.lang.dynsem.interpreter.terms.BuiltinTypesGen;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class rule_onReturn_1 extends Rule {

	@Child protected DynamicRelationDispatch dispatchNode;

	public rule_onReturn_1() {
		super(SourceSection.createUnavailable("Rule", "onReturn"));
		this.dispatchNode = new DynamicRelationDispatch._Generic(getName(),
				getSourceSection());
	}

	@Override
	public int getArity() {
		return 1;
	}

	@Override
	public String getConstructor() {
		return "onReturn";
	}

	@Override
	public String getName() {
		return "default";
	}

	@Override
	public RuleResult execute(VirtualFrame frame) {
		Object[] arguments = frame.getArguments();
		Object stmt = BuiltinTypesGen.asITerm(arguments[0]).allSubterms()[0];

		Object[] args = new Object[] { stmt, arguments[1], arguments[2] };

		RuleResult rr = null;
		try {
			RuleResult rrSub = dispatchNode.execute(frame, args);
			rr = new RuleResult(new NullV_0_Term(), rrSub.components);
		} catch (ReturnException rex) {
			rr = rex.getResult();
		}
		return rr;
	}
}
