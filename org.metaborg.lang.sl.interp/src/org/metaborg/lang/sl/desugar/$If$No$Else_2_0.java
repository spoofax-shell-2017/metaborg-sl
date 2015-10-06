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
			Strategy o_6, Strategy p_6) {
		ITermFactory termFactory = context.getFactory();
		context.push("IfNoElse_2_0");
		Fail49: {
			IStrategoTerm e_74 = null;
			IStrategoTerm c_74 = null;
			IStrategoTerm d_74 = null;
			IStrategoTerm f_74 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consIfNoElse_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail49;
			c_74 = term.getSubterm(0);
			d_74 = term.getSubterm(1);
			IStrategoList annos26 = term.getAnnotations();
			e_74 = annos26;
			term = o_6.invoke(context, c_74);
			if (term == null)
				break Fail49;
			f_74 = term;
			term = p_6.invoke(context, d_74);
			if (term == null)
				break Fail49;
			term = termFactory.annotateTerm(termFactory
					.makeAppl(desugar._consIfNoElse_2, new IStrategoTerm[] {
							f_74, term }), checkListAnnos(termFactory, e_74));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}