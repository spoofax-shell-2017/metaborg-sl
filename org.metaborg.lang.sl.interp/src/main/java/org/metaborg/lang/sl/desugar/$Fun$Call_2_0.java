package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Fun$Call_2_0 extends Strategy 
{ 
  public static $Fun$Call_2_0 instance = new $Fun$Call_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_4, Strategy t_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunCall_2_0");
    Fail21:
    { 
      IStrategoTerm n_69 = null;
      IStrategoTerm l_69 = null;
      IStrategoTerm m_69 = null;
      IStrategoTerm o_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consFunCall_2 != ((IStrategoAppl)term).getConstructor())
        break Fail21;
      l_69 = term.getSubterm(0);
      m_69 = term.getSubterm(1);
      IStrategoList annos1 = term.getAnnotations();
      n_69 = annos1;
      term = s_4.invoke(context, l_69);
      if(term == null)
        break Fail21;
      o_69 = term;
      term = t_4.invoke(context, m_69);
      if(term == null)
        break Fail21;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consFunCall_2, new IStrategoTerm[]{o_69, term}), checkListAnnos(termFactory, n_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}