package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Div_2_0 extends Strategy {
	public static $Div_2_0 instance = new $Div_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy k_4, Strategy l_4) {
		ITermFactory termFactory = context.getFactory();
		context.push("Div_2_0");
		Fail25: {
			IStrategoTerm r_69 = null;
			IStrategoTerm p_69 = null;
			IStrategoTerm q_69 = null;
			IStrategoTerm s_69 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consDiv_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail25;
			p_69 = term.getSubterm(0);
			q_69 = term.getSubterm(1);
			IStrategoList annos5 = term.getAnnotations();
			r_69 = annos5;
			term = k_4.invoke(context, p_69);
			if (term == null)
				break Fail25;
			s_69 = term;
			term = l_4.invoke(context, q_69);
			if (term == null)
				break Fail25;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consDiv_2, new IStrategoTerm[] { s_69, term }),
					checkListAnnos(termFactory, r_69));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}