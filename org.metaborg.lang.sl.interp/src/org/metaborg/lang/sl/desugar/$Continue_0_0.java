package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Continue_0_0 extends Strategy {
	public static $Continue_0_0 instance = new $Continue_0_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		Fail52: {
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consContinue_0 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail52;
			if (true)
				return term;
		}
		context.push("Continue_0_0");
		context.popOnFailure();
		return null;
	}
}