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
			Strategy m_6, Strategy n_6) {
		ITermFactory termFactory = context.getFactory();
		context.push("While_2_0");
		Fail48: {
			IStrategoTerm z_73 = null;
			IStrategoTerm x_73 = null;
			IStrategoTerm y_73 = null;
			IStrategoTerm a_74 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consWhile_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail48;
			x_73 = term.getSubterm(0);
			y_73 = term.getSubterm(1);
			IStrategoList annos25 = term.getAnnotations();
			z_73 = annos25;
			term = m_6.invoke(context, x_73);
			if (term == null)
				break Fail48;
			a_74 = term;
			term = n_6.invoke(context, y_73);
			if (term == null)
				break Fail48;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consWhile_2, new IStrategoTerm[] { a_74, term }),
					checkListAnnos(termFactory, z_73));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}