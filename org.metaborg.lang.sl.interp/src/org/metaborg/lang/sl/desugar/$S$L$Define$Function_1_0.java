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
			Strategy u_6) {
		ITermFactory termFactory = context.getFactory();
		context.push("SLDefineFunction_1_0");
		Fail63: {
			IStrategoTerm p_75 = null;
			IStrategoTerm o_75 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consSLDefineFunction_1 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail63;
			o_75 = term.getSubterm(0);
			IStrategoList annos36 = term.getAnnotations();
			p_75 = annos36;
			term = u_6.invoke(context, o_75);
			if (term == null)
				break Fail63;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consSLDefineFunction_1,
					new IStrategoTerm[] { term }),
					checkListAnnos(termFactory, p_75));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}