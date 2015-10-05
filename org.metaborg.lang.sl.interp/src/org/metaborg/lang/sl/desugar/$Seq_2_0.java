package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Seq_2_0 extends Strategy {
	public static $Seq_2_0 instance = new $Seq_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy t_5, Strategy u_5) {
		ITermFactory termFactory = context.getFactory();
		context.push("Seq_2_0");
		Fail43: {
			IStrategoTerm b_73 = null;
			IStrategoTerm z_72 = null;
			IStrategoTerm a_73 = null;
			IStrategoTerm c_73 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consSeq_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail43;
			z_72 = term.getSubterm(0);
			a_73 = term.getSubterm(1);
			IStrategoList annos23 = term.getAnnotations();
			b_73 = annos23;
			term = t_5.invoke(context, z_72);
			if (term == null)
				break Fail43;
			c_73 = term;
			term = u_5.invoke(context, a_73);
			if (term == null)
				break Fail43;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consSeq_2, new IStrategoTerm[] { c_73, term }),
					checkListAnnos(termFactory, b_73));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}