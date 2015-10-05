package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class desugar_all_0_0 extends Strategy {
	public static desugar_all_0_0 instance = new desugar_all_0_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		context.push("desugar_all_0_0");
		Fail0: {
			term = b_78.instance.invoke(context, term, c_78.instance);
			if (term == null)
				break Fail0;
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}