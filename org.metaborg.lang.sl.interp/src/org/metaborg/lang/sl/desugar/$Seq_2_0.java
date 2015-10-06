package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Seq_2_0 extends Strategy {
	public static $Seq_2_0 instance = new $Seq_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy j_6, Strategy k_6) {
		ITermFactory termFactory = context.getFactory();
		context.push("Seq_2_0");
		Fail45: {
			IStrategoTerm r_73 = null;
			IStrategoTerm p_73 = null;
			IStrategoTerm q_73 = null;
			IStrategoTerm s_73 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consSeq_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail45;
			p_73 = term.getSubterm(0);
			q_73 = term.getSubterm(1);
			IStrategoList annos23 = term.getAnnotations();
			r_73 = annos23;
			term = j_6.invoke(context, p_73);
			if (term == null)
				break Fail45;
			s_73 = term;
			term = k_6.invoke(context, q_73);
			if (term == null)
				break Fail45;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consSeq_2, new IStrategoTerm[] { s_73, term }),
					checkListAnnos(termFactory, r_73));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}