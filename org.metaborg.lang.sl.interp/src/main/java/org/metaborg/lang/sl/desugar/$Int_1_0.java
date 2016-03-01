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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Int_1_0");
    Fail22:
    { 
      IStrategoTerm r_69 = null;
      IStrategoTerm q_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consInt_1 != ((IStrategoAppl)term).getConstructor())
        break Fail22;
      q_69 = term.getSubterm(0);
      IStrategoList annos2 = term.getAnnotations();
      r_69 = annos2;
      term = u_4.invoke(context, q_69);
      if(term == null)
        break Fail22;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consInt_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}