package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Eq_2_0 extends Strategy {
	public static $Eq_2_0 instance = new $Eq_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy g_5, Strategy h_5) {
		ITermFactory termFactory = context.getFactory();
		context.push("Eq_2_0");
		Fail30: {
			IStrategoTerm w_70 = null;
			IStrategoTerm u_70 = null;
			IStrategoTerm v_70 = null;
			IStrategoTerm x_70 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consEq_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail30;
			u_70 = term.getSubterm(0);
			v_70 = term.getSubterm(1);
			IStrategoList annos8 = term.getAnnotations();
			w_70 = annos8;
			term = g_5.invoke(context, u_70);
			if (term == null)
				break Fail30;
			x_70 = term;
			term = h_5.invoke(context, v_70);
			if (term == null)
				break Fail30;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consEq_2, new IStrategoTerm[] { x_70, term }),
					checkListAnnos(termFactory, w_70));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}