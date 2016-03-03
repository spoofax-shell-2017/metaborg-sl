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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Stmt_1_0");
    Fail39:
    { 
      IStrategoTerm g_72 = null;
      IStrategoTerm f_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consStmt_1 != ((IStrategoAppl)term).getConstructor())
        break Fail39;
      f_72 = term.getSubterm(0);
      IStrategoList annos22 = term.getAnnotations();
      g_72 = annos22;
      term = k_5.invoke(context, f_72);
      if(term == null)
        break Fail39;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consStmt_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}