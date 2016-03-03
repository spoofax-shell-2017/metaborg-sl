package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sub_2_0 extends Strategy 
{ 
  public static $Sub_2_0 instance = new $Sub_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_4, Strategy h_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Sub_2_0");
    Fail24:
    { 
      IStrategoTerm k_69 = null;
      IStrategoTerm i_69 = null;
      IStrategoTerm j_69 = null;
      IStrategoTerm l_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consSub_2 != ((IStrategoAppl)term).getConstructor())
        break Fail24;
      i_69 = term.getSubterm(0);
      j_69 = term.getSubterm(1);
      IStrategoList annos7 = term.getAnnotations();
      k_69 = annos7;
      term = g_4.invoke(context, i_69);
      if(term == null)
        break Fail24;
      l_69 = term;
      term = h_4.invoke(context, j_69);
      if(term == null)
        break Fail24;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consSub_2, new IStrategoTerm[]{l_69, term}), checkListAnnos(termFactory, k_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}