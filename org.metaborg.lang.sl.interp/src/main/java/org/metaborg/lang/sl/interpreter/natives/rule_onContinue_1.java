package org.metaborg.lang.sl.interpreter.natives;

import java.util.Arrays;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.premises.reduction.DynamicRelationDispatch;
import org.metaborg.meta.lang.dynsem.interpreter.terms.BuiltinTypesGen;
import org.metaborg.meta.lang.dynsem.interpreter.terms.ITerm;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class rule_onContinue_1 extends Rule {

	@Child protected DynamicRelationDispatch dispatchNode;

	public rule_onContinue_1() {
		super(SourceSection.createUnavailable("Rule", "onContinue"));
		this.dispatchNode = new DynamicRelationDispatch._Uninitialized(
				getName(), getSourceSection());
	}

	@Override
	public int getArity() {
		return 1;
	}

	@Override
	public String getConstructor() {
		return "onBreak";
	}

	@Override
	public String getName() {
		return "default";
	}

	public RuleResult execute(VirtualFrame frame) {
		Object[] arguments = frame.getArguments();
		ITerm stmt = BuiltinTypesGen.asITerm(BuiltinTypesGen.asITerm(
				arguments[0]).allSubterms()[0]);

		Object[] args = Rule.buildArguments(stmt,
				Arrays.copyOfRange(arguments, 1, arguments.length));

		return invoke(frame, args);
	}

	private RuleResult invoke(VirtualFrame frame, Object[] args) {
		try {

			return (RuleResult) dispatchNode.execute(frame, args);
		} catch (ContinueException cex) {
			Object[] components = cex.getComponents();
			System.arraycopy(components, 0, args, args.length
					- components.length, components.length);
			// FIXME eliminate this recursive call
			return invoke(frame, args);
		}
	}

}
