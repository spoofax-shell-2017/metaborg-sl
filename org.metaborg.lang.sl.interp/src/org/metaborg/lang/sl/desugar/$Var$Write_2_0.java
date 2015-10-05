package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Var$Write_2_0 extends Strategy {
	public static $Var$Write_2_0 instance = new $Var$Write_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy i_5, Strategy j_5) {
		ITermFactory termFactory = context.getFactory();
		context.push("VarWrite_2_0");
		Fail38: {
			IStrategoTerm a_72 = null;
			IStrategoTerm y_71 = null;
			IStrategoTerm z_71 = null;
			IStrategoTerm b_72 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consVarWrite_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail38;
			y_71 = term.getSubterm(0);
			z_71 = term.getSubterm(1);
			IStrategoList annos18 = term.getAnnotations();
			a_72 = annos18;
			term = i_5.invoke(context, y_71);
			if (term == null)
				break Fail38;
			b_72 = term;
			term = j_5.invoke(context, z_71);
			if (term == null)
				break Fail38;
			term = termFactory.annotateTerm(termFactory
					.makeAppl(desugar._consVarWrite_2, new IStrategoTerm[] {
							b_72, term }), checkListAnnos(termFactory, a_72));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}