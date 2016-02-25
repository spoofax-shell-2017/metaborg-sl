package org.metaborg.lang.sl.interpreter.natives;

import java.util.Arrays;

import org.metaborg.lang.sl.interpreter.generated.terms.NullV_0_Term;
import org.metaborg.meta.lang.dynsem.interpreter.DynSemContext;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;
import org.metaborg.meta.lang.dynsem.interpreter.terms.BuiltinTypesGen;
import org.metaborg.meta.lang.dynsem.interpreter.terms.IConTerm;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.source.SourceSection;

public class rule_onBreak_1 extends Rule {

	public rule_onBreak_1() {
		super(SourceSection.createUnavailable("Rule", "onBreak"),
				FrameDescriptor.create());
		Truffle.getRuntime().createCallTarget(this);
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
		return "onContinue";
	}

	@Override
	public String getName() {
		return "default";
	}

	@Override
	public RuleResult execute(VirtualFrame frame) {
		Object[] arguments = frame.getArguments();

		IConTerm stmt = BuiltinTypesGen.asIConTerm((arguments[1]));
		DynSemContext context = getContext();

		Rule r = context.getRuleRegistry().lookupRule(getName(),
				stmt.constructor(), stmt.arity());

		Object[] args = Rule.buildArguments(stmt, stmt.allSubterms(),
				Arrays.copyOfRange(arguments, 2, arguments.length));

		RuleResult rr = null;
		try {
			CallTarget ct = r.getCallTarget();
			RuleResult rrSub = (RuleResult) ct.call(args);
			rr = new RuleResult();
			rr.result = new NullV_0_Term();
			rr.components = rrSub.components;
		} catch (BreakException bex) {
			rr = new RuleResult();
			rr.result = new NullV_0_Term();
			rr.components = bex.getComponents();
		}
		return rr;
	}

}
