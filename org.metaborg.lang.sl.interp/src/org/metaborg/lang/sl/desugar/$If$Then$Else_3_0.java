package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $If$Then$Else_3_0 extends Strategy {
	public static $If$Then$Else_3_0 instance = new $If$Then$Else_3_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy a_6, Strategy b_6, Strategy c_6) {
		ITermFactory termFactory = context.getFactory();
		context.push("IfThenElse_3_0");
		Fail48: {
			IStrategoTerm u_73 = null;
			IStrategoTerm r_73 = null;
			IStrategoTerm s_73 = null;
			IStrategoTerm t_73 = null;
			IStrategoTerm v_73 = null;
			IStrategoTerm w_73 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consIfThenElse_3 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail48;
			r_73 = term.getSubterm(0);
			s_73 = term.getSubterm(1);
			t_73 = term.getSubterm(2);
			IStrategoList annos27 = term.getAnnotations();
			u_73 = annos27;
			term = a_6.invoke(context, r_73);
			if (term == null)
				break Fail48;
			v_73 = term;
			term = b_6.invoke(context, s_73);
			if (term == null)
				break Fail48;
			w_73 = term;
			term = c_6.invoke(context, t_73);
			if (term == null)
				break Fail48;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consIfThenElse_3, new IStrategoTerm[] { v_73,
							w_73, term }), checkListAnnos(termFactory, u_73));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}