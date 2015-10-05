package ds.manual.interpreter;

import org.metaborg.meta.interpreter.framework.InterpreterException;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.source.SourceSection;

import ds.generated.interpreter.A_Expr;
import ds.generated.interpreter.A_FunDef;
import ds.generated.interpreter.A_Program;
import ds.generated.interpreter.A_traversal;
import ds.generated.interpreter.L_A_Expr;
import ds.generated.interpreter.L_A_FunDef;
import ds.generated.interpreter.L_A_ID;
import ds.generated.interpreter.R_desugar_traversal;

public class alltd_1 extends A_traversal {

	@Child private A_Program p;

	public alltd_1(SourceSection src, A_Program p) {
		super(src);
		this.p = p;
	}

	@Override
	public IStrategoTerm toStrategoTerm(ITermFactory factory) {
		return factory.makeAppl(factory.makeConstructor("innermost", 1),
				p.toStrategoTerm(factory));
	}

	@Override
	public R_desugar_traversal execute_desugar(VirtualFrame frame) {
		A_Program pnew = (A_Program) alltdDesugar(frame, p);
		return new R_desugar_traversal(new alltd_1(getSourceSection(), pnew));
	}

	public A_Program get_1() {
		return p;
	}

	private static Node alltdDesugar(VirtualFrame frame, Node node) {
		System.out.println("Desugaring " + node + " of class "
				+ node.getClass().getName());
		Node newNode = null;
		try {
			if (node instanceof A_Program) {
				newNode = ((A_Program) node).execute_desugar(frame).value;
			} else if (node instanceof A_FunDef) {
				newNode = ((A_FunDef) node).execute_desugar(frame).value;
			} else if (node instanceof A_Expr) {
				newNode = ((A_Expr) node).execute_desugar(frame).value;
			} else if (node instanceof L_A_FunDef) {
				newNode = ((L_A_FunDef) node).execute_desugar(frame).value;
			} else if (node instanceof L_A_ID) {
				newNode = ((L_A_ID) node).execute_desugar(frame).value;
			} else if (node instanceof L_A_Expr) {
				newNode = ((L_A_Expr) node).execute_desugar(frame).value;
			}
		} catch (InterpreterException iex) {
			System.out.println("desugar failed due to " + iex.getMessage());
		}

		if (node.getParent() != null && newNode != null) {
			System.out.println("Replacing with node " + newNode + " of class "
					+ newNode.getClass().getName());
			node.replace(newNode);
		}
		if (newNode == null) {
			newNode = node;
		}
		for (Node n : newNode.getChildren()) {
			alltdDesugar(frame, n);
		}

		return newNode;

	}
}
