package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $If$No$Else_2_0 extends Strategy 
{ 
  public static $If$No$Else_2_0 instance = new $If$No$Else_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_5, Strategy p_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IfNoElse_2_0");
    Fail42:
    { 
      IStrategoTerm s_72 = null;
      IStrategoTerm q_72 = null;
      IStrategoTerm r_72 = null;
      IStrategoTerm t_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consIfNoElse_2 != ((IStrategoAppl)term).getConstructor())
        break Fail42;
      q_72 = term.getSubterm(0);
      r_72 = term.getSubterm(1);
      IStrategoList annos25 = term.getAnnotations();
      s_72 = annos25;
      term = o_5.invoke(context, q_72);
      if(term == null)
        break Fail42;
      t_72 = term;
      term = p_5.invoke(context, r_72);
      if(term == null)
        break Fail42;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consIfNoElse_2, new IStrategoTerm[]{t_72, term}), checkListAnnos(termFactory, s_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}