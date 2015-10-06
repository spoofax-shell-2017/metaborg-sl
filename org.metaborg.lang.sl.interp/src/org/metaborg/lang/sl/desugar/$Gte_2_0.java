package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Gte_2_0 extends Strategy 
{ 
  public static $Gte_2_0 instance = new $Gte_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_5, Strategy b_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Gte_2_0");
    Fail32:
    { 
      IStrategoTerm c_71 = null;
      IStrategoTerm a_71 = null;
      IStrategoTerm b_71 = null;
      IStrategoTerm d_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consGte_2 != ((IStrategoAppl)term).getConstructor())
        break Fail32;
      a_71 = term.getSubterm(0);
      b_71 = term.getSubterm(1);
      IStrategoList annos12 = term.getAnnotations();
      c_71 = annos12;
      term = a_5.invoke(context, a_71);
      if(term == null)
        break Fail32;
      d_71 = term;
      term = b_5.invoke(context, b_71);
      if(term == null)
        break Fail32;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consGte_2, new IStrategoTerm[]{d_71, term}), checkListAnnos(termFactory, c_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}