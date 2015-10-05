package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class desugar_params_0_0 extends Strategy {
	public static desugar_params_0_0 instance = new desugar_params_0_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		ITermFactory termFactory = context.getFactory();
		context.push("desugar_params_0_0");
		Fail13: {
			IStrategoTerm term20 = term;
			Success10: {
				Fail14: {
					if (term.getTermType() != IStrategoTerm.LIST
							|| !((IStrategoList) term).isEmpty())
						break Fail14;
					term = desugar.constNoParamSeq0;
					if (true)
						break Success10;
				}
				term = term20;
				IStrategoTerm t_3 = null;
				IStrategoTerm u_3 = null;
				if (term.getTermType() != IStrategoTerm.LIST
						|| ((IStrategoList) term).isEmpty())
					break Fail13;
				t_3 = ((IStrategoList) term).head();
				u_3 = ((IStrategoList) term).tail();
				term = this.invoke(context, u_3);
				if (term == null)
					break Fail13;
				term = termFactory.makeAppl(desugar._consParamSeq_2,
						new IStrategoTerm[] { t_3, term });
			}
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}