package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class desugar_funcs_0_0 extends Strategy {
	public static desugar_funcs_0_0 instance = new desugar_funcs_0_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		ITermFactory termFactory = context.getFactory();
		context.push("desugar_funcs_0_0");
		Fail11: {
			IStrategoTerm term19 = term;
			Success9: {
				Fail12: {
					if (term.getTermType() != IStrategoTerm.LIST
							|| !((IStrategoList) term).isEmpty())
						break Fail12;
					term = desugar.constNoFunDefSeq0;
					if (true)
						break Success9;
				}
				term = term19;
				IStrategoTerm p_3 = null;
				IStrategoTerm q_3 = null;
				if (term.getTermType() != IStrategoTerm.LIST
						|| ((IStrategoList) term).isEmpty())
					break Fail11;
				p_3 = ((IStrategoList) term).head();
				q_3 = ((IStrategoList) term).tail();
				term = this.invoke(context, q_3);
				if (term == null)
					break Fail11;
				term = termFactory.makeAppl(desugar._consFunDefSeq_2,
						new IStrategoTerm[] { p_3, term });
			}
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}