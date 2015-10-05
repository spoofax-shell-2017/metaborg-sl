package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $S$L$Println_1_0 extends Strategy {
	public static $S$L$Println_1_0 instance = new $S$L$Println_1_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy v_6) {
		ITermFactory termFactory = context.getFactory();
		context.push("SLPrintln_1_0");
		Fail66: {
			IStrategoTerm s_75 = null;
			IStrategoTerm r_75 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consSLPrintln_1 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail66;
			r_75 = term.getSubterm(0);
			IStrategoList annos37 = term.getAnnotations();
			s_75 = annos37;
			term = v_6.invoke(context, r_75);
			if (term == null)
				break Fail66;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consSLPrintln_1, new IStrategoTerm[] { term }),
					checkListAnnos(termFactory, s_75));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}