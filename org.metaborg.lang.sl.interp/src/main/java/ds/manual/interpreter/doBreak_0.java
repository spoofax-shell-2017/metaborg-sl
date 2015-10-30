package ds.manual.interpreter;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;

import com.github.krukow.clj_ds.PersistentMap;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

import ds.generated.interpreter.A_BreakHandler;
import ds.generated.interpreter.A_C;
import ds.generated.interpreter.A_V;
import ds.generated.interpreter.R_default_U;

public class doBreak_0 extends A_BreakHandler {

	public doBreak_0(SourceSection src) {
		super(src);
	}

	public R_default_U execute_default(VirtualFrame frame, A_C ctx,
			PersistentMap<String, A_V> env) {
		throw new BreakException(ctx, env);
	}

	@Override
	public IStrategoTerm toStrategoTerm(ITermFactory factory) {
		return factory.makeAppl(factory.makeConstructor("doBreak", 0));
	}

}
