package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Return$Void_0_0 extends Strategy {
	public static $Return$Void_0_0 instance = new $Return$Void_0_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		Fail50: {
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consReturnVoid_0 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail50;
			if (true)
				return term;
		}
		context.push("ReturnVoid_0_0");
		context.popOnFailure();
		return null;
	}
}