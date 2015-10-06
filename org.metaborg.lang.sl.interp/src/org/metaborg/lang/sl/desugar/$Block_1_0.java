package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Block_1_0 extends Strategy 
{ 
  public static $Block_1_0 instance = new $Block_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Block_1_0");
    Fail45:
    { 
      IStrategoTerm h_73 = null;
      IStrategoTerm g_73 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consBlock_1 != ((IStrategoAppl)term).getConstructor())
        break Fail45;
      g_73 = term.getSubterm(0);
      IStrategoList annos24 = term.getAnnotations();
      h_73 = annos24;
      term = x_5.invoke(context, g_73);
      if(term == null)
        break Fail45;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consBlock_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_73));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}