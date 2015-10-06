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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4, Strategy v_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunCall_2_0");
    Fail21:
    { 
      IStrategoTerm r_69 = null;
      IStrategoTerm p_69 = null;
      IStrategoTerm q_69 = null;
      IStrategoTerm s_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consFunCall_2 != ((IStrategoAppl)term).getConstructor())
        break Fail21;
      p_69 = term.getSubterm(0);
      q_69 = term.getSubterm(1);
      IStrategoList annos1 = term.getAnnotations();
      r_69 = annos1;
      term = u_4.invoke(context, p_69);
      if(term == null)
        break Fail21;
      s_69 = term;
      term = v_4.invoke(context, q_69);
      if(term == null)
        break Fail21;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consFunCall_2, new IStrategoTerm[]{s_69, term}), checkListAnnos(termFactory, r_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}