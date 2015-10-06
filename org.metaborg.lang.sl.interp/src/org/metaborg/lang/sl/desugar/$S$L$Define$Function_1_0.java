package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $S$L$Define$Function_1_0 extends Strategy {
	public static $S$L$Define$Function_1_0 instance = new $S$L$Define$Function_1_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy k_7) {
		ITermFactory termFactory = context.getFactory();
		context.push("SLDefineFunction_1_0");
		Fail65: {
			IStrategoTerm f_76 = null;
			IStrategoTerm e_76 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consSLDefineFunction_1 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail65;
			e_76 = term.getSubterm(0);
			IStrategoList annos36 = term.getAnnotations();
			f_76 = annos36;
			term = k_7.invoke(context, e_76);
			if (term == null)
				break Fail65;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consSLDefineFunction_1,
					new IStrategoTerm[] { term }),
					checkListAnnos(termFactory, f_76));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}