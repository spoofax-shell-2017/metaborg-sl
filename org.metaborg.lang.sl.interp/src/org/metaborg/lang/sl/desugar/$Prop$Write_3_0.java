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
			Strategy m_5, Strategy n_5, Strategy o_5) {
		ITermFactory termFactory = context.getFactory();
		context.push("PropWrite_3_0");
		Fail40: {
			IStrategoTerm l_72 = null;
			IStrategoTerm i_72 = null;
			IStrategoTerm j_72 = null;
			IStrategoTerm k_72 = null;
			IStrategoTerm m_72 = null;
			IStrategoTerm n_72 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consPropWrite_3 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail40;
			i_72 = term.getSubterm(0);
			j_72 = term.getSubterm(1);
			k_72 = term.getSubterm(2);
			IStrategoList annos20 = term.getAnnotations();
			l_72 = annos20;
			term = m_5.invoke(context, i_72);
			if (term == null)
				break Fail40;
			m_72 = term;
			term = n_5.invoke(context, j_72);
			if (term == null)
				break Fail40;
			n_72 = term;
			term = o_5.invoke(context, k_72);
			if (term == null)
				break Fail40;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consPropWrite_3, new IStrategoTerm[] { m_72, n_72,
							term }), checkListAnnos(termFactory, l_72));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}