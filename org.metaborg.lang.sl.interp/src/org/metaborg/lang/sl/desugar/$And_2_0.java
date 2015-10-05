package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $And_2_0 extends Strategy {
	public static $And_2_0 instance = new $And_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy c_5, Strategy d_5) {
		ITermFactory termFactory = context.getFactory();
		context.push("And_2_0");
		Fail34: {
			IStrategoTerm k_71 = null;
			IStrategoTerm i_71 = null;
			IStrategoTerm j_71 = null;
			IStrategoTerm l_71 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consAnd_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail34;
			i_71 = term.getSubterm(0);
			j_71 = term.getSubterm(1);
			IStrategoList annos14 = term.getAnnotations();
			k_71 = annos14;
			term = c_5.invoke(context, i_71);
			if (term == null)
				break Fail34;
			l_71 = term;
			term = d_5.invoke(context, j_71);
			if (term == null)
				break Fail34;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consAnd_2, new IStrategoTerm[] { l_71, term }),
					checkListAnnos(termFactory, k_71));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}