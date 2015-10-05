package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Break_0_0 extends Strategy {
	public static $Break_0_0 instance = new $Break_0_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		Fail51: {
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consBreak_0 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail51;
			if (true)
				return term;
		}
		context.push("Break_0_0");
		context.popOnFailure();
		return null;
	}
}