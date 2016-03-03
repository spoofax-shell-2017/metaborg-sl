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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_4, Strategy r_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Gte_2_0");
    Fail29:
    { 
      IStrategoTerm j_70 = null;
      IStrategoTerm h_70 = null;
      IStrategoTerm i_70 = null;
      IStrategoTerm k_70 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consGte_2 != ((IStrategoAppl)term).getConstructor())
        break Fail29;
      h_70 = term.getSubterm(0);
      i_70 = term.getSubterm(1);
      IStrategoList annos12 = term.getAnnotations();
      j_70 = annos12;
      term = q_4.invoke(context, h_70);
      if(term == null)
        break Fail29;
      k_70 = term;
      term = r_4.invoke(context, i_70);
      if(term == null)
        break Fail29;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consGte_2, new IStrategoTerm[]{k_70, term}), checkListAnnos(termFactory, j_70));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}