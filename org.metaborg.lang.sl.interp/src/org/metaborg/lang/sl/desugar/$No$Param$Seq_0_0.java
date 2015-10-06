package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $No$Param$Seq_0_0 extends Strategy {
	public static $No$Param$Seq_0_0 instance = new $No$Param$Seq_0_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		Fail60: {
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consNoParamSeq_0 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail60;
			if (true)
				return term;
		}
		context.push("NoParamSeq_0_0");
		context.popOnFailure();
		return null;
	}
}