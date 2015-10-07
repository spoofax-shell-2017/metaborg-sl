package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method$Call_3_0 extends Strategy 
{ 
  public static $Method$Call_3_0 instance = new $Method$Call_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_6, Strategy g_6, Strategy h_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodCall_3_0");
    Fail43:
    { 
      IStrategoTerm i_73 = null;
      IStrategoTerm f_73 = null;
      IStrategoTerm g_73 = null;
      IStrategoTerm h_73 = null;
      IStrategoTerm j_73 = null;
      IStrategoTerm k_73 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consMethodCall_3 != ((IStrategoAppl)term).getConstructor())
        break Fail43;
      f_73 = term.getSubterm(0);
      g_73 = term.getSubterm(1);
      h_73 = term.getSubterm(2);
      IStrategoList annos21 = term.getAnnotations();
      i_73 = annos21;
      term = f_6.invoke(context, f_73);
      if(term == null)
        break Fail43;
      j_73 = term;
      term = g_6.invoke(context, g_73);
      if(term == null)
        break Fail43;
      k_73 = term;
      term = h_6.invoke(context, h_73);
      if(term == null)
        break Fail43;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consMethodCall_3, new IStrategoTerm[]{j_73, k_73, term}), checkListAnnos(termFactory, i_73));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}