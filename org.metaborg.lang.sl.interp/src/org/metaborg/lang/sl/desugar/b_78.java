package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.SRTS_all;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
final class b_78 extends Strategy {
	public static final b_78 instance = new b_78();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy d_78) {
		Fail80: {
			lifted0 lifted00 = new lifted0();
			lifted00.d_78 = d_78;
			term = SRTS_all.instance.invoke(context, term, lifted00);
			if (term == null)
				break Fail80;
			term = d_78.invoke(context, term);
			if (term == null)
				break Fail80;
			if (true)
				return term;
		}
		return null;
	}
}