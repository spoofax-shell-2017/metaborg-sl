package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Lt_2_0 extends Strategy {
	public static $Lt_2_0 instance = new $Lt_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy u_4, Strategy v_4) {
		ITermFactory termFactory = context.getFactory();
		context.push("Lt_2_0");
		Fail30: {
			IStrategoTerm q_70 = null;
			IStrategoTerm o_70 = null;
			IStrategoTerm p_70 = null;
			IStrategoTerm r_70 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consLt_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail30;
			o_70 = term.getSubterm(0);
			p_70 = term.getSubterm(1);
			IStrategoList annos10 = term.getAnnotations();
			q_70 = annos10;
			term = u_4.invoke(context, o_70);
			if (term == null)
				break Fail30;
			r_70 = term;
			term = v_4.invoke(context, p_70);
			if (term == null)
				break Fail30;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consLt_2, new IStrategoTerm[] { r_70, term }),
					checkListAnnos(termFactory, q_70));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}