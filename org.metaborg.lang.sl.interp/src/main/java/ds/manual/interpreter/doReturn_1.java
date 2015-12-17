package ds.manual.interpreter;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;

import com.github.krukow.clj_ds.PersistentMap;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

import ds.generated.interpreter.A_C;
import ds.generated.interpreter.A_ReturnHandler;
import ds.generated.interpreter.A_V;
import ds.generated.interpreter.R_default_V;

public class doReturn_1 extends A_ReturnHandler {

	@Child private A_V _1;

	public doReturn_1(SourceSection sourceSection, A_V _1) {
		super(sourceSection);
		this._1 = _1;
	}

	public R_default_V execute_default(VirtualFrame frame, A_C ctx,
			PersistentMap<String, A_V> env) {
		throw new ReturnException(_1, ctx, env);
	}

	@Override
	public IStrategoTerm toStrategoTerm(ITermFactory factory) {
		return factory.makeAppl(factory.makeConstructor("doReturn", 1),
				_1.toStrategoTerm(factory));
	}
}
