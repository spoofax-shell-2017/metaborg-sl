package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $And_2_0 extends Strategy 
{ 
  public static $And_2_0 instance = new $And_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_5, Strategy l_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("And_2_0");
    Fail34:
    { 
      IStrategoTerm q_71 = null;
      IStrategoTerm o_71 = null;
      IStrategoTerm p_71 = null;
      IStrategoTerm r_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consAnd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail34;
      o_71 = term.getSubterm(0);
      p_71 = term.getSubterm(1);
      IStrategoList annos14 = term.getAnnotations();
      q_71 = annos14;
      term = k_5.invoke(context, o_71);
      if(term == null)
        break Fail34;
      r_71 = term;
      term = l_5.invoke(context, p_71);
      if(term == null)
        break Fail34;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consAnd_2, new IStrategoTerm[]{r_71, term}), checkListAnnos(termFactory, q_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}