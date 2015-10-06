package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Var$Read_1_0 extends Strategy 
{ 
  public static $Var$Read_1_0 instance = new $Var$Read_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarRead_1_0");
    Fail37:
    { 
      IStrategoTerm y_71 = null;
      IStrategoTerm x_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consVarRead_1 != ((IStrategoAppl)term).getConstructor())
        break Fail37;
      x_71 = term.getSubterm(0);
      IStrategoList annos17 = term.getAnnotations();
      y_71 = annos17;
      term = j_5.invoke(context, x_71);
      if(term == null)
        break Fail37;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consVarRead_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}