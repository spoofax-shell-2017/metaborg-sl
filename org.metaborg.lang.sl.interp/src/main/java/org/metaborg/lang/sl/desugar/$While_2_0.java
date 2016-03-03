package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $While_2_0 extends Strategy 
{ 
  public static $While_2_0 instance = new $While_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_5, Strategy n_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("While_2_0");
    Fail41:
    { 
      IStrategoTerm n_72 = null;
      IStrategoTerm l_72 = null;
      IStrategoTerm m_72 = null;
      IStrategoTerm o_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consWhile_2 != ((IStrategoAppl)term).getConstructor())
        break Fail41;
      l_72 = term.getSubterm(0);
      m_72 = term.getSubterm(1);
      IStrategoList annos24 = term.getAnnotations();
      n_72 = annos24;
      term = m_5.invoke(context, l_72);
      if(term == null)
        break Fail41;
      o_72 = term;
      term = n_5.invoke(context, m_72);
      if(term == null)
        break Fail41;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consWhile_2, new IStrategoTerm[]{o_72, term}), checkListAnnos(termFactory, n_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}