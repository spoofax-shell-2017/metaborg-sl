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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_4, Strategy t_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Gt_2_0");
    Fail30:
    { 
      IStrategoTerm o_70 = null;
      IStrategoTerm m_70 = null;
      IStrategoTerm n_70 = null;
      IStrategoTerm p_70 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consGt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail30;
      m_70 = term.getSubterm(0);
      n_70 = term.getSubterm(1);
      IStrategoList annos13 = term.getAnnotations();
      o_70 = annos13;
      term = s_4.invoke(context, m_70);
      if(term == null)
        break Fail30;
      p_70 = term;
      term = t_4.invoke(context, n_70);
      if(term == null)
        break Fail30;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consGt_2, new IStrategoTerm[]{p_70, term}), checkListAnnos(termFactory, o_70));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}