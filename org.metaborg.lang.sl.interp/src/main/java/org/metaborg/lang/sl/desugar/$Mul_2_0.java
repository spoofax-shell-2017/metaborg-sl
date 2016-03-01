package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Mul_2_0 extends Strategy 
{ 
  public static $Mul_2_0 instance = new $Mul_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_5, Strategy b_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Mul_2_0");
    Fail28:
    { 
      IStrategoTerm i_70 = null;
      IStrategoTerm g_70 = null;
      IStrategoTerm h_70 = null;
      IStrategoTerm j_70 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consMul_2 != ((IStrategoAppl)term).getConstructor())
        break Fail28;
      g_70 = term.getSubterm(0);
      h_70 = term.getSubterm(1);
      IStrategoList annos6 = term.getAnnotations();
      i_70 = annos6;
      term = a_5.invoke(context, g_70);
      if(term == null)
        break Fail28;
      j_70 = term;
      term = b_5.invoke(context, h_70);
      if(term == null)
        break Fail28;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consMul_2, new IStrategoTerm[]{j_70, term}), checkListAnnos(termFactory, i_70));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}