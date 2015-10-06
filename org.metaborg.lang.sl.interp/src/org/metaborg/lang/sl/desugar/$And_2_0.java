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
			Strategy s_5, Strategy t_5) {
		ITermFactory termFactory = context.getFactory();
		context.push("And_2_0");
		Fail36: {
			IStrategoTerm a_72 = null;
			IStrategoTerm y_71 = null;
			IStrategoTerm z_71 = null;
			IStrategoTerm b_72 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consAnd_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail36;
			y_71 = term.getSubterm(0);
			z_71 = term.getSubterm(1);
			IStrategoList annos14 = term.getAnnotations();
			a_72 = annos14;
			term = s_5.invoke(context, y_71);
			if (term == null)
				break Fail36;
			b_72 = term;
			term = t_5.invoke(context, z_71);
			if (term == null)
				break Fail36;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consAnd_2, new IStrategoTerm[] { b_72, term }),
					checkListAnnos(termFactory, a_72));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}