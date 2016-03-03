package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Or_2_0 extends Strategy 
{ 
  public static $Or_2_0 instance = new $Or_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4, Strategy x_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Or_2_0");
    Fail32:
    { 
      IStrategoTerm y_70 = null;
      IStrategoTerm w_70 = null;
      IStrategoTerm x_70 = null;
      IStrategoTerm z_70 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail32;
      w_70 = term.getSubterm(0);
      x_70 = term.getSubterm(1);
      IStrategoList annos15 = term.getAnnotations();
      y_70 = annos15;
      term = w_4.invoke(context, w_70);
      if(term == null)
        break Fail32;
      z_70 = term;
      term = x_4.invoke(context, x_70);
      if(term == null)
        break Fail32;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consOr_2, new IStrategoTerm[]{z_70, term}), checkListAnnos(termFactory, y_70));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}