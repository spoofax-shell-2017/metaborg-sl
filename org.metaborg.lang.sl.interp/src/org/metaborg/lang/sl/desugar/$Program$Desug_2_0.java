package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Program$Desug_2_0 extends Strategy {
	public static $Program$Desug_2_0 instance = new $Program$Desug_2_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy e_6, Strategy f_6) {
		ITermFactory termFactory = context.getFactory();
		context.push("ProgramDesug_2_0");
		Fail53: {
			IStrategoTerm d_74 = null;
			IStrategoTerm b_74 = null;
			IStrategoTerm c_74 = null;
			IStrategoTerm e_74 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consProgramDesug_2 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail53;
			b_74 = term.getSubterm(0);
			c_74 = term.getSubterm(1);
			IStrategoList annos29 = term.getAnnotations();
			d_74 = annos29;
			term = e_6.invoke(context, b_74);
			if (term == null)
				break Fail53;
			e_74 = term;
			term = f_6.invoke(context, c_74);
			if (term == null)
				break Fail53;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consProgramDesug_2, new IStrategoTerm[] { e_74,
							term }), checkListAnnos(termFactory, d_74));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}