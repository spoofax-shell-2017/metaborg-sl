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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_5, Strategy z_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("While_2_0");
    Fail46:
    { 
      IStrategoTerm l_73 = null;
      IStrategoTerm j_73 = null;
      IStrategoTerm k_73 = null;
      IStrategoTerm m_73 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consWhile_2 != ((IStrategoAppl)term).getConstructor())
        break Fail46;
      j_73 = term.getSubterm(0);
      k_73 = term.getSubterm(1);
      IStrategoList annos25 = term.getAnnotations();
      l_73 = annos25;
      term = y_5.invoke(context, j_73);
      if(term == null)
        break Fail46;
      m_73 = term;
      term = z_5.invoke(context, k_73);
      if(term == null)
        break Fail46;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consWhile_2, new IStrategoTerm[]{m_73, term}), checkListAnnos(termFactory, l_73));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}