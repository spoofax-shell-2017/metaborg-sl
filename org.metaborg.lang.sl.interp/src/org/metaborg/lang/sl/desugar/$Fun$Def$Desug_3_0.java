package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Fun$Def$Desug_3_0 extends Strategy {
	public static $Fun$Def$Desug_3_0 instance = new $Fun$Def$Desug_3_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy y_6, Strategy z_6, Strategy a_7) {
		ITermFactory termFactory = context.getFactory();
		context.push("FunDefDesug_3_0");
		Fail58: {
			IStrategoTerm e_75 = null;
			IStrategoTerm b_75 = null;
			IStrategoTerm c_75 = null;
			IStrategoTerm d_75 = null;
			IStrategoTerm f_75 = null;
			IStrategoTerm g_75 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consFunDefDesug_3 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail58;
			b_75 = term.getSubterm(0);
			c_75 = term.getSubterm(1);
			d_75 = term.getSubterm(2);
			IStrategoList annos31 = term.getAnnotations();
			e_75 = annos31;
			term = y_6.invoke(context, b_75);
			if (term == null)
				break Fail58;
			f_75 = term;
			term = z_6.invoke(context, c_75);
			if (term == null)
				break Fail58;
			g_75 = term;
			term = a_7.invoke(context, d_75);
			if (term == null)
				break Fail58;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consFunDefDesug_3, new IStrategoTerm[] { f_75,
							g_75, term }), checkListAnnos(termFactory, e_75));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}