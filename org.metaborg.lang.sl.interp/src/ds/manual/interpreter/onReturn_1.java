package ds.manual.interpreter;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;

import com.github.krukow.clj_ds.PersistentMap;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

import ds.generated.interpreter.A_C;
import ds.generated.interpreter.A_ReturnHandler;
import ds.generated.interpreter.A_Stmt;
import ds.generated.interpreter.A_V;
import ds.generated.interpreter.NullV_0;
import ds.generated.interpreter.R_default_U;
import ds.generated.interpreter.R_default_V;

public class onReturn_1 extends A_ReturnHandler {

	@Child private A_Stmt stmt;

	public onReturn_1(SourceSection src, A_Stmt stmt) {
		super(src);
		this.stmt = stmt;
	}

	@Override
	public R_default_V execute_default(VirtualFrame frame, A_C ctx,
			PersistentMap<String, A_V> env) {
		try {
			R_default_U res = stmt.execute_default(frame, ctx, env);
			return new R_default_V(new NullV_0(getSourceSection()), res.get_1());
		} catch (ReturnException rex) {
			return new R_default_V(rex.getVal(), rex.getEnv());
		}
	}

	@Override
	public IStrategoTerm toStrategoTerm(ITermFactory factory) {
		return stmt.toStrategoTerm(factory);
	}

}
