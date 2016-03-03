package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $While_2_0 extends Strategy 
{ 
  public static $While_2_0 instance = new $While_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_6, Strategy d_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("While_2_0");
    Fail44:
    { 
      IStrategoTerm k_73 = null;
      IStrategoTerm i_73 = null;
      IStrategoTerm j_73 = null;
      IStrategoTerm l_73 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consWhile_2 != ((IStrategoAppl)term).getConstructor())
        break Fail44;
      i_73 = term.getSubterm(0);
      j_73 = term.getSubterm(1);
      IStrategoList annos24 = term.getAnnotations();
      k_73 = annos24;
      term = c_6.invoke(context, i_73);
      if(term == null)
        break Fail44;
      l_73 = term;
      term = d_6.invoke(context, j_73);
      if(term == null)
        break Fail44;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consWhile_2, new IStrategoTerm[]{l_73, term}), checkListAnnos(termFactory, k_73));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}