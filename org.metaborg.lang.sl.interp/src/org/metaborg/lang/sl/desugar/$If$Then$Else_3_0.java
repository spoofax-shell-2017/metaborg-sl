package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $If$Then$Else_3_0 extends Strategy {
	public static $If$Then$Else_3_0 instance = new $If$Then$Else_3_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy q_6, Strategy r_6, Strategy s_6) {
		ITermFactory termFactory = context.getFactory();
		context.push("IfThenElse_3_0");
		Fail50: {
			IStrategoTerm k_74 = null;
			IStrategoTerm h_74 = null;
			IStrategoTerm i_74 = null;
			IStrategoTerm j_74 = null;
			IStrategoTerm l_74 = null;
			IStrategoTerm m_74 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consIfThenElse_3 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail50;
			h_74 = term.getSubterm(0);
			i_74 = term.getSubterm(1);
			j_74 = term.getSubterm(2);
			IStrategoList annos27 = term.getAnnotations();
			k_74 = annos27;
			term = q_6.invoke(context, h_74);
			if (term == null)
				break Fail50;
			l_74 = term;
			term = r_6.invoke(context, i_74);
			if (term == null)
				break Fail50;
			m_74 = term;
			term = s_6.invoke(context, j_74);
			if (term == null)
				break Fail50;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consIfThenElse_3, new IStrategoTerm[] { l_74,
							m_74, term }), checkListAnnos(termFactory, k_74));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}