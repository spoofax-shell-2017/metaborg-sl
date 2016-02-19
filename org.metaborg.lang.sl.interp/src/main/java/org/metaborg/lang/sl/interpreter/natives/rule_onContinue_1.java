package org.metaborg.lang.sl.interpreter.natives;

import java.util.Arrays;

import metaborg.meta.lang.dynsem.interpreter.terms.BuiltinTypesGen;
import metaborg.meta.lang.dynsem.interpreter.terms.IConTerm;

import org.metaborg.meta.lang.dynsem.interpreter.DynSemContext;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;

import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class rule_onContinue_1 extends Rule {

	public rule_onContinue_1() {
		super(SourceSection.createUnavailable("Rule", "onBreak"),
				FrameDescriptor.create());
		Truffle.getRuntime().createCallTarget(this);
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
		IConTerm stmt = BuiltinTypesGen.asIConTerm((arguments[1]));
		DynSemContext context = DynSemContext.LANGUAGE
				.findContext0(DynSemContext.LANGUAGE.createFindContextNode0());
		Rule r = context.getRuleRegistry().lookupRule(getName(),
				stmt.constructor(), stmt.arity());

		Object[] args = Rule.buildArguments(stmt, stmt.allSubterms(),
				Arrays.copyOfRange(arguments, 2, arguments.length));

		return invoke(r, args);
	}

	private RuleResult invoke(Rule r, Object[] args) {
		try {
			return (RuleResult) r.getCallTarget().call(args);
		} catch (ContinueException cex) {

			Object[] components = cex.getComponents();
			System.arraycopy(components, 0, args, args.length
					- components.length, components.length);
			return invoke(r, args);
		}
	}

}
