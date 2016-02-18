package org.metaborg.lang.sl.interpreter.natives;

import metaborg.meta.lang.dynsem.interpreter.terms.BuiltinTypesGen;
import metaborg.meta.lang.dynsem.interpreter.terms.IConTerm;

import org.metaborg.lang.sl.interpreter.generated.terms.NullV_0_Term;
import org.metaborg.meta.lang.dynsem.interpreter.DynSemContext;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class rule_onReturn_1 extends Rule {

	public rule_onReturn_1() {
		super(SourceSection.createUnavailable("Rule", "onReturn"),
				FrameDescriptor.create());
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
		IConTerm stmt = BuiltinTypesGen.asIConTerm((frame.getArguments()[0]));
		DynSemContext context = DynSemContext.LANGUAGE
				.findContext0(DynSemContext.LANGUAGE.createFindContextNode0());

		Object[] args = new Object[stmt.arity() + 2]; // FIXME: need to
														// re-arrange the order
														// of things in the
														// arguments array
		System.arraycopy(stmt.allSubterms(), 0, args, 0, stmt.arity());
		Object[] myargs = frame.getArguments();

		args[args.length - 2] = myargs[myargs.length - 2];
		args[args.length - 1] = myargs[myargs.length - 1];

		Rule r = context.getRuleRegistry().lookupRule(getName(),
				stmt.constructor(), stmt.arity());
		RuleResult rr = null;
		try {
			CallTarget ct = r.getCallTarget();
			RuleResult rrSub = (RuleResult) ct.call(args);
			rr = new RuleResult();
			rr.result = new NullV_0_Term();
			rr.components = rrSub.components;
		} catch (ReturnException rex) {
			rr = rex.getResult();
		}
		return rr;
	}

}
