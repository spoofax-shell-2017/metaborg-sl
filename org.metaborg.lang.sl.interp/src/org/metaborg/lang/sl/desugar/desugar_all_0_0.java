package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;
import org.strategoxt.stratego_lib.alltd_1_0;

@SuppressWarnings("all")
public class desugar_all_0_0 extends Strategy {
	public static desugar_all_0_0 instance = new desugar_all_0_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		context.push("desugar_all_0_0");
		Fail2: {
			term = v_78.instance.invoke(context, term, w_78.instance);
			if (term == null)
				break Fail2;
			term = alltd_1_0.instance.invoke(context, term, lifted1.instance);
			if (term == null)
				break Fail2;
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}