package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Div_2_0 extends Strategy 
{ 
  public static $Div_2_0 instance = new $Div_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_5, Strategy b_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Div_2_0");
    Fail27:
    { 
      IStrategoTerm h_70 = null;
      IStrategoTerm f_70 = null;
      IStrategoTerm g_70 = null;
      IStrategoTerm i_70 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consDiv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail27;
      f_70 = term.getSubterm(0);
      g_70 = term.getSubterm(1);
      IStrategoList annos5 = term.getAnnotations();
      h_70 = annos5;
      term = a_5.invoke(context, f_70);
      if(term == null)
        break Fail27;
      i_70 = term;
      term = b_5.invoke(context, g_70);
      if(term == null)
        break Fail27;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consDiv_2, new IStrategoTerm[]{i_70, term}), checkListAnnos(termFactory, h_70));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}