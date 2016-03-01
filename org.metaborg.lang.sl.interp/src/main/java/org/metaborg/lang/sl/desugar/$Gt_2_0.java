package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Gt_2_0 extends Strategy 
{ 
  public static $Gt_2_0 instance = new $Gt_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_5, Strategy p_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Gt_2_0");
    Fail35:
    { 
      IStrategoTerm r_71 = null;
      IStrategoTerm p_71 = null;
      IStrategoTerm q_71 = null;
      IStrategoTerm s_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consGt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail35;
      p_71 = term.getSubterm(0);
      q_71 = term.getSubterm(1);
      IStrategoList annos13 = term.getAnnotations();
      r_71 = annos13;
      term = o_5.invoke(context, p_71);
      if(term == null)
        break Fail35;
      s_71 = term;
      term = p_5.invoke(context, q_71);
      if(term == null)
        break Fail35;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consGt_2, new IStrategoTerm[]{s_71, term}), checkListAnnos(termFactory, r_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}