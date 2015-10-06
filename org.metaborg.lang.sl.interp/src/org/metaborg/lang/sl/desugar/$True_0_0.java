package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $True_0_0 extends Strategy {
	public static $True_0_0 instance = new $True_0_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		Fail24: {
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consTrue_0 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail24;
			if (true)
				return term;
		}
		context.push("True_0_0");
		context.popOnFailure();
		return null;
	}
}