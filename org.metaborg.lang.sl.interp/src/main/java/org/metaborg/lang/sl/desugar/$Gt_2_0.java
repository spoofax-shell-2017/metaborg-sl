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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_5, Strategy j_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Gt_2_0");
    Fail33:
    { 
      IStrategoTerm l_71 = null;
      IStrategoTerm j_71 = null;
      IStrategoTerm k_71 = null;
      IStrategoTerm m_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consGt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail33;
      j_71 = term.getSubterm(0);
      k_71 = term.getSubterm(1);
      IStrategoList annos13 = term.getAnnotations();
      l_71 = annos13;
      term = i_5.invoke(context, j_71);
      if(term == null)
        break Fail33;
      m_71 = term;
      term = j_5.invoke(context, k_71);
      if(term == null)
        break Fail33;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consGt_2, new IStrategoTerm[]{m_71, term}), checkListAnnos(termFactory, l_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}