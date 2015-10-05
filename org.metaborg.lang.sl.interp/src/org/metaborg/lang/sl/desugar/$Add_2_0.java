package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Add_2_0 extends Strategy {
	public static $Add_2_0 instance = new $Add_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy i_4, Strategy j_4) {
		ITermFactory termFactory = context.getFactory();
		context.push("Add_2_0");
		Fail24: {
			IStrategoTerm m_69 = null;
			IStrategoTerm k_69 = null;
			IStrategoTerm l_69 = null;
			IStrategoTerm n_69 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consAdd_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail24;
			k_69 = term.getSubterm(0);
			l_69 = term.getSubterm(1);
			IStrategoList annos4 = term.getAnnotations();
			m_69 = annos4;
			term = i_4.invoke(context, k_69);
			if (term == null)
				break Fail24;
			n_69 = term;
			term = j_4.invoke(context, l_69);
			if (term == null)
				break Fail24;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consAdd_2, new IStrategoTerm[] { n_69, term }),
					checkListAnnos(termFactory, m_69));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}