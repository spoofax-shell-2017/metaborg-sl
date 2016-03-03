package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Prop$Read_2_0 extends Strategy 
{ 
  public static $Prop$Read_2_0 instance = new $Prop$Read_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_5, Strategy t_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PropRead_2_0");
    Fail39:
    { 
      IStrategoTerm l_72 = null;
      IStrategoTerm j_72 = null;
      IStrategoTerm k_72 = null;
      IStrategoTerm m_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consPropRead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail39;
      j_72 = term.getSubterm(0);
      k_72 = term.getSubterm(1);
      IStrategoList annos19 = term.getAnnotations();
      l_72 = annos19;
      term = s_5.invoke(context, j_72);
      if(term == null)
        break Fail39;
      m_72 = term;
      term = t_5.invoke(context, k_72);
      if(term == null)
        break Fail39;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consPropRead_2, new IStrategoTerm[]{m_72, term}), checkListAnnos(termFactory, l_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}