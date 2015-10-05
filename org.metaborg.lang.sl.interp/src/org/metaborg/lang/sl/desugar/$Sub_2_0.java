package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Sub_2_0 extends Strategy {
	public static $Sub_2_0 instance = new $Sub_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy o_4, Strategy p_4) {
		ITermFactory termFactory = context.getFactory();
		context.push("Sub_2_0");
		Fail27: {
			IStrategoTerm b_70 = null;
			IStrategoTerm z_69 = null;
			IStrategoTerm a_70 = null;
			IStrategoTerm c_70 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consSub_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail27;
			z_69 = term.getSubterm(0);
			a_70 = term.getSubterm(1);
			IStrategoList annos7 = term.getAnnotations();
			b_70 = annos7;
			term = o_4.invoke(context, z_69);
			if (term == null)
				break Fail27;
			c_70 = term;
			term = p_4.invoke(context, a_70);
			if (term == null)
				break Fail27;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consSub_2, new IStrategoTerm[] { c_70, term }),
					checkListAnnos(termFactory, b_70));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}