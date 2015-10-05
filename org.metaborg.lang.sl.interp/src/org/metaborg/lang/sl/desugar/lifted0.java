package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
final class lifted0 extends Strategy {
	Strategy d_78;

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		Fail81: {
			term = b_78.instance.invoke(context, term, d_78);
			if (term == null)
				break Fail81;
			if (true)
				return term;
		}
		return null;
	}
}