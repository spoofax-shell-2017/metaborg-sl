package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Method$Call_3_0 extends Strategy {
	public static $Method$Call_3_0 instance = new $Method$Call_3_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy p_5, Strategy q_5, Strategy r_5) {
		ITermFactory termFactory = context.getFactory();
		context.push("MethodCall_3_0");
		Fail41: {
			IStrategoTerm s_72 = null;
			IStrategoTerm p_72 = null;
			IStrategoTerm q_72 = null;
			IStrategoTerm r_72 = null;
			IStrategoTerm t_72 = null;
			IStrategoTerm u_72 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consMethodCall_3 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail41;
			p_72 = term.getSubterm(0);
			q_72 = term.getSubterm(1);
			r_72 = term.getSubterm(2);
			IStrategoList annos21 = term.getAnnotations();
			s_72 = annos21;
			term = p_5.invoke(context, p_72);
			if (term == null)
				break Fail41;
			t_72 = term;
			term = q_5.invoke(context, q_72);
			if (term == null)
				break Fail41;
			u_72 = term;
			term = r_5.invoke(context, r_72);
			if (term == null)
				break Fail41;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consMethodCall_3, new IStrategoTerm[] { t_72,
							u_72, term }), checkListAnnos(termFactory, s_72));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}