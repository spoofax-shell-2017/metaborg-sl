package org.metaborg.lang.sl.desugar;

import static org.strategoxt.lang.Term.checkListAnnos;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class $Stmt_1_0 extends Strategy {
	public static $Stmt_1_0 instance = new $Stmt_1_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term,
			Strategy s_5) {
		ITermFactory termFactory = context.getFactory();
		context.push("Stmt_1_0");
		Fail42: {
			IStrategoTerm x_72 = null;
			IStrategoTerm w_72 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consStmt_1 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail42;
			w_72 = term.getSubterm(0);
			IStrategoList annos22 = term.getAnnotations();
			x_72 = annos22;
			term = s_5.invoke(context, w_72);
			if (term == null)
				break Fail42;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consStmt_1, new IStrategoTerm[] { term }),
					checkListAnnos(termFactory, x_72));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}