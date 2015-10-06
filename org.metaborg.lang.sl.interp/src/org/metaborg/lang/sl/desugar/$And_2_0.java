package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $And_2_0 extends Strategy 
{ 
  public static $And_2_0 instance = new $And_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_5, Strategy f_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("And_2_0");
    Fail34:
    { 
      IStrategoTerm m_71 = null;
      IStrategoTerm k_71 = null;
      IStrategoTerm l_71 = null;
      IStrategoTerm n_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consAnd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail34;
      k_71 = term.getSubterm(0);
      l_71 = term.getSubterm(1);
      IStrategoList annos14 = term.getAnnotations();
      m_71 = annos14;
      term = e_5.invoke(context, k_71);
      if(term == null)
        break Fail34;
      n_71 = term;
      term = f_5.invoke(context, l_71);
      if(term == null)
        break Fail34;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consAnd_2, new IStrategoTerm[]{n_71, term}), checkListAnnos(termFactory, m_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}