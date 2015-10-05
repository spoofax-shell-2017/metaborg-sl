package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Lte_2_0 extends Strategy {
	public static $Lte_2_0 instance = new $Lte_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy s_4, Strategy t_4) {
		ITermFactory termFactory = context.getFactory();
		context.push("Lte_2_0");
		Fail29: {
			IStrategoTerm l_70 = null;
			IStrategoTerm j_70 = null;
			IStrategoTerm k_70 = null;
			IStrategoTerm m_70 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consLte_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail29;
			j_70 = term.getSubterm(0);
			k_70 = term.getSubterm(1);
			IStrategoList annos9 = term.getAnnotations();
			l_70 = annos9;
			term = s_4.invoke(context, j_70);
			if (term == null)
				break Fail29;
			m_70 = term;
			term = t_4.invoke(context, k_70);
			if (term == null)
				break Fail29;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consLte_2, new IStrategoTerm[] { m_70, term }),
					checkListAnnos(termFactory, l_70));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}