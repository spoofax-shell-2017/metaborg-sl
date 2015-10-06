package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Block_1_0 extends Strategy {
	public static $Block_1_0 instance = new $Block_1_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy l_6) {
		ITermFactory termFactory = context.getFactory();
		context.push("Block_1_0");
		Fail47: {
			IStrategoTerm v_73 = null;
			IStrategoTerm u_73 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consBlock_1 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail47;
			u_73 = term.getSubterm(0);
			IStrategoList annos24 = term.getAnnotations();
			v_73 = annos24;
			term = l_6.invoke(context, u_73);
			if (term == null)
				break Fail47;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consBlock_1, new IStrategoTerm[] { term }),
					checkListAnnos(termFactory, v_73));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}