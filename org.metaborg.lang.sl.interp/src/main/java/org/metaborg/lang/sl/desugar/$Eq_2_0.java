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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_4, Strategy j_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Eq_2_0");
    Fail25:
    { 
      IStrategoTerm p_69 = null;
      IStrategoTerm n_69 = null;
      IStrategoTerm o_69 = null;
      IStrategoTerm q_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consEq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail25;
      n_69 = term.getSubterm(0);
      o_69 = term.getSubterm(1);
      IStrategoList annos8 = term.getAnnotations();
      p_69 = annos8;
      term = i_4.invoke(context, n_69);
      if(term == null)
        break Fail25;
      q_69 = term;
      term = j_4.invoke(context, o_69);
      if(term == null)
        break Fail25;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consEq_2, new IStrategoTerm[]{q_69, term}), checkListAnnos(termFactory, p_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}