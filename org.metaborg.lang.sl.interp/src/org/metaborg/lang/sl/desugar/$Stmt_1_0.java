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
			Strategy i_6) {
		ITermFactory termFactory = context.getFactory();
		context.push("Stmt_1_0");
		Fail44: {
			IStrategoTerm n_73 = null;
			IStrategoTerm m_73 = null;
			if (term.getTermType() != IStrategoTerm.APPL
					|| desugar._consStmt_1 != ((IStrategoAppl) term)
							.getConstructor())
				break Fail44;
			m_73 = term.getSubterm(0);
			IStrategoList annos22 = term.getAnnotations();
			n_73 = annos22;
			term = i_6.invoke(context, m_73);
			if (term == null)
				break Fail44;
			term = termFactory.annotateTerm(termFactory.makeAppl(
					desugar._consStmt_1, new IStrategoTerm[] { term }),
					checkListAnnos(termFactory, n_73));
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}