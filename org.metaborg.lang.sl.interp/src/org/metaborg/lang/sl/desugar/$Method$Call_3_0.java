package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method$Call_3_0 extends Strategy 
{ 
  public static $Method$Call_3_0 instance = new $Method$Call_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_5, Strategy s_5, Strategy t_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodCall_3_0");
    Fail41:
    { 
      IStrategoTerm u_72 = null;
      IStrategoTerm r_72 = null;
      IStrategoTerm s_72 = null;
      IStrategoTerm t_72 = null;
      IStrategoTerm v_72 = null;
      IStrategoTerm w_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consMethodCall_3 != ((IStrategoAppl)term).getConstructor())
        break Fail41;
      r_72 = term.getSubterm(0);
      s_72 = term.getSubterm(1);
      t_72 = term.getSubterm(2);
      IStrategoList annos21 = term.getAnnotations();
      u_72 = annos21;
      term = r_5.invoke(context, r_72);
      if(term == null)
        break Fail41;
      v_72 = term;
      term = s_5.invoke(context, s_72);
      if(term == null)
        break Fail41;
      w_72 = term;
      term = t_5.invoke(context, t_72);
      if(term == null)
        break Fail41;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consMethodCall_3, new IStrategoTerm[]{v_72, w_72, term}), checkListAnnos(termFactory, u_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}