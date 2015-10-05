package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Neq_2_0 extends Strategy {
	public static $Neq_2_0 instance = new $Neq_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy w_4, Strategy x_4) {
		ITermFactory termFactory = context.getFactory();
		context.push("Neq_2_0");
		Fail31: {
			IStrategoTerm v_70 = null;
			IStrategoTerm t_70 = null;
			IStrategoTerm u_70 = null;
			IStrategoTerm w_70 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consNeq_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail31;
			t_70 = term.getSubterm(0);
			u_70 = term.getSubterm(1);
			IStrategoList annos11 = term.getAnnotations();
			v_70 = annos11;
			term = w_4.invoke(context, t_70);
			if (term == null)
				break Fail31;
			w_70 = term;
			term = x_4.invoke(context, u_70);
			if (term == null)
				break Fail31;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consNeq_2, new IStrategoTerm[] { w_70, term }),
					checkListAnnos(termFactory, v_70));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}