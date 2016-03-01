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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarRead_1_0");
    Fail39:
    { 
      IStrategoTerm i_72 = null;
      IStrategoTerm h_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consVarRead_1 != ((IStrategoAppl)term).getConstructor())
        break Fail39;
      h_72 = term.getSubterm(0);
      IStrategoList annos17 = term.getAnnotations();
      i_72 = annos17;
      term = v_5.invoke(context, h_72);
      if(term == null)
        break Fail39;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consVarRead_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}