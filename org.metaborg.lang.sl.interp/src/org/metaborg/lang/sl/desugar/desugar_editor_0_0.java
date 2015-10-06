package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;
import org.strategoxt.stratego_lib.guarantee_extension_0_1;
import org.strategoxt.stratego_lib.report_with_failure_0_1;

@SuppressWarnings("all")
public class desugar_editor_0_0 extends Strategy {
	public static desugar_editor_0_0 instance = new desugar_editor_0_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		ITermFactory termFactory = context.getFactory();
		context.push("desugar_editor_0_0");
		Fail0: {
			IStrategoTerm b_3 = null;
			IStrategoTerm c_3 = null;
			IStrategoTerm d_3 = null;
			IStrategoTerm e_3 = null;
			IStrategoTerm f_3 = null;
			if (term.getTermType() != IStrategoTerm.TUPLE
					|| term.getSubtermCount() != 5)
				break Fail0;
			d_3 = term.getSubterm(2);
			b_3 = term.getSubterm(3);
			f_3 = term;
			IStrategoTerm term0 = term;
			Success0: {
				Fail1: {
					IStrategoTerm h_3 = null;
					h_3 = b_3;
					term = guarantee_extension_0_1.instance.invoke(context,
							h_3, desugar.const0);
					if (term == null)
						break Fail1;
					c_3 = term;
					term = desugar_all_0_0.instance.invoke(context, d_3);
					if (term == null)
						break Fail1;
					e_3 = term;
					if (true)
						break Success0;
				}
				term = term0;
				IStrategoTerm j_3 = null;
				j_3 = term;
				term = report_with_failure_0_1.instance.invoke(context, j_3,
						desugar.const1);
				if (term == null)
					break Fail0;
			}
			term = f_3;
			if (c_3 == null || e_3 == null)
				break Fail0;
			term = termFactory.makeTuple(c_3, e_3);
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}