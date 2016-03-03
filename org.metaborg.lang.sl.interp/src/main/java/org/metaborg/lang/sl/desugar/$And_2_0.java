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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4, Strategy v_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("And_2_0");
    Fail31:
    { 
      IStrategoTerm t_70 = null;
      IStrategoTerm r_70 = null;
      IStrategoTerm s_70 = null;
      IStrategoTerm u_70 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consAnd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail31;
      r_70 = term.getSubterm(0);
      s_70 = term.getSubterm(1);
      IStrategoList annos14 = term.getAnnotations();
      t_70 = annos14;
      term = u_4.invoke(context, r_70);
      if(term == null)
        break Fail31;
      u_70 = term;
      term = v_4.invoke(context, s_70);
      if(term == null)
        break Fail31;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consAnd_2, new IStrategoTerm[]{u_70, term}), checkListAnnos(termFactory, t_70));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}