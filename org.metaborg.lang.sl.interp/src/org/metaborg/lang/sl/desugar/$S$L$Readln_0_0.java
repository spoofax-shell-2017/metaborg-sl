package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $S$L$Readln_0_0 extends Strategy {
	public static $S$L$Readln_0_0 instance = new $S$L$Readln_0_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		Fail67: {
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consSLReadln_0 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail67;
			if (true)
				return term;
		}
		context.push("SLReadln_0_0");
		context.popOnFailure();
		return null;
	}
}