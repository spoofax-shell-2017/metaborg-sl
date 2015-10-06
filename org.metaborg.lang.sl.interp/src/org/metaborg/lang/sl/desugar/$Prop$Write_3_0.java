package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Prop$Write_3_0 extends Strategy {
	public static $Prop$Write_3_0 instance = new $Prop$Write_3_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy c_6, Strategy d_6, Strategy e_6) {
		ITermFactory termFactory = context.getFactory();
		context.push("PropWrite_3_0");
		Fail42: {
			IStrategoTerm b_73 = null;
			IStrategoTerm y_72 = null;
			IStrategoTerm z_72 = null;
			IStrategoTerm a_73 = null;
			IStrategoTerm c_73 = null;
			IStrategoTerm d_73 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consPropWrite_3 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail42;
			y_72 = term.getSubterm(0);
			z_72 = term.getSubterm(1);
			a_73 = term.getSubterm(2);
			IStrategoList annos20 = term.getAnnotations();
			b_73 = annos20;
			term = c_6.invoke(context, y_72);
			if (term == null)
				break Fail42;
			c_73 = term;
			term = d_6.invoke(context, z_72);
			if (term == null)
				break Fail42;
			d_73 = term;
			term = e_6.invoke(context, a_73);
			if (term == null)
				break Fail42;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consPropWrite_3, new IStrategoTerm[] { c_73, d_73,
							term }), checkListAnnos(termFactory, b_73));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}