package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Int_1_0 extends Strategy {
	public static $Int_1_0 instance = new $Int_1_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy w_4) {
		ITermFactory termFactory = context.getFactory();
		context.push("Int_1_0");
		Fail22: {
			IStrategoTerm v_69 = null;
			IStrategoTerm u_69 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consInt_1 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail22;
			u_69 = term.getSubterm(0);
			IStrategoList annos2 = term.getAnnotations();
			v_69 = annos2;
			term = w_4.invoke(context, u_69);
			if (term == null)
				break Fail22;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consInt_1, new IStrategoTerm[] { term }),
					checkListAnnos(termFactory, v_69));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}