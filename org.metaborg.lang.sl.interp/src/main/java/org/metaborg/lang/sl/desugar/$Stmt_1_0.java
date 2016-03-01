package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Stmt_1_0 extends Strategy 
{ 
  public static $Stmt_1_0 instance = new $Stmt_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Stmt_1_0");
    Fail44:
    { 
      IStrategoTerm j_73 = null;
      IStrategoTerm i_73 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consStmt_1 != ((IStrategoAppl)term).getConstructor())
        break Fail44;
      i_73 = term.getSubterm(0);
      IStrategoList annos22 = term.getAnnotations();
      j_73 = annos22;
      term = g_6.invoke(context, i_73);
      if(term == null)
        break Fail44;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consStmt_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_73));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}