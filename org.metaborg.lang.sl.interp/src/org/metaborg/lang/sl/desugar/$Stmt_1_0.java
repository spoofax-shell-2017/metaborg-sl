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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Stmt_1_0");
    Fail42:
    { 
      IStrategoTerm z_72 = null;
      IStrategoTerm y_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consStmt_1 != ((IStrategoAppl)term).getConstructor())
        break Fail42;
      y_72 = term.getSubterm(0);
      IStrategoList annos22 = term.getAnnotations();
      z_72 = annos22;
      term = u_5.invoke(context, y_72);
      if(term == null)
        break Fail42;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consStmt_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}