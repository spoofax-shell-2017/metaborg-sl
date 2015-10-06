package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoInt;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
final class lifted2 extends Strategy {
	public static final lifted2 instance = new lifted2();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		Fail86: {
			if (term.getTermType() != IStrategoTerm.INT
					|| 34 != ((IStrategoInt) term).intValue())
				break Fail86;
			if (true)
				return term;
		}
		return null;
	}
}