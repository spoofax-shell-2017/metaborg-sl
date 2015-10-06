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
			Strategy q_5, Strategy r_5) {
		ITermFactory termFactory = context.getFactory();
		context.push("Gt_2_0");
		Fail35: {
			IStrategoTerm v_71 = null;
			IStrategoTerm t_71 = null;
			IStrategoTerm u_71 = null;
			IStrategoTerm w_71 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consGt_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail35;
			t_71 = term.getSubterm(0);
			u_71 = term.getSubterm(1);
			IStrategoList annos13 = term.getAnnotations();
			v_71 = annos13;
			term = q_5.invoke(context, t_71);
			if (term == null)
				break Fail35;
			w_71 = term;
			term = r_5.invoke(context, u_71);
			if (term == null)
				break Fail35;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consGt_2, new IStrategoTerm[] { w_71, term }),
					checkListAnnos(termFactory, v_71));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}