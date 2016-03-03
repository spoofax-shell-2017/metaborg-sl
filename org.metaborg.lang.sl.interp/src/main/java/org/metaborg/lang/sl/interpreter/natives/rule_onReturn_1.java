package org.metaborg.lang.sl.interpreter.natives;

import java.util.Arrays;

import org.metaborg.lang.sl.interpreter.generated.terms.NullV_0_Term;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.premises.reduction.ConReductionDispatch;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.premises.reduction.ConReductionDispatchNodeGen;
import org.metaborg.meta.lang.dynsem.interpreter.terms.BuiltinTypesGen;
import org.metaborg.meta.lang.dynsem.interpreter.terms.IConTerm;

import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class rule_onReturn_1 extends Rule {

	@Child protected ConReductionDispatch dispatchNode;

	public rule_onReturn_1() {
		super(SourceSection.createUnavailable("Rule", "onReturn"),
				FrameDescriptor.create());
		this.dispatchNode = ConReductionDispatchNodeGen.create(getName(),
				getSourceSection());
		Truffle.getRuntime().createCallTarget(this);
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
		IConTerm stmt = BuiltinTypesGen.asIConTerm(arguments[1]);

		Object[] args = Rule.buildArguments(stmt, stmt.allSubterms(),
				Arrays.copyOfRange(arguments, 2, arguments.length));

		RuleResult rr = null;
		try {
			RuleResult rrSub = dispatchNode.executeDispatch(frame, stmt, args);
			rr = new RuleResult(new NullV_0_Term(), rrSub.components);
		} catch (ReturnException rex) {
			rr = rex.getResult();
		}
		return rr;
	}
}
