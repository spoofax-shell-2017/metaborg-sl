package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Or_2_0 extends Strategy 
{ 
  public static $Or_2_0 instance = new $Or_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_5, Strategy t_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Or_2_0");
    Fail37:
    { 
      IStrategoTerm b_72 = null;
      IStrategoTerm z_71 = null;
      IStrategoTerm a_72 = null;
      IStrategoTerm c_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail37;
      z_71 = term.getSubterm(0);
      a_72 = term.getSubterm(1);
      IStrategoList annos15 = term.getAnnotations();
      b_72 = annos15;
      term = s_5.invoke(context, z_71);
      if(term == null)
        break Fail37;
      c_72 = term;
      term = t_5.invoke(context, a_72);
      if(term == null)
        break Fail37;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consOr_2, new IStrategoTerm[]{c_72, term}), checkListAnnos(termFactory, b_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}