package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Fun$Call$Desug_2_0 extends Strategy {
	public static $Fun$Call$Desug_2_0 instance = new $Fun$Call$Desug_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy d_7, Strategy e_7) {
		ITermFactory termFactory = context.getFactory();
		context.push("FunCallDesug_2_0");
		Fail61: {
			IStrategoTerm p_75 = null;
			IStrategoTerm n_75 = null;
			IStrategoTerm o_75 = null;
			IStrategoTerm q_75 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consFunCallDesug_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail61;
			n_75 = term.getSubterm(0);
			o_75 = term.getSubterm(1);
			IStrategoList annos33 = term.getAnnotations();
			p_75 = annos33;
			term = d_7.invoke(context, n_75);
			if (term == null)
				break Fail61;
			q_75 = term;
			term = e_7.invoke(context, o_75);
			if (term == null)
				break Fail61;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consFunCallDesug_2, new IStrategoTerm[] { q_75,
							term }), checkListAnnos(termFactory, p_75));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}