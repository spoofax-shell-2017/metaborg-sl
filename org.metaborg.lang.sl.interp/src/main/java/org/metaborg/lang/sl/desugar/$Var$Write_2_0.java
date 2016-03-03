package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Var$Write_2_0 extends Strategy 
{ 
  public static $Var$Write_2_0 instance = new $Var$Write_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_5, Strategy b_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarWrite_2_0");
    Fail35:
    { 
      IStrategoTerm j_71 = null;
      IStrategoTerm h_71 = null;
      IStrategoTerm i_71 = null;
      IStrategoTerm k_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consVarWrite_2 != ((IStrategoAppl)term).getConstructor())
        break Fail35;
      h_71 = term.getSubterm(0);
      i_71 = term.getSubterm(1);
      IStrategoList annos18 = term.getAnnotations();
      j_71 = annos18;
      term = a_5.invoke(context, h_71);
      if(term == null)
        break Fail35;
      k_71 = term;
      term = b_5.invoke(context, i_71);
      if(term == null)
        break Fail35;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consVarWrite_2, new IStrategoTerm[]{k_71, term}), checkListAnnos(termFactory, j_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}