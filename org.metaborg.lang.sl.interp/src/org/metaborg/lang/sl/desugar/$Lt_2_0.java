package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lt_2_0 extends Strategy 
{ 
  public static $Lt_2_0 instance = new $Lt_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4, Strategy x_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Lt_2_0");
    Fail30:
    { 
      IStrategoTerm s_70 = null;
      IStrategoTerm q_70 = null;
      IStrategoTerm r_70 = null;
      IStrategoTerm t_70 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consLt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail30;
      q_70 = term.getSubterm(0);
      r_70 = term.getSubterm(1);
      IStrategoList annos10 = term.getAnnotations();
      s_70 = annos10;
      term = w_4.invoke(context, q_70);
      if(term == null)
        break Fail30;
      t_70 = term;
      term = x_4.invoke(context, r_70);
      if(term == null)
        break Fail30;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consLt_2, new IStrategoTerm[]{t_70, term}), checkListAnnos(termFactory, s_70));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}