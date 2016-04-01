package org.metaborg.lang.sl.interpreter.natives;

import java.util.Arrays;

import org.metaborg.meta.lang.dynsem.interpreter.DynSemContext;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleRoot;
import org.metaborg.meta.lang.dynsem.interpreter.terms.BuiltinTypesGen;
import org.metaborg.meta.lang.dynsem.interpreter.terms.ITerm;

import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.source.SourceSection;

public class rule_onContinue_1 extends Rule {

	public rule_onContinue_1() {
		super(SourceSection.createUnavailable("Rule", "onContinue"));
	}

	@CompilationFinal private Node createContext;

	protected DynSemContext getContext() {
		if (createContext == null) {
			createContext = DynSemContext.LANGUAGE.createFindContextNode0();
		}
		return DynSemContext.LANGUAGE.findContext0(createContext);
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
		ITerm stmt = BuiltinTypesGen.asITerm((arguments[1]));
		DynSemContext context = getContext();

		RuleRoot rr = context.getRuleRegistry().lookupRule(getName(),
				stmt.constructor(), stmt.arity());

		Object[] args = Rule.buildArguments(stmt, stmt.allSubterms(),
				Arrays.copyOfRange(arguments, 2, arguments.length));

		return invoke(rr, args);
	}

	private RuleResult invoke(RuleRoot rr, Object[] args) {
		try {
			return (RuleResult) rr.getCallTarget().call(args);
		} catch (ContinueException cex) {
			Object[] components = cex.getComponents();
			System.arraycopy(components, 0, args, args.length
					- components.length, components.length);
			// FIXME eliminate this recursive call
			return invoke(rr, args);
		}
	}

}
