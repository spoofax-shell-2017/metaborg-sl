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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_6, Strategy n_6, Strategy o_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IfThenElse_3_0");
    Fail48:
    { 
      IStrategoTerm b_74 = null;
      IStrategoTerm y_73 = null;
      IStrategoTerm z_73 = null;
      IStrategoTerm a_74 = null;
      IStrategoTerm c_74 = null;
      IStrategoTerm d_74 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consIfThenElse_3 != ((IStrategoAppl)term).getConstructor())
        break Fail48;
      y_73 = term.getSubterm(0);
      z_73 = term.getSubterm(1);
      a_74 = term.getSubterm(2);
      IStrategoList annos26 = term.getAnnotations();
      b_74 = annos26;
      term = m_6.invoke(context, y_73);
      if(term == null)
        break Fail48;
      c_74 = term;
      term = n_6.invoke(context, z_73);
      if(term == null)
        break Fail48;
      d_74 = term;
      term = o_6.invoke(context, a_74);
      if(term == null)
        break Fail48;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consIfThenElse_3, new IStrategoTerm[]{c_74, d_74, term}), checkListAnnos(termFactory, b_74));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}