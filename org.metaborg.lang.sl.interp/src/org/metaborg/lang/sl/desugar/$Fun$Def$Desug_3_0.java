package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Fun$Def$Desug_3_0 extends Strategy 
{ 
  public static $Fun$Def$Desug_3_0 instance = new $Fun$Def$Desug_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_6, Strategy l_6, Strategy m_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunDefDesug_3_0");
    Fail56:
    { 
      IStrategoTerm q_74 = null;
      IStrategoTerm n_74 = null;
      IStrategoTerm o_74 = null;
      IStrategoTerm p_74 = null;
      IStrategoTerm r_74 = null;
      IStrategoTerm s_74 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consFunDefDesug_3 != ((IStrategoAppl)term).getConstructor())
        break Fail56;
      n_74 = term.getSubterm(0);
      o_74 = term.getSubterm(1);
      p_74 = term.getSubterm(2);
      IStrategoList annos31 = term.getAnnotations();
      q_74 = annos31;
      term = k_6.invoke(context, n_74);
      if(term == null)
        break Fail56;
      r_74 = term;
      term = l_6.invoke(context, o_74);
      if(term == null)
        break Fail56;
      s_74 = term;
      term = m_6.invoke(context, p_74);
      if(term == null)
        break Fail56;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consFunDefDesug_3, new IStrategoTerm[]{r_74, s_74, term}), checkListAnnos(termFactory, q_74));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}