package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Return_1_0 extends Strategy {
	public static $Return_1_0 instance = new $Return_1_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy d_6) {
		ITermFactory termFactory = context.getFactory();
		context.push("Return_1_0");
		Fail49: {
			IStrategoTerm z_73 = null;
			IStrategoTerm y_73 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consReturn_1 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail49;
			y_73 = term.getSubterm(0);
			IStrategoList annos28 = term.getAnnotations();
			z_73 = annos28;
			term = d_6.invoke(context, y_73);
			if (term == null)
				break Fail49;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consReturn_1, new IStrategoTerm[] { term }),
					checkListAnnos(termFactory, z_73));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}