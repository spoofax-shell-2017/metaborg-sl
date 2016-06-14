package org.metaborg.sl.interpreter.natives;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleKind;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.premises.reduction.DispatchNode;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.premises.reduction.DispatchNodeGen;
import org.metaborg.sl.interpreter.generated.TypesGen;
import org.metaborg.sl.interpreter.generated.terms.IStmtTerm;
import org.metaborg.sl.interpreter.generated.terms.NullV_0_Term;
import org.metaborg.sl.interpreter.generated.terms.onBreak_1_Term;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class rule_onBreak_1 extends Rule {

	@Child protected DispatchNode dispatchNode;

	public rule_onBreak_1() {
		super(SourceSection.createUnavailable("Rule", "onBreak"),
				new FrameDescriptor(), RuleKind.TERM, "default",
				onBreak_1_Term.class);
		this.dispatchNode = DispatchNodeGen.create(getSourceSection(),
				"default");
	}

	@Override
	public RuleResult execute(VirtualFrame frame) {
		Object[] arguments = frame.getArguments();

		onBreak_1_Term reducedTerm = TypesGen.asonBreak_1_Term(arguments[0]);
		IStmtTerm stmt = reducedTerm.get_1();

		Object[] args = new Object[] { stmt, arguments[1], arguments[2] };

		RuleResult rr = null;
		try {
			RuleResult rrSub = dispatchNode.execute(args[0].getClass(), args);
			rr = new RuleResult(NullV_0_Term.SINGLETON, rrSub.components);
		} catch (BreakException bex) {
			rr = new RuleResult(NullV_0_Term.SINGLETON, bex.getComponents());
		}
		return rr;
	}

}
