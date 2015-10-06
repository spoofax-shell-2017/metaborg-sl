package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Fun$Def_3_0 extends Strategy 
{ 
  public static $Fun$Def_3_0 instance = new $Fun$Def_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_4, Strategy s_4, Strategy t_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunDef_3_0");
    Fail20:
    { 
      IStrategoTerm l_69 = null;
      IStrategoTerm i_69 = null;
      IStrategoTerm j_69 = null;
      IStrategoTerm k_69 = null;
      IStrategoTerm m_69 = null;
      IStrategoTerm n_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consFunDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail20;
      i_69 = term.getSubterm(0);
      j_69 = term.getSubterm(1);
      k_69 = term.getSubterm(2);
      IStrategoList annos0 = term.getAnnotations();
      l_69 = annos0;
      term = r_4.invoke(context, i_69);
      if(term == null)
        break Fail20;
      m_69 = term;
      term = s_4.invoke(context, j_69);
      if(term == null)
        break Fail20;
      n_69 = term;
      term = t_4.invoke(context, k_69);
      if(term == null)
        break Fail20;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consFunDef_3, new IStrategoTerm[]{m_69, n_69, term}), checkListAnnos(termFactory, l_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}