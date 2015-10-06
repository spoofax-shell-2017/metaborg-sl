package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $String_1_0 extends Strategy 
{ 
  public static $String_1_0 instance = new $String_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("String_1_0");
    Fail21:
    { 
      IStrategoTerm k_69 = null;
      IStrategoTerm j_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consString_1 != ((IStrategoAppl)term).getConstructor())
        break Fail21;
      j_69 = term.getSubterm(0);
      IStrategoList annos3 = term.getAnnotations();
      k_69 = annos3;
      term = j_4.invoke(context, j_69);
      if(term == null)
        break Fail21;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consString_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}