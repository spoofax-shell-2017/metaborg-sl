package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Fun$Def_3_0 extends Strategy {
	public static $Fun$Def_3_0 instance = new $Fun$Def_3_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy b_4, Strategy c_4, Strategy d_4) {
		ITermFactory termFactory = context.getFactory();
		context.push("FunDef_3_0");
		Fail18: {
			IStrategoTerm v_68 = null;
			IStrategoTerm s_68 = null;
			IStrategoTerm t_68 = null;
			IStrategoTerm u_68 = null;
			IStrategoTerm w_68 = null;
			IStrategoTerm x_68 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consFunDef_3 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail18;
			s_68 = term.getSubterm(0);
			t_68 = term.getSubterm(1);
			u_68 = term.getSubterm(2);
			IStrategoList annos0 = term.getAnnotations();
			v_68 = annos0;
			term = b_4.invoke(context, s_68);
			if (term == null)
				break Fail18;
			w_68 = term;
			term = c_4.invoke(context, t_68);
			if (term == null)
				break Fail18;
			x_68 = term;
			term = d_4.invoke(context, u_68);
			if (term == null)
				break Fail18;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consFunDef_3, new IStrategoTerm[] { w_68, x_68,
							term }), checkListAnnos(termFactory, v_68));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}