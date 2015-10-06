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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_6, Strategy d_6, Strategy e_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IfThenElse_3_0");
    Fail48:
    { 
      IStrategoTerm w_73 = null;
      IStrategoTerm t_73 = null;
      IStrategoTerm u_73 = null;
      IStrategoTerm v_73 = null;
      IStrategoTerm x_73 = null;
      IStrategoTerm y_73 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consIfThenElse_3 != ((IStrategoAppl)term).getConstructor())
        break Fail48;
      t_73 = term.getSubterm(0);
      u_73 = term.getSubterm(1);
      v_73 = term.getSubterm(2);
      IStrategoList annos27 = term.getAnnotations();
      w_73 = annos27;
      term = c_6.invoke(context, t_73);
      if(term == null)
        break Fail48;
      x_73 = term;
      term = d_6.invoke(context, u_73);
      if(term == null)
        break Fail48;
      y_73 = term;
      term = e_6.invoke(context, v_73);
      if(term == null)
        break Fail48;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consIfThenElse_3, new IStrategoTerm[]{x_73, y_73, term}), checkListAnnos(termFactory, w_73));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}