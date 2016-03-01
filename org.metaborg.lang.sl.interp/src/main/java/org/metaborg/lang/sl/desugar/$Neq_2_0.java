package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Neq_2_0 extends Strategy 
{ 
  public static $Neq_2_0 instance = new $Neq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_5, Strategy l_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Neq_2_0");
    Fail33:
    { 
      IStrategoTerm h_71 = null;
      IStrategoTerm f_71 = null;
      IStrategoTerm g_71 = null;
      IStrategoTerm i_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consNeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail33;
      f_71 = term.getSubterm(0);
      g_71 = term.getSubterm(1);
      IStrategoList annos11 = term.getAnnotations();
      h_71 = annos11;
      term = k_5.invoke(context, f_71);
      if(term == null)
        break Fail33;
      i_71 = term;
      term = l_5.invoke(context, g_71);
      if(term == null)
        break Fail33;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consNeq_2, new IStrategoTerm[]{i_71, term}), checkListAnnos(termFactory, h_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}