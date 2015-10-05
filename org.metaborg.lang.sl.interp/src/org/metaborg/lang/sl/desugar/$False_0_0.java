package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $False_0_0 extends Strategy {
	public static $False_0_0 instance = new $False_0_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		Fail23: {
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consFalse_0 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail23;
			if (true)
				return term;
		}
		context.push("False_0_0");
		context.popOnFailure();
		return null;
	}
}