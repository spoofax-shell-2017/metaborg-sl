package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Var$Write_2_0 extends Strategy 
{ 
  public static $Var$Write_2_0 instance = new $Var$Write_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_5, Strategy x_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarWrite_2_0");
    Fail40:
    { 
      IStrategoTerm m_72 = null;
      IStrategoTerm k_72 = null;
      IStrategoTerm l_72 = null;
      IStrategoTerm n_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consVarWrite_2 != ((IStrategoAppl)term).getConstructor())
        break Fail40;
      k_72 = term.getSubterm(0);
      l_72 = term.getSubterm(1);
      IStrategoList annos18 = term.getAnnotations();
      m_72 = annos18;
      term = w_5.invoke(context, k_72);
      if(term == null)
        break Fail40;
      n_72 = term;
      term = x_5.invoke(context, l_72);
      if(term == null)
        break Fail40;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consVarWrite_2, new IStrategoTerm[]{n_72, term}), checkListAnnos(termFactory, m_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}