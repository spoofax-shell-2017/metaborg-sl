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
import ds.generated.interpreter.U_0;

public class onBreak_1 extends A_Stmt {

	@Child private A_Stmt _1;

	public onBreak_1(SourceSection src, A_Stmt stmt) {
		super(src);
		this._1 = stmt;
	}

	@Override
	public R_default_U execute_default(VirtualFrame frame, A_C ctx,
			PersistentMap<String, A_V> env) {
		try {
			return _1.execute_default(frame, ctx, env);
		} catch (BreakException bex) {
			return new R_default_U(new U_0(getSourceSection()),
					bex.getRootenv(), bex.getEnv());
		}
	}

	@Override
	public IStrategoTerm toStrategoTerm(ITermFactory factory) {
		return _1.toStrategoTerm(factory);
	}

}
