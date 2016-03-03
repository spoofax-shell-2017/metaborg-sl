package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $If$Then$Else_3_0 extends Strategy 
{ 
  public static $If$Then$Else_3_0 instance = new $If$Then$Else_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_6, Strategy h_6, Strategy i_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IfThenElse_3_0");
    Fail46:
    { 
      IStrategoTerm v_73 = null;
      IStrategoTerm s_73 = null;
      IStrategoTerm t_73 = null;
      IStrategoTerm u_73 = null;
      IStrategoTerm w_73 = null;
      IStrategoTerm x_73 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consIfThenElse_3 != ((IStrategoAppl)term).getConstructor())
        break Fail46;
      s_73 = term.getSubterm(0);
      t_73 = term.getSubterm(1);
      u_73 = term.getSubterm(2);
      IStrategoList annos26 = term.getAnnotations();
      v_73 = annos26;
      term = g_6.invoke(context, s_73);
      if(term == null)
        break Fail46;
      w_73 = term;
      term = h_6.invoke(context, t_73);
      if(term == null)
        break Fail46;
      x_73 = term;
      term = i_6.invoke(context, u_73);
      if(term == null)
        break Fail46;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consIfThenElse_3, new IStrategoTerm[]{w_73, x_73, term}), checkListAnnos(termFactory, v_73));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}