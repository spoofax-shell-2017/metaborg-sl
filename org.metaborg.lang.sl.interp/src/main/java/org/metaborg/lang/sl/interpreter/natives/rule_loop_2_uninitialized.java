package org.metaborg.lang.sl.interpreter.natives;

import org.metaborg.lang.sl.interpreter.generated.TypesGen;
import org.metaborg.lang.sl.interpreter.generated.terms.IStmtTerm;
import org.metaborg.lang.sl.interpreter.generated.terms.U_0_Term;
import org.metaborg.lang.sl.interpreter.generated.terms.expandBoolV_1_Term;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.ArgRead;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.ChildAccessTermBuild;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleRoot;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.premises.reduction.RelationDispatch;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.premises.reduction.RelationInvocationNode;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.premises.reduction.RelationPremiseInputBuilder;
import org.metaborg.meta.lang.dynsem.interpreter.terms.BuiltinTypesGen;
import org.metaborg.meta.lang.dynsem.interpreter.terms.ITerm;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.dsl.UnsupportedSpecializationException;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.LoopNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeUtil;
import com.oracle.truffle.api.nodes.RepeatingNode;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.api.source.SourceSection;

public class rule_loop_2_uninitialized extends Rule {

	public rule_loop_2_uninitialized() {
		super(SourceSection.createUnavailable("Rule", "loop"));
	}

	@Override
	public int getArity() {
		return 2;
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
		CompilerDirectives.transferToInterpreterAndInvalidate();
		SourceSection ss = this.getSourceSection();

		final ITerm redTerm = BuiltinTypesGen.asITerm(frame.getArguments()[0]);
		final Object[] termKids = redTerm.allSubterms();

		final ITerm condTerm = TypesGen.asexpandBoolV_1_Term(termKids[0]);
		final IStmtTerm stmtTerm = TypesGen.asIStmtTerm(termKids[1]);

		RuleRoot condRR = getContext().getRuleRegistry().lookupRule("default",
				expandBoolV_1_Term.CONSTRUCTOR, expandBoolV_1_Term.ARITY);

		RelationPremiseInputBuilder condInputBuilder = new RelationPremiseInputBuilder(
				new ChildAccessTermBuild(0, ss), new TermBuild[] {
						new ArgRead(1, ss), new ArgRead(2, ss) }, ss);

		RelationDispatch condDispatch = new RelationDispatch.InlinedRelationDispatch(
				NodeUtil.cloneNode(condRR.getRule()),
				condRR.getFrameDescriptor(), ss);

		RelationInvocationNode condInvocationNode = new RelationInvocationNode(
				condInputBuilder, condDispatch, ss);

		RuleRoot bodyRR = getContext().getRuleRegistry().lookupRule("default",
				stmtTerm.constructor(), stmtTerm.arity());

		RelationPremiseInputBuilder bodyInputBuilder = new RelationPremiseInputBuilder(
				new ChildAccessTermBuild(1, ss), new TermBuild[] {
						new ArgRead(1, ss), new ArgRead(2, ss) }, ss);

		RelationDispatch bodyDispatch = new RelationDispatch.InlinedRelationDispatch(
				NodeUtil.cloneNode(bodyRR.getRule()),
				bodyRR.getFrameDescriptor(), ss);

		RelationInvocationNode bodyInvocationNode = new RelationInvocationNode(
				bodyInputBuilder, bodyDispatch, ss);

		return replace(
				new rule_loop_2_initialized(condInvocationNode,
						bodyInvocationNode)).execute(frame);
	}

	private class rule_loop_2_initialized extends rule_loop_2_uninitialized {

		@Child private LoopNode loopNode;

		public rule_loop_2_initialized(RelationInvocationNode condInvocation,
				RelationInvocationNode bodyInvocation) {
			super();
			this.loopNode = Truffle.getRuntime().createLoopNode(
					new loop_2_repeatingnode(condInvocation, bodyInvocation));
		}

		@Override
		public RuleResult execute(VirtualFrame frame) {
			Object[] args = frame.getArguments();
			loopNode.executeLoop(frame);
			return new RuleResult(new U_0_Term(), new Object[] { args[1],
					args[2] });
		}

	}

	private class loop_2_repeatingnode extends Node implements RepeatingNode {

		@Child private RelationInvocationNode condInvocation;
		@Child private RelationInvocationNode bodyInvocation;

		public loop_2_repeatingnode(RelationInvocationNode condInvocation,
				RelationInvocationNode bodyInvocation) {
			super();
			this.condInvocation = condInvocation;
			this.bodyInvocation = bodyInvocation;
		}

		@Override
		public boolean executeRepeating(VirtualFrame frame) {
			Object[] args = frame.getArguments();
			if (evaluateCondition(frame)) {
				// evaluate body
				RuleResult bodyRes = bodyInvocation.execute(frame);
				args[1] = bodyRes.components[0];
				args[2] = bodyRes.components[1];
				return true;
			}
			return false;
		}

		private boolean evaluateCondition(VirtualFrame frame) {
			RuleResult condRes = condInvocation.execute(frame);

			// update the semantic components into the frame
			Object[] args = frame.getArguments();
			args[1] = condRes.components[0];
			args[2] = condRes.components[1];

			try {
				return BuiltinTypesGen.expectBoolean(condRes.result);
			} catch (UnexpectedResultException ex) {
				throw new UnsupportedSpecializationException(this,
						new Node[] { condInvocation }, ex.getResult());
			}
		}

	}

}
