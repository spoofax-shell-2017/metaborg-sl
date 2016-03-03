package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Gte_2_0 extends Strategy 
{ 
  public static $Gte_2_0 instance = new $Gte_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_5, Strategy h_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Gte_2_0");
    Fail32:
    { 
      IStrategoTerm g_71 = null;
      IStrategoTerm e_71 = null;
      IStrategoTerm f_71 = null;
      IStrategoTerm h_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consGte_2 != ((IStrategoAppl)term).getConstructor())
        break Fail32;
      e_71 = term.getSubterm(0);
      f_71 = term.getSubterm(1);
      IStrategoList annos12 = term.getAnnotations();
      g_71 = annos12;
      term = g_5.invoke(context, e_71);
      if(term == null)
        break Fail32;
      h_71 = term;
      term = h_5.invoke(context, f_71);
      if(term == null)
        break Fail32;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consGte_2, new IStrategoTerm[]{h_71, term}), checkListAnnos(termFactory, g_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}