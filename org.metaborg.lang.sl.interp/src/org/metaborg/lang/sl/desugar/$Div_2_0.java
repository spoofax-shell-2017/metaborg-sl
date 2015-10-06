package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Div_2_0 extends Strategy 
{ 
  public static $Div_2_0 instance = new $Div_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_4, Strategy n_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Div_2_0");
    Fail25:
    { 
      IStrategoTerm t_69 = null;
      IStrategoTerm r_69 = null;
      IStrategoTerm s_69 = null;
      IStrategoTerm u_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consDiv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail25;
      r_69 = term.getSubterm(0);
      s_69 = term.getSubterm(1);
      IStrategoList annos5 = term.getAnnotations();
      t_69 = annos5;
      term = m_4.invoke(context, r_69);
      if(term == null)
        break Fail25;
      u_69 = term;
      term = n_4.invoke(context, s_69);
      if(term == null)
        break Fail25;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consDiv_2, new IStrategoTerm[]{u_69, term}), checkListAnnos(termFactory, t_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}