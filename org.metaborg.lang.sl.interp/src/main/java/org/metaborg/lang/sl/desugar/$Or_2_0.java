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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_5, Strategy n_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Or_2_0");
    Fail35:
    { 
      IStrategoTerm v_71 = null;
      IStrategoTerm t_71 = null;
      IStrategoTerm u_71 = null;
      IStrategoTerm w_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail35;
      t_71 = term.getSubterm(0);
      u_71 = term.getSubterm(1);
      IStrategoList annos15 = term.getAnnotations();
      v_71 = annos15;
      term = m_5.invoke(context, t_71);
      if(term == null)
        break Fail35;
      w_71 = term;
      term = n_5.invoke(context, u_71);
      if(term == null)
        break Fail35;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consOr_2, new IStrategoTerm[]{w_71, term}), checkListAnnos(termFactory, v_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}