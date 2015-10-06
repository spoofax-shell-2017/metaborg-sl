package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Empty$Block_0_0 extends Strategy {
	public static $Empty$Block_0_0 instance = new $Empty$Block_0_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		Fail46: {
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consEmptyBlock_0 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail46;
			if (true)
				return term;
		}
		context.push("EmptyBlock_0_0");
		context.popOnFailure();
		return null;
	}
}