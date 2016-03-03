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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_6, Strategy f_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IfNoElse_2_0");
    Fail45:
    { 
      IStrategoTerm p_73 = null;
      IStrategoTerm n_73 = null;
      IStrategoTerm o_73 = null;
      IStrategoTerm q_73 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consIfNoElse_2 != ((IStrategoAppl)term).getConstructor())
        break Fail45;
      n_73 = term.getSubterm(0);
      o_73 = term.getSubterm(1);
      IStrategoList annos25 = term.getAnnotations();
      p_73 = annos25;
      term = e_6.invoke(context, n_73);
      if(term == null)
        break Fail45;
      q_73 = term;
      term = f_6.invoke(context, o_73);
      if(term == null)
        break Fail45;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consIfNoElse_2, new IStrategoTerm[]{q_73, term}), checkListAnnos(termFactory, p_73));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}