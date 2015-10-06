package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Mul_2_0 extends Strategy {
	public static $Mul_2_0 instance = new $Mul_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy c_5, Strategy d_5) {
		ITermFactory termFactory = context.getFactory();
		context.push("Mul_2_0");
		Fail28: {
			IStrategoTerm m_70 = null;
			IStrategoTerm k_70 = null;
			IStrategoTerm l_70 = null;
			IStrategoTerm n_70 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consMul_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail28;
			k_70 = term.getSubterm(0);
			l_70 = term.getSubterm(1);
			IStrategoList annos6 = term.getAnnotations();
			m_70 = annos6;
			term = c_5.invoke(context, k_70);
			if (term == null)
				break Fail28;
			n_70 = term;
			term = d_5.invoke(context, l_70);
			if (term == null)
				break Fail28;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consMul_2, new IStrategoTerm[] { n_70, term }),
					checkListAnnos(termFactory, m_70));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}