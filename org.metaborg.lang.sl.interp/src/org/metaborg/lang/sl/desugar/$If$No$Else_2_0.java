package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $If$No$Else_2_0 extends Strategy {
	public static $If$No$Else_2_0 instance = new $If$No$Else_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy y_5, Strategy z_5) {
		ITermFactory termFactory = context.getFactory();
		context.push("IfNoElse_2_0");
		Fail47: {
			IStrategoTerm o_73 = null;
			IStrategoTerm m_73 = null;
			IStrategoTerm n_73 = null;
			IStrategoTerm p_73 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consIfNoElse_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail47;
			m_73 = term.getSubterm(0);
			n_73 = term.getSubterm(1);
			IStrategoList annos26 = term.getAnnotations();
			o_73 = annos26;
			term = y_5.invoke(context, m_73);
			if (term == null)
				break Fail47;
			p_73 = term;
			term = z_5.invoke(context, n_73);
			if (term == null)
				break Fail47;
			term = termFactory.annotateTerm(termFactory
					.makeAppl(desugar._consIfNoElse_2, new IStrategoTerm[] {
							p_73, term }), checkListAnnos(termFactory, o_73));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}