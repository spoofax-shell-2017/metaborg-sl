package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Lt_2_0 extends Strategy {
	public static $Lt_2_0 instance = new $Lt_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy k_5, Strategy l_5) {
		ITermFactory termFactory = context.getFactory();
		context.push("Lt_2_0");
		Fail32: {
			IStrategoTerm g_71 = null;
			IStrategoTerm e_71 = null;
			IStrategoTerm f_71 = null;
			IStrategoTerm h_71 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consLt_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail32;
			e_71 = term.getSubterm(0);
			f_71 = term.getSubterm(1);
			IStrategoList annos10 = term.getAnnotations();
			g_71 = annos10;
			term = k_5.invoke(context, e_71);
			if (term == null)
				break Fail32;
			h_71 = term;
			term = l_5.invoke(context, f_71);
			if (term == null)
				break Fail32;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consLt_2, new IStrategoTerm[] { h_71, term }),
					checkListAnnos(termFactory, g_71));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}