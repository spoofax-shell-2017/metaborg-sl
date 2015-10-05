package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Method$Call$Desug_3_0 extends Strategy {
	public static $Method$Call$Desug_3_0 instance = new $Method$Call$Desug_3_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy r_6, Strategy s_6, Strategy t_6) {
		ITermFactory termFactory = context.getFactory();
		context.push("MethodCallDesug_3_0");
		Fail62: {
			IStrategoTerm k_75 = null;
			IStrategoTerm h_75 = null;
			IStrategoTerm i_75 = null;
			IStrategoTerm j_75 = null;
			IStrategoTerm l_75 = null;
			IStrategoTerm m_75 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consMethodCallDesug_3 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail62;
			h_75 = term.getSubterm(0);
			i_75 = term.getSubterm(1);
			j_75 = term.getSubterm(2);
			IStrategoList annos35 = term.getAnnotations();
			k_75 = annos35;
			term = r_6.invoke(context, h_75);
			if (term == null)
				break Fail62;
			l_75 = term;
			term = s_6.invoke(context, i_75);
			if (term == null)
				break Fail62;
			m_75 = term;
			term = t_6.invoke(context, j_75);
			if (term == null)
				break Fail62;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consMethodCallDesug_3, new IStrategoTerm[] { l_75,
							m_75, term }), checkListAnnos(termFactory, k_75));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}