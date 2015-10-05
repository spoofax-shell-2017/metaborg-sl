package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $No$Fun$Def$Seq_0_0 extends Strategy {
	public static $No$Fun$Def$Seq_0_0 instance = new $No$Fun$Def$Seq_0_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		Fail55: {
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consNoFunDefSeq_0 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail55;
			if (true)
				return term;
		}
		context.push("NoFunDefSeq_0_0");
		context.popOnFailure();
		return null;
	}
}