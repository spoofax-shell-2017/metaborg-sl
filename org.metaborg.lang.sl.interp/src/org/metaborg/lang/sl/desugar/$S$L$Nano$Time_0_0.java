package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $S$L$Nano$Time_0_0 extends Strategy {
	public static $S$L$Nano$Time_0_0 instance = new $S$L$Nano$Time_0_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		Fail66: {
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consSLNanoTime_0 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail66;
			if (true)
				return term;
		}
		context.push("SLNanoTime_0_0");
		context.popOnFailure();
		return null;
	}
}