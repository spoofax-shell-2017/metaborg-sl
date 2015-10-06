package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Gte_2_0 extends Strategy {
	public static $Gte_2_0 instance = new $Gte_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy o_5, Strategy p_5) {
		ITermFactory termFactory = context.getFactory();
		context.push("Gte_2_0");
		Fail34: {
			IStrategoTerm q_71 = null;
			IStrategoTerm o_71 = null;
			IStrategoTerm p_71 = null;
			IStrategoTerm r_71 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consGte_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail34;
			o_71 = term.getSubterm(0);
			p_71 = term.getSubterm(1);
			IStrategoList annos12 = term.getAnnotations();
			q_71 = annos12;
			term = o_5.invoke(context, o_71);
			if (term == null)
				break Fail34;
			r_71 = term;
			term = p_5.invoke(context, p_71);
			if (term == null)
				break Fail34;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consGte_2, new IStrategoTerm[] { r_71, term }),
					checkListAnnos(termFactory, q_71));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}