package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Fun$Call$Desug_2_0 extends Strategy {
	public static $Fun$Call$Desug_2_0 instance = new $Fun$Call$Desug_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy n_6, Strategy o_6) {
		ITermFactory termFactory = context.getFactory();
		context.push("FunCallDesug_2_0");
		Fail59: {
			IStrategoTerm z_74 = null;
			IStrategoTerm x_74 = null;
			IStrategoTerm y_74 = null;
			IStrategoTerm a_75 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consFunCallDesug_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail59;
			x_74 = term.getSubterm(0);
			y_74 = term.getSubterm(1);
			IStrategoList annos33 = term.getAnnotations();
			z_74 = annos33;
			term = n_6.invoke(context, x_74);
			if (term == null)
				break Fail59;
			a_75 = term;
			term = o_6.invoke(context, y_74);
			if (term == null)
				break Fail59;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consFunCallDesug_2, new IStrategoTerm[] { a_75,
							term }), checkListAnnos(termFactory, z_74));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}