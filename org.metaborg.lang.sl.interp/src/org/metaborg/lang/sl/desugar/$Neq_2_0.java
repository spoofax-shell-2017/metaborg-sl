package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Neq_2_0 extends Strategy {
	public static $Neq_2_0 instance = new $Neq_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy m_5, Strategy n_5) {
		ITermFactory termFactory = context.getFactory();
		context.push("Neq_2_0");
		Fail33: {
			IStrategoTerm l_71 = null;
			IStrategoTerm j_71 = null;
			IStrategoTerm k_71 = null;
			IStrategoTerm m_71 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consNeq_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail33;
			j_71 = term.getSubterm(0);
			k_71 = term.getSubterm(1);
			IStrategoList annos11 = term.getAnnotations();
			l_71 = annos11;
			term = m_5.invoke(context, j_71);
			if (term == null)
				break Fail33;
			m_71 = term;
			term = n_5.invoke(context, k_71);
			if (term == null)
				break Fail33;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consNeq_2, new IStrategoTerm[] { m_71, term }),
					checkListAnnos(termFactory, l_71));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}