package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $String_1_0 extends Strategy {
	public static $String_1_0 instance = new $String_1_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy h_4) {
		ITermFactory termFactory = context.getFactory();
		context.push("String_1_0");
		Fail21: {
			IStrategoTerm i_69 = null;
			IStrategoTerm h_69 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consString_1 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail21;
			h_69 = term.getSubterm(0);
			IStrategoList annos3 = term.getAnnotations();
			i_69 = annos3;
			term = h_4.invoke(context, h_69);
			if (term == null)
				break Fail21;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consString_1, new IStrategoTerm[] { term }),
					checkListAnnos(termFactory, i_69));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}