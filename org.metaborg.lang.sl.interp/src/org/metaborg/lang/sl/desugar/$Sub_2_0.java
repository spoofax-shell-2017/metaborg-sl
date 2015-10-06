package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Sub_2_0 extends Strategy {
	public static $Sub_2_0 instance = new $Sub_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy e_5, Strategy f_5) {
		ITermFactory termFactory = context.getFactory();
		context.push("Sub_2_0");
		Fail29: {
			IStrategoTerm r_70 = null;
			IStrategoTerm p_70 = null;
			IStrategoTerm q_70 = null;
			IStrategoTerm s_70 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consSub_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail29;
			p_70 = term.getSubterm(0);
			q_70 = term.getSubterm(1);
			IStrategoList annos7 = term.getAnnotations();
			r_70 = annos7;
			term = e_5.invoke(context, p_70);
			if (term == null)
				break Fail29;
			s_70 = term;
			term = f_5.invoke(context, q_70);
			if (term == null)
				break Fail29;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consSub_2, new IStrategoTerm[] { s_70, term }),
					checkListAnnos(termFactory, r_70));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}