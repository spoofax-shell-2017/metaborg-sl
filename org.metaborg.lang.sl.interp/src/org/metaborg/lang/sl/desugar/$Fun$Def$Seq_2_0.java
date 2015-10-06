package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Fun$Def$Seq_2_0 extends Strategy {
	public static $Fun$Def$Seq_2_0 instance = new $Fun$Def$Seq_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy w_6, Strategy x_6) {
		ITermFactory termFactory = context.getFactory();
		context.push("FunDefSeq_2_0");
		Fail56: {
			IStrategoTerm y_74 = null;
			IStrategoTerm w_74 = null;
			IStrategoTerm x_74 = null;
			IStrategoTerm z_74 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consFunDefSeq_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail56;
			w_74 = term.getSubterm(0);
			x_74 = term.getSubterm(1);
			IStrategoList annos30 = term.getAnnotations();
			y_74 = annos30;
			term = w_6.invoke(context, w_74);
			if (term == null)
				break Fail56;
			z_74 = term;
			term = x_6.invoke(context, x_74);
			if (term == null)
				break Fail56;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consFunDefSeq_2,
					new IStrategoTerm[] { z_74, term }),
					checkListAnnos(termFactory, y_74));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}