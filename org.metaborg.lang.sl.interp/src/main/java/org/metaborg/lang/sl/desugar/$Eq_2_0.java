package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Eq_2_0 extends Strategy 
{ 
  public static $Eq_2_0 instance = new $Eq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_4, Strategy z_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Eq_2_0");
    Fail28:
    { 
      IStrategoTerm m_70 = null;
      IStrategoTerm k_70 = null;
      IStrategoTerm l_70 = null;
      IStrategoTerm n_70 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consEq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail28;
      k_70 = term.getSubterm(0);
      l_70 = term.getSubterm(1);
      IStrategoList annos8 = term.getAnnotations();
      m_70 = annos8;
      term = y_4.invoke(context, k_70);
      if(term == null)
        break Fail28;
      n_70 = term;
      term = z_4.invoke(context, l_70);
      if(term == null)
        break Fail28;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consEq_2, new IStrategoTerm[]{n_70, term}), checkListAnnos(termFactory, m_70));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}