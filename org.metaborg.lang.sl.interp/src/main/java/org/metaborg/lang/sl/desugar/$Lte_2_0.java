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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4, Strategy l_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Lte_2_0");
    Fail26:
    { 
      IStrategoTerm u_69 = null;
      IStrategoTerm s_69 = null;
      IStrategoTerm t_69 = null;
      IStrategoTerm v_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consLte_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26;
      s_69 = term.getSubterm(0);
      t_69 = term.getSubterm(1);
      IStrategoList annos9 = term.getAnnotations();
      u_69 = annos9;
      term = k_4.invoke(context, s_69);
      if(term == null)
        break Fail26;
      v_69 = term;
      term = l_4.invoke(context, t_69);
      if(term == null)
        break Fail26;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consLte_2, new IStrategoTerm[]{v_69, term}), checkListAnnos(termFactory, u_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}