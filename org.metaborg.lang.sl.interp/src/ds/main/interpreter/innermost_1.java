package ds.main.interpreter;

import java.util.Stack;

import org.metaborg.meta.interpreter.framework.InterpreterException;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeUtil;
import com.oracle.truffle.api.nodes.NodeVisitor;
import com.oracle.truffle.api.source.SourceSection;

import ds.generated.interpreter.A_Expr;
import ds.generated.interpreter.A_FunDef;
import ds.generated.interpreter.A_Program;
import ds.generated.interpreter.A_traversal;
import ds.generated.interpreter.L_A_Expr;
import ds.generated.interpreter.L_A_FunDef;
import ds.generated.interpreter.L_A_ID;
import ds.generated.interpreter.R_desugar_traversal;

public class innermost_1 extends A_traversal {

	@Child private A_Program p;

	public innermost_1(SourceSection src, A_Program p) {
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
		/*
		 * go to the leaves, remember on the way what we have visited. on the
		 * way up apply the transformation. if that succeeds start descending on
		 * the newly produced tree
		 */

		NodeStackBuilderVisitor visitor = new NodeStackBuilderVisitor();
		p.accept(visitor);
		Stack<Node> nodeStack = visitor.nodeStack;
		while (nodeStack.peek() != null) {
			Node node = nodeStack.pop();

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
				;
			}
			if (newNode != null) {
				NodeUtil.replaceChild(node.getParent(), node, newNode);
				newNode.accept(visitor);
			}
		}

		return new R_desugar_traversal(this);
	}

	private class NodeStackBuilderVisitor implements NodeVisitor {

		public Stack<Node> nodeStack = new Stack<Node>();

		@Override
		public boolean visit(Node node) {
			nodeStack.push(node);
			return true;
		}
	}

	public A_Program get_1() {
		return p;
	}

}
