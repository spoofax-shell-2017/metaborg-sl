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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_4, Strategy n_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunCall_2_0");
    Fail19:
    { 
      IStrategoTerm h_69 = null;
      IStrategoTerm f_69 = null;
      IStrategoTerm g_69 = null;
      IStrategoTerm i_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consFunCall_2 != ((IStrategoAppl)term).getConstructor())
        break Fail19;
      f_69 = term.getSubterm(0);
      g_69 = term.getSubterm(1);
      IStrategoList annos1 = term.getAnnotations();
      h_69 = annos1;
      term = m_4.invoke(context, f_69);
      if(term == null)
        break Fail19;
      i_69 = term;
      term = n_4.invoke(context, g_69);
      if(term == null)
        break Fail19;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consFunCall_2, new IStrategoTerm[]{i_69, term}), checkListAnnos(termFactory, h_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}