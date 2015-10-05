package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $While_2_0 extends Strategy {
	public static $While_2_0 instance = new $While_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy w_5, Strategy x_5) {
		ITermFactory termFactory = context.getFactory();
		context.push("While_2_0");
		Fail46: {
			IStrategoTerm j_73 = null;
			IStrategoTerm h_73 = null;
			IStrategoTerm i_73 = null;
			IStrategoTerm k_73 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consWhile_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail46;
			h_73 = term.getSubterm(0);
			i_73 = term.getSubterm(1);
			IStrategoList annos25 = term.getAnnotations();
			j_73 = annos25;
			term = w_5.invoke(context, h_73);
			if (term == null)
				break Fail46;
			k_73 = term;
			term = x_5.invoke(context, i_73);
			if (term == null)
				break Fail46;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consWhile_2, new IStrategoTerm[] { k_73, term }),
					checkListAnnos(termFactory, j_73));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}