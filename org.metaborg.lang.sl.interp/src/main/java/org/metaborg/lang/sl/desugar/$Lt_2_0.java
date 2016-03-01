package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lt_2_0 extends Strategy 
{ 
  public static $Lt_2_0 instance = new $Lt_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_5, Strategy j_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Lt_2_0");
    Fail32:
    { 
      IStrategoTerm c_71 = null;
      IStrategoTerm a_71 = null;
      IStrategoTerm b_71 = null;
      IStrategoTerm d_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consLt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail32;
      a_71 = term.getSubterm(0);
      b_71 = term.getSubterm(1);
      IStrategoList annos10 = term.getAnnotations();
      c_71 = annos10;
      term = i_5.invoke(context, a_71);
      if(term == null)
        break Fail32;
      d_71 = term;
      term = j_5.invoke(context, b_71);
      if(term == null)
        break Fail32;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consLt_2, new IStrategoTerm[]{d_71, term}), checkListAnnos(termFactory, c_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}