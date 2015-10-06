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
			Strategy u_5, Strategy v_5) {
		ITermFactory termFactory = context.getFactory();
		context.push("Or_2_0");
		Fail37: {
			IStrategoTerm f_72 = null;
			IStrategoTerm d_72 = null;
			IStrategoTerm e_72 = null;
			IStrategoTerm g_72 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consOr_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail37;
			d_72 = term.getSubterm(0);
			e_72 = term.getSubterm(1);
			IStrategoList annos15 = term.getAnnotations();
			f_72 = annos15;
			term = u_5.invoke(context, d_72);
			if (term == null)
				break Fail37;
			g_72 = term;
			term = v_5.invoke(context, e_72);
			if (term == null)
				break Fail37;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consOr_2, new IStrategoTerm[] { g_72, term }),
					checkListAnnos(termFactory, f_72));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}