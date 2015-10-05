package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Arg$Seq_2_0 extends Strategy {
	public static $Arg$Seq_2_0 instance = new $Arg$Seq_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy p_6, Strategy q_6) {
		ITermFactory termFactory = context.getFactory();
		context.push("ArgSeq_2_0");
		Fail60: {
			IStrategoTerm e_75 = null;
			IStrategoTerm c_75 = null;
			IStrategoTerm d_75 = null;
			IStrategoTerm f_75 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consArgSeq_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail60;
			c_75 = term.getSubterm(0);
			d_75 = term.getSubterm(1);
			IStrategoList annos34 = term.getAnnotations();
			e_75 = annos34;
			term = p_6.invoke(context, c_75);
			if (term == null)
				break Fail60;
			f_75 = term;
			term = q_6.invoke(context, d_75);
			if (term == null)
				break Fail60;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consArgSeq_2, new IStrategoTerm[] { f_75, term }),
					checkListAnnos(termFactory, e_75));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}