package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Prop$Read_2_0 extends Strategy {
	public static $Prop$Read_2_0 instance = new $Prop$Read_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy k_5, Strategy l_5) {
		ITermFactory termFactory = context.getFactory();
		context.push("PropRead_2_0");
		Fail39: {
			IStrategoTerm f_72 = null;
			IStrategoTerm d_72 = null;
			IStrategoTerm e_72 = null;
			IStrategoTerm g_72 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consPropRead_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail39;
			d_72 = term.getSubterm(0);
			e_72 = term.getSubterm(1);
			IStrategoList annos19 = term.getAnnotations();
			f_72 = annos19;
			term = k_5.invoke(context, d_72);
			if (term == null)
				break Fail39;
			g_72 = term;
			term = l_5.invoke(context, e_72);
			if (term == null)
				break Fail39;
			term = termFactory.annotateTerm(termFactory
					.makeAppl(desugar._consPropRead_2, new IStrategoTerm[] {
							g_72, term }), checkListAnnos(termFactory, f_72));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}