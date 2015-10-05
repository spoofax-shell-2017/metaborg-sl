package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Gt_2_0 extends Strategy {
	public static $Gt_2_0 instance = new $Gt_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy a_5, Strategy b_5) {
		ITermFactory termFactory = context.getFactory();
		context.push("Gt_2_0");
		Fail33: {
			IStrategoTerm f_71 = null;
			IStrategoTerm d_71 = null;
			IStrategoTerm e_71 = null;
			IStrategoTerm g_71 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consGt_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail33;
			d_71 = term.getSubterm(0);
			e_71 = term.getSubterm(1);
			IStrategoList annos13 = term.getAnnotations();
			f_71 = annos13;
			term = a_5.invoke(context, d_71);
			if (term == null)
				break Fail33;
			g_71 = term;
			term = b_5.invoke(context, e_71);
			if (term == null)
				break Fail33;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consGt_2, new IStrategoTerm[] { g_71, term }),
					checkListAnnos(termFactory, f_71));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}