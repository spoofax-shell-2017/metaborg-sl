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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_4, Strategy h_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunCall_2_0");
    Fail19:
    { 
      IStrategoTerm d_69 = null;
      IStrategoTerm b_69 = null;
      IStrategoTerm c_69 = null;
      IStrategoTerm e_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consFunCall_2 != ((IStrategoAppl)term).getConstructor())
        break Fail19;
      b_69 = term.getSubterm(0);
      c_69 = term.getSubterm(1);
      IStrategoList annos1 = term.getAnnotations();
      d_69 = annos1;
      term = g_4.invoke(context, b_69);
      if(term == null)
        break Fail19;
      e_69 = term;
      term = h_4.invoke(context, c_69);
      if(term == null)
        break Fail19;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consFunCall_2, new IStrategoTerm[]{e_69, term}), checkListAnnos(termFactory, d_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}