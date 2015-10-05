package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class desugar_args_0_0 extends Strategy {
	public static desugar_args_0_0 instance = new desugar_args_0_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		ITermFactory termFactory = context.getFactory();
		context.push("desugar_args_0_0");
		Fail15: {
			IStrategoTerm term21 = term;
			Success11: {
				Fail16: {
					if (term.getTermType() != IStrategoTerm.LIST
							|| !((IStrategoList) term).isEmpty())
						break Fail16;
					term = desugar.constNoArgSeq0;
					if (true)
						break Success11;
				}
				term = term21;
				IStrategoTerm x_3 = null;
				IStrategoTerm y_3 = null;
				if (term.getTermType() != IStrategoTerm.LIST
						|| ((IStrategoList) term).isEmpty())
					break Fail15;
				x_3 = ((IStrategoList) term).head();
				y_3 = ((IStrategoList) term).tail();
				term = this.invoke(context, y_3);
				if (term == null)
					break Fail15;
				term = termFactory.makeAppl(desugar._consArgSeq_2,
						new IStrategoTerm[] { x_3, term });
			}
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}