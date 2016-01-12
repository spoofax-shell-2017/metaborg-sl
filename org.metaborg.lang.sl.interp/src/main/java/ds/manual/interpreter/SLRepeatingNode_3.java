package ds.manual.interpreter;

import org.metaborg.meta.interpreter.framework.InterpreterException;
import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;

import com.github.krukow.clj_ds.PersistentMap;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameSlotTypeException;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.LoopNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.RepeatingNode;
import com.oracle.truffle.api.source.SourceSection;

import ds.generated.interpreter.A_Block;
import ds.generated.interpreter.A_C;
import ds.generated.interpreter.A_Expr;
import ds.generated.interpreter.A_RepeatingNode;
import ds.generated.interpreter.A_Stmt;
import ds.generated.interpreter.A_V;
import ds.generated.interpreter.BoolV_1;
import ds.generated.interpreter.R_default_U;
import ds.generated.interpreter.R_default_V;
import ds.generated.interpreter.U_0;
import ds.generated.interpreter.__Block2Stmt___1;

public class SLRepeatingNode_3 extends A_RepeatingNode {

	@Child private LoopNode loopNode;

	public SLRepeatingNode_3(SourceSection src, A_Expr e, BoolV_1 v, A_Block b) {
		super(src);
		this.fd = new FrameDescriptor();
		this.inputSlot1 = fd.addFrameSlot("input1");
		this.inputSlot2 = fd.addFrameSlot("input2");
		this.outputSlot = fd.addFrameSlot("output");
		this.loopNode = Truffle.getRuntime().createLoopNode(
				new SLLoopNode(src, e, v, new __Block2Stmt___1(src, b)));
	}

	private FrameDescriptor fd;
	private FrameSlot inputSlot1, inputSlot2, outputSlot;

	@Override
	public R_default_U execute_default(VirtualFrame frame, A_C _1,
			PersistentMap<String, A_V> _2) {

		VirtualFrame calleeFrame = Truffle.getRuntime().createVirtualFrame(
				new Object[] {}, fd);

		calleeFrame.setObject(inputSlot1, _1);
		calleeFrame.setObject(inputSlot2, _2);

		System.out.println(getRootNode());

		loopNode.executeLoop(calleeFrame);

		try {
			return (R_default_U) calleeFrame.getObject(outputSlot);
		} catch (FrameSlotTypeException e) {
			System.out.println("Fail 1");
			throw new InterpreterException("Slot access failed", e);
		}
	}

	@Override
	public IStrategoTerm toStrategoTerm(ITermFactory factory) {
		IStrategoAppl term = factory.makeAppl(factory.makeConstructor(
				"SLRepeatingNode", 0));
		return term;
	}

	private class SLLoopNode extends Node implements RepeatingNode {
		@Child private A_Expr e;

		@Child private BoolV_1 v;

		@Child private A_Stmt b;

		public SLLoopNode(SourceSection src, A_Expr e, BoolV_1 v, A_Stmt b) {
			super(src);
			this.e = e;
			this.v = v;
			this.b = b;
		}

		@Override
		@SuppressWarnings("unchecked")
		public boolean executeRepeating(VirtualFrame frame) {
			try {
				A_C _1 = (A_C) frame.getObject(inputSlot1);

				PersistentMap<String, A_V> _2 = (PersistentMap<String, A_V>) frame
						.getObject(inputSlot2);

				R_default_V eres = e.execute_default(frame, _1, _2);
				if (eres.value.equals(v)) {
					R_default_U bres = b.execute_default(frame, eres.get_1(),
							eres.get_2());
					frame.setObject(inputSlot1, bres.get_1());
					frame.setObject(inputSlot2, bres.get_2());
					return true;
				} else {
					frame.setObject(outputSlot, new R_default_U(new U_0(
							getSourceSection()), _1, _2));
					return false;
				}
			} catch (FrameSlotTypeException e) {
				System.out.println("Fail 2");
				throw new InterpreterException("Slot access failure", e);
			}
		}
	}
}
