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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_6, Strategy l_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IfNoElse_2_0");
    Fail47:
    { 
      IStrategoTerm v_73 = null;
      IStrategoTerm t_73 = null;
      IStrategoTerm u_73 = null;
      IStrategoTerm w_73 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consIfNoElse_2 != ((IStrategoAppl)term).getConstructor())
        break Fail47;
      t_73 = term.getSubterm(0);
      u_73 = term.getSubterm(1);
      IStrategoList annos25 = term.getAnnotations();
      v_73 = annos25;
      term = k_6.invoke(context, t_73);
      if(term == null)
        break Fail47;
      w_73 = term;
      term = l_6.invoke(context, u_73);
      if(term == null)
        break Fail47;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consIfNoElse_2, new IStrategoTerm[]{w_73, term}), checkListAnnos(termFactory, v_73));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}