package ds.manual.interpreter;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;

import com.github.krukow.clj_ds.PersistentMap;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

import ds.generated.interpreter.A_C;
import ds.generated.interpreter.A_Stmt;
import ds.generated.interpreter.A_V;
import ds.generated.interpreter.R_default_U;

public class onContinue_1 extends A_Stmt {

	@Child private A_Stmt stmt;

	public onContinue_1(SourceSection src, A_Stmt stmt) {
		super(src);
		this.stmt = stmt;
	}

	@Override
	public R_default_U execute_default(VirtualFrame frame, A_C ctx,
			PersistentMap<String, A_V> env) {
		try {
			return stmt.execute_default(frame, ctx, env);
		} catch (ContinueException cex) {
			return stmt.execute_default(frame, ctx, cex.getEnv());
		}
	}

	@Override
	public IStrategoTerm toStrategoTerm(ITermFactory factory) {
		return stmt.toStrategoTerm(factory);
	}

}
