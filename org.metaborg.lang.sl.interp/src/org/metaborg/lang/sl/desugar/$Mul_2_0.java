package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Mul_2_0 extends Strategy {
	public static $Mul_2_0 instance = new $Mul_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy m_4, Strategy n_4) {
		ITermFactory termFactory = context.getFactory();
		context.push("Mul_2_0");
		Fail26: {
			IStrategoTerm w_69 = null;
			IStrategoTerm u_69 = null;
			IStrategoTerm v_69 = null;
			IStrategoTerm x_69 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consMul_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail26;
			u_69 = term.getSubterm(0);
			v_69 = term.getSubterm(1);
			IStrategoList annos6 = term.getAnnotations();
			w_69 = annos6;
			term = m_4.invoke(context, u_69);
			if (term == null)
				break Fail26;
			x_69 = term;
			term = n_4.invoke(context, v_69);
			if (term == null)
				break Fail26;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consMul_2, new IStrategoTerm[] { x_69, term }),
					checkListAnnos(termFactory, w_69));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}