package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lte_2_0 extends Strategy 
{ 
  public static $Lte_2_0 instance = new $Lte_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_5, Strategy j_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Lte_2_0");
    Fail31:
    { 
      IStrategoTerm b_71 = null;
      IStrategoTerm z_70 = null;
      IStrategoTerm a_71 = null;
      IStrategoTerm c_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consLte_2 != ((IStrategoAppl)term).getConstructor())
        break Fail31;
      z_70 = term.getSubterm(0);
      a_71 = term.getSubterm(1);
      IStrategoList annos9 = term.getAnnotations();
      b_71 = annos9;
      term = i_5.invoke(context, z_70);
      if(term == null)
        break Fail31;
      c_71 = term;
      term = j_5.invoke(context, a_71);
      if(term == null)
        break Fail31;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consLte_2, new IStrategoTerm[]{c_71, term}), checkListAnnos(termFactory, b_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}