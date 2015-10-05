package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Fun$Def$Desug_3_0 extends Strategy {
	public static $Fun$Def$Desug_3_0 instance = new $Fun$Def$Desug_3_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy i_6, Strategy j_6, Strategy k_6) {
		ITermFactory termFactory = context.getFactory();
		context.push("FunDefDesug_3_0");
		Fail56: {
			IStrategoTerm o_74 = null;
			IStrategoTerm l_74 = null;
			IStrategoTerm m_74 = null;
			IStrategoTerm n_74 = null;
			IStrategoTerm p_74 = null;
			IStrategoTerm q_74 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consFunDefDesug_3 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail56;
			l_74 = term.getSubterm(0);
			m_74 = term.getSubterm(1);
			n_74 = term.getSubterm(2);
			IStrategoList annos31 = term.getAnnotations();
			o_74 = annos31;
			term = i_6.invoke(context, l_74);
			if (term == null)
				break Fail56;
			p_74 = term;
			term = j_6.invoke(context, m_74);
			if (term == null)
				break Fail56;
			q_74 = term;
			term = k_6.invoke(context, n_74);
			if (term == null)
				break Fail56;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consFunDefDesug_3, new IStrategoTerm[] { p_74,
							q_74, term }), checkListAnnos(termFactory, o_74));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}