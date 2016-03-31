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
import org.metaborg.meta.lang.dynsem.interpreter.terms.IConTerm;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.DirectCallNode;
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
		try {
			return executeSafe(frame);
		} catch (UnexpectedResultException e) {
			CompilerDirectives.transferToInterpreterAndInvalidate();
			throw new RuntimeException(e);
		}
	}

	private RuleResult executeSafe(VirtualFrame frame)
			throws UnexpectedResultException {
		Object[] args = frame.getArguments();
		DynSemContext context = getContext();

		expandBoolV_1_Term cExpr = TypesGen.expectexpandBoolV_1_Term(args[1]);
		RuleRoot crr = context.getRuleRegistry().lookupRule("default",
				expandBoolV_1_Term.CONSTRUCTOR, expandBoolV_1_Term.ARITY);

		Object[] args2 = Rule.buildArguments(cExpr, cExpr.allSubterms(),
				new Object[] { args[4], args[5] });
		DirectCallNode ccallNode = DirectCallNode.create(crr.getCallTarget());
		RuleResult cr = (RuleResult) ccallNode.call(frame, args2);

		if (BuiltinTypesGen.expectBoolean(cr.result)) {
			IStmtTerm stmt = TypesGen.expectIStmtTerm(args[3]);
			RuleRoot srr = context.getRuleRegistry().lookupRule("default",
					stmt.constructor(), stmt.arity());

			Object[] args3 = Rule.buildArguments(stmt, stmt.allSubterms(),
					new Object[] { cr.components[0], cr.components[1] });
			DirectCallNode scallNode = DirectCallNode.create(srr
					.getCallTarget());
			RuleResult sr = (RuleResult) scallNode.call(frame, args3);

			IConTerm recTerm = BuiltinTypesGen.expectIConTerm(args[0]);

			Object[] args4 = Rule.buildArguments(recTerm,
					recTerm.allSubterms(), new Object[] { sr.components[0],
							sr.components[1] });
			RuleRoot wrr = context.getRuleRegistry().lookupRule("default",
					getConstructor(), getArity());

			DirectCallNode wcallNode = DirectCallNode.create(wrr
					.getCallTarget());
			return (RuleResult) wcallNode.call(frame, args4);
		} else {
			return new RuleResult(new U_0_Term(), new Object[] {
					cr.components[0], cr.components[1] });
		}

	}
}
