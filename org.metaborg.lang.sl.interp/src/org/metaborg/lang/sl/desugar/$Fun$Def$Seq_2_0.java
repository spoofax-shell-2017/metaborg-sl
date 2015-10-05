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
			Strategy g_6, Strategy h_6) {
		ITermFactory termFactory = context.getFactory();
		context.push("FunDefSeq_2_0");
		Fail54: {
			IStrategoTerm i_74 = null;
			IStrategoTerm g_74 = null;
			IStrategoTerm h_74 = null;
			IStrategoTerm j_74 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consFunDefSeq_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail54;
			g_74 = term.getSubterm(0);
			h_74 = term.getSubterm(1);
			IStrategoList annos30 = term.getAnnotations();
			i_74 = annos30;
			term = g_6.invoke(context, g_74);
			if (term == null)
				break Fail54;
			j_74 = term;
			term = h_6.invoke(context, h_74);
			if (term == null)
				break Fail54;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consFunDefSeq_2,
					new IStrategoTerm[] { j_74, term }),
					checkListAnnos(termFactory, i_74));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}