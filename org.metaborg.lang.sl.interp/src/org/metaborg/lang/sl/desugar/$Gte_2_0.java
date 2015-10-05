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
			Strategy y_4, Strategy z_4) {
		ITermFactory termFactory = context.getFactory();
		context.push("Gte_2_0");
		Fail32: {
			IStrategoTerm a_71 = null;
			IStrategoTerm y_70 = null;
			IStrategoTerm z_70 = null;
			IStrategoTerm b_71 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consGte_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail32;
			y_70 = term.getSubterm(0);
			z_70 = term.getSubterm(1);
			IStrategoList annos12 = term.getAnnotations();
			a_71 = annos12;
			term = y_4.invoke(context, y_70);
			if (term == null)
				break Fail32;
			b_71 = term;
			term = z_4.invoke(context, z_70);
			if (term == null)
				break Fail32;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consGte_2, new IStrategoTerm[] { b_71, term }),
					checkListAnnos(termFactory, a_71));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}