package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Gte_2_0 extends Strategy 
{ 
  public static $Gte_2_0 instance = new $Gte_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_5, Strategy n_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Gte_2_0");
    Fail34:
    { 
      IStrategoTerm m_71 = null;
      IStrategoTerm k_71 = null;
      IStrategoTerm l_71 = null;
      IStrategoTerm n_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consGte_2 != ((IStrategoAppl)term).getConstructor())
        break Fail34;
      k_71 = term.getSubterm(0);
      l_71 = term.getSubterm(1);
      IStrategoList annos12 = term.getAnnotations();
      m_71 = annos12;
      term = m_5.invoke(context, k_71);
      if(term == null)
        break Fail34;
      n_71 = term;
      term = n_5.invoke(context, l_71);
      if(term == null)
        break Fail34;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consGte_2, new IStrategoTerm[]{n_71, term}), checkListAnnos(termFactory, m_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}