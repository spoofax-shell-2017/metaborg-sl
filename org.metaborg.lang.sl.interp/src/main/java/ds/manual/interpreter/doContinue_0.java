package ds.manual.interpreter;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;

import com.github.krukow.clj_ds.PersistentMap;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

import ds.generated.interpreter.A_C;
import ds.generated.interpreter.A_ContinueHandler;
import ds.generated.interpreter.A_V;
import ds.generated.interpreter.R_default_U;

public class doContinue_0 extends A_ContinueHandler {

	public doContinue_0(SourceSection src) {
		super(src);
	}

	public R_default_U execute_default(VirtualFrame frame, A_C ctx,
			PersistentMap<String, A_V> env) {
		throw new ContinueException(ctx, env);
	}

	@Override
	public IStrategoTerm toStrategoTerm(ITermFactory factory) {
		return factory.makeAppl(factory.makeConstructor("doContinue", 0));
	}

}
