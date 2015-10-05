package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Not_1_0 extends Strategy {
	public static $Not_1_0 instance = new $Not_1_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy g_5) {
		ITermFactory termFactory = context.getFactory();
		context.push("Not_1_0");
		Fail36: {
			IStrategoTerm t_71 = null;
			IStrategoTerm s_71 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consNot_1 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail36;
			s_71 = term.getSubterm(0);
			IStrategoList annos16 = term.getAnnotations();
			t_71 = annos16;
			term = g_5.invoke(context, s_71);
			if (term == null)
				break Fail36;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consNot_1, new IStrategoTerm[] { term }),
					checkListAnnos(termFactory, t_71));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}