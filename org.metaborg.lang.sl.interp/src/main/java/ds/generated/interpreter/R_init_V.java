package ds.generated.interpreter;

import org.metaborg.lang.sl.interp.SLProgramForeignAccess;
import org.metaborg.meta.interpreter.framework.IConvertibleToStrategoTerm;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;

import com.oracle.truffle.api.interop.ForeignAccess;
import com.oracle.truffle.api.interop.TruffleObject;

public class R_init_V implements IConvertibleToStrategoTerm, TruffleObject {
	public final A_V value;

	public R_init_V(A_V value) {
		this.value = value;
	}

	@Override
	public IStrategoTerm toStrategoTerm(ITermFactory factory) {
		return factory.makeAppl(factory.makeConstructor("R_init_V", 1),
				value.toStrategoTerm(factory));
	}

	@Override
	public ForeignAccess getForeignAccess() {
		return SLProgramForeignAccess.INSTANCE;
	}
}