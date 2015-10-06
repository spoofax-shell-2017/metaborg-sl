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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_6, Strategy b_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IfNoElse_2_0");
    Fail47:
    { 
      IStrategoTerm q_73 = null;
      IStrategoTerm o_73 = null;
      IStrategoTerm p_73 = null;
      IStrategoTerm r_73 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consIfNoElse_2 != ((IStrategoAppl)term).getConstructor())
        break Fail47;
      o_73 = term.getSubterm(0);
      p_73 = term.getSubterm(1);
      IStrategoList annos26 = term.getAnnotations();
      q_73 = annos26;
      term = a_6.invoke(context, o_73);
      if(term == null)
        break Fail47;
      r_73 = term;
      term = b_6.invoke(context, p_73);
      if(term == null)
        break Fail47;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consIfNoElse_2, new IStrategoTerm[]{r_73, term}), checkListAnnos(termFactory, q_73));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}