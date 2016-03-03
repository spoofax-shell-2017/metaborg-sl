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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_3, Strategy x_3)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunCall_2_0");
    Fail16:
    { 
      IStrategoTerm k_68 = null;
      IStrategoTerm i_68 = null;
      IStrategoTerm j_68 = null;
      IStrategoTerm l_68 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consFunCall_2 != ((IStrategoAppl)term).getConstructor())
        break Fail16;
      i_68 = term.getSubterm(0);
      j_68 = term.getSubterm(1);
      IStrategoList annos1 = term.getAnnotations();
      k_68 = annos1;
      term = w_3.invoke(context, i_68);
      if(term == null)
        break Fail16;
      l_68 = term;
      term = x_3.invoke(context, j_68);
      if(term == null)
        break Fail16;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consFunCall_2, new IStrategoTerm[]{l_68, term}), checkListAnnos(termFactory, k_68));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}