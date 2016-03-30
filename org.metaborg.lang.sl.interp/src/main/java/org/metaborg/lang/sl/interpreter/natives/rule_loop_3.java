package org.metaborg.lang.sl.interpreter.natives;

import org.metaborg.lang.sl.interpreter.generated.TypesGen;
import org.metaborg.lang.sl.interpreter.generated.terms.IStmtTerm;
import org.metaborg.lang.sl.interpreter.generated.terms.U_0_Term;
import org.metaborg.lang.sl.interpreter.generated.terms.expandBoolV_1_Term;
import org.metaborg.meta.lang.dynsem.interpreter.DynSemContext;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleRoot;
import org.metaborg.meta.lang.dynsem.interpreter.terms.BuiltinTypesGen;

import com.oracle.truffle.api.CompilerAsserts;
import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.api.source.SourceSection;

public class rule_loop_3 extends Rule {

	public rule_loop_3() {
		super(SourceSection.createUnavailable("Rule", "loop"));
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
		return 3;
	}

	@Override
	public String getConstructor() {
		return "loop";
	}

	@Override
	public String getName() {
		return "default";
	}

	@Override
	public RuleResult execute(VirtualFrame frame) {
		Object[] args = frame.getArguments();
		// loop node: args[0]
		// condition expression to eval to boolean: args[1]
		// boolean value to check against: args[2]
		// one statement to execute: args[3]
		// C: args[4]
		// E: args[5]

		DynSemContext context = getContext();
		IStmtTerm stmt;
		try {
			stmt = TypesGen.expectIStmtTerm(args[3]);
		} catch (UnexpectedResultException e) {
			CompilerDirectives.transferToInterpreterAndInvalidate();
			throw new RuntimeException(e);
		}

		RuleRoot rr = context.getRuleRegistry().lookupRule("default",
				stmt.constructor(), stmt.arity());

		// while (evaluateCondition(args)) {
		Object[] args2 = Rule.buildArguments(stmt, stmt.allSubterms(),
				new Object[] { args[4], args[5] });
		// Object[] args2 = Rule.buildArguments(stmt, stmt.allSubterms(),
		// Arrays.copyOfRange(args, args.length - 2, args.length));

		RuleResult res = (RuleResult) rr.getCallTarget().call(args2);
		args[4] = res.components[0];
		args[5] = res.components[1];

		// Object[] comps = res.components;
		//
		// System.arraycopy(comps, 0, args, args.length - 2, 2);
		// }

		return new RuleResult(new U_0_Term(), args);
	}

	private boolean evaluateCondition(Object[] args) {
		CompilerAsserts.compilationConstant(args[1]);
		CompilerAsserts.compilationConstant(args[2]);

		expandBoolV_1_Term cExpr;
		try {
			cExpr = TypesGen.expectexpandBoolV_1_Term(args[1]);
			DynSemContext context = getContext();

			RuleRoot rr = context.getRuleRegistry().lookupRule("default",
					expandBoolV_1_Term.CONSTRUCTOR, expandBoolV_1_Term.ARITY);

			Object[] args2 = Rule.buildArguments(cExpr, cExpr.allSubterms(),
					new Object[] { args[4], args[5] });
			// Object[] args2 = Rule.buildArguments(cExpr, cExpr.allSubterms(),
			// Arrays.copyOfRange(args, args.length - 2, args.length));

			RuleResult res = (RuleResult) rr.getCallTarget().call(args2);
			// Object[] comps = res.components;
			args[4] = res.components[0];
			args[5] = res.components[1];

			// System.arraycopy(comps, 0, args, args.length - 2, 2);

			return BuiltinTypesGen.expectBoolean(res.result) == BuiltinTypesGen
					.expectBoolean(args[2]);
		} catch (UnexpectedResultException e) {
			CompilerDirectives.transferToInterpreterAndInvalidate();
			throw new RuntimeException(e);
		}
	}

}
