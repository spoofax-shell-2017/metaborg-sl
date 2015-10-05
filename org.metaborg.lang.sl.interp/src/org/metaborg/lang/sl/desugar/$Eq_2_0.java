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
			Strategy q_4, Strategy r_4) {
		ITermFactory termFactory = context.getFactory();
		context.push("Eq_2_0");
		Fail28: {
			IStrategoTerm g_70 = null;
			IStrategoTerm e_70 = null;
			IStrategoTerm f_70 = null;
			IStrategoTerm h_70 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consEq_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail28;
			e_70 = term.getSubterm(0);
			f_70 = term.getSubterm(1);
			IStrategoList annos8 = term.getAnnotations();
			g_70 = annos8;
			term = q_4.invoke(context, e_70);
			if (term == null)
				break Fail28;
			h_70 = term;
			term = r_4.invoke(context, f_70);
			if (term == null)
				break Fail28;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consEq_2, new IStrategoTerm[] { h_70, term }),
					checkListAnnos(termFactory, g_70));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}