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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_5, Strategy d_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Sub_2_0");
    Fail29:
    { 
      IStrategoTerm n_70 = null;
      IStrategoTerm l_70 = null;
      IStrategoTerm m_70 = null;
      IStrategoTerm o_70 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consSub_2 != ((IStrategoAppl)term).getConstructor())
        break Fail29;
      l_70 = term.getSubterm(0);
      m_70 = term.getSubterm(1);
      IStrategoList annos7 = term.getAnnotations();
      n_70 = annos7;
      term = c_5.invoke(context, l_70);
      if(term == null)
        break Fail29;
      o_70 = term;
      term = d_5.invoke(context, m_70);
      if(term == null)
        break Fail29;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consSub_2, new IStrategoTerm[]{o_70, term}), checkListAnnos(termFactory, n_70));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}