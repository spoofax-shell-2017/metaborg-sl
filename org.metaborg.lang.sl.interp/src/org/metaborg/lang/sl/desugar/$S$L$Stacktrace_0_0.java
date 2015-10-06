package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $S$L$Stacktrace_0_0 extends Strategy {
	public static $S$L$Stacktrace_0_0 instance = new $S$L$Stacktrace_0_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		Fail70: {
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consSLStacktrace_0 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail70;
			if (true)
				return term;
		}
		context.push("SLStacktrace_0_0");
		context.popOnFailure();
		return null;
	}
}