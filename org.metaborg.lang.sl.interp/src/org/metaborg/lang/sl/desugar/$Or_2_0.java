package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Or_2_0 extends Strategy {
	public static $Or_2_0 instance = new $Or_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy e_5, Strategy f_5) {
		ITermFactory termFactory = context.getFactory();
		context.push("Or_2_0");
		Fail35: {
			IStrategoTerm p_71 = null;
			IStrategoTerm n_71 = null;
			IStrategoTerm o_71 = null;
			IStrategoTerm q_71 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consOr_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail35;
			n_71 = term.getSubterm(0);
			o_71 = term.getSubterm(1);
			IStrategoList annos15 = term.getAnnotations();
			p_71 = annos15;
			term = e_5.invoke(context, n_71);
			if (term == null)
				break Fail35;
			q_71 = term;
			term = f_5.invoke(context, o_71);
			if (term == null)
				break Fail35;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consOr_2, new IStrategoTerm[] { q_71, term }),
					checkListAnnos(termFactory, p_71));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}