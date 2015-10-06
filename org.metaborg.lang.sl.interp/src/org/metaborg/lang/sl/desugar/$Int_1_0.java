package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Int_1_0 extends Strategy 
{ 
  public static $Int_1_0 instance = new $Int_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Int_1_0");
    Fail20:
    { 
      IStrategoTerm h_69 = null;
      IStrategoTerm g_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consInt_1 != ((IStrategoAppl)term).getConstructor())
        break Fail20;
      g_69 = term.getSubterm(0);
      IStrategoList annos2 = term.getAnnotations();
      h_69 = annos2;
      term = i_4.invoke(context, g_69);
      if(term == null)
        break Fail20;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consInt_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}