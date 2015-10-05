package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Param$Seq_2_0 extends Strategy {
	public static $Param$Seq_2_0 instance = new $Param$Seq_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy l_6, Strategy m_6) {
		ITermFactory termFactory = context.getFactory();
		context.push("ParamSeq_2_0");
		Fail57: {
			IStrategoTerm u_74 = null;
			IStrategoTerm s_74 = null;
			IStrategoTerm t_74 = null;
			IStrategoTerm v_74 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consParamSeq_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail57;
			s_74 = term.getSubterm(0);
			t_74 = term.getSubterm(1);
			IStrategoList annos32 = term.getAnnotations();
			u_74 = annos32;
			term = l_6.invoke(context, s_74);
			if (term == null)
				break Fail57;
			v_74 = term;
			term = m_6.invoke(context, t_74);
			if (term == null)
				break Fail57;
			term = termFactory.annotateTerm(termFactory
					.makeAppl(desugar._consParamSeq_2, new IStrategoTerm[] {
							v_74, term }), checkListAnnos(termFactory, u_74));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}