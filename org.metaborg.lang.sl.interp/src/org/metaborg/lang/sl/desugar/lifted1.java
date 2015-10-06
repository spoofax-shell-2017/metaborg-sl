package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;
import org.strategoxt.stratego_lib.unquote_1_0;

@SuppressWarnings("all")
final class lifted1 extends Strategy {
	public static final lifted1 instance = new lifted1();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		Fail85: {
			term = unquote_1_0.instance.invoke(context, term, lifted2.instance);
			if (term == null)
				break Fail85;
			if (true)
				return term;
		}
		return null;
	}
}