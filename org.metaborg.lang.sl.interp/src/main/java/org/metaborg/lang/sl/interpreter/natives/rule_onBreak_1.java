package org.metaborg.lang.sl.interpreter.natives;

import java.util.Arrays;

import org.metaborg.lang.sl.interpreter.generated.terms.NullV_0_Term;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.premises.reduction.IndirectReductionDispatch2;
import org.metaborg.meta.lang.dynsem.interpreter.terms.BuiltinTypesGen;
import org.metaborg.meta.lang.dynsem.interpreter.terms.ITerm;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class rule_onBreak_1 extends Rule {

	@Child protected IndirectReductionDispatch2 dispatchNode;

	public rule_onBreak_1() {
		super(SourceSection.createUnavailable("Rule", "onBreak"));
		this.dispatchNode = new IndirectReductionDispatch2._Uninitialized(
				getName(), getSourceSection());
	}

	@Override
	public int getArity() {
		return 1;
	}

	@Override
	public String getConstructor() {
		return "onContinue";
	}

	@Override
	public String getName() {
		return "default";
	}

	@Override
	public RuleResult execute(VirtualFrame frame) {
		Object[] arguments = frame.getArguments();

		ITerm stmt = BuiltinTypesGen.asITerm(arguments[1]);

		Object[] args = Rule.buildArguments(stmt, stmt.allSubterms(),
				Arrays.copyOfRange(arguments, 2, arguments.length));

		RuleResult rr = null;
		try {
			RuleResult rrSub = dispatchNode.executeDispatch(frame, args);
			rr = new RuleResult(new NullV_0_Term(), rrSub.components);
		} catch (BreakException bex) {
			rr = new RuleResult(new NullV_0_Term(), bex.getComponents());
		}
		return rr;
	}

}
