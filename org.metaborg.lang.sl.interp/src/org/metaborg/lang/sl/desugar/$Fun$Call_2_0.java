package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Fun$Call_2_0 extends Strategy {
	public static $Fun$Call_2_0 instance = new $Fun$Call_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy e_4, Strategy f_4) {
		ITermFactory termFactory = context.getFactory();
		context.push("FunCall_2_0");
		Fail19: {
			IStrategoTerm b_69 = null;
			IStrategoTerm z_68 = null;
			IStrategoTerm a_69 = null;
			IStrategoTerm c_69 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consFunCall_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail19;
			z_68 = term.getSubterm(0);
			a_69 = term.getSubterm(1);
			IStrategoList annos1 = term.getAnnotations();
			b_69 = annos1;
			term = e_4.invoke(context, z_68);
			if (term == null)
				break Fail19;
			c_69 = term;
			term = f_4.invoke(context, a_69);
			if (term == null)
				break Fail19;
			term = termFactory.annotateTerm(
					termFactory.makeAppl(desugar._consFunCall_2,
							new IStrategoTerm[] { c_69, term }),
					checkListAnnos(termFactory, b_69));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}