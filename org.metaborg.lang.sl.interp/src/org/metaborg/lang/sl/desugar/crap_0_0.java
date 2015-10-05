package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class crap_0_0 extends Strategy {
	public static crap_0_0 instance = new crap_0_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		Fail17: {
			if (true)
				break Fail17;
			if (true)
				return term;
		}
		context.push("crap_0_0");
		context.popOnFailure();
		return null;
	}
}