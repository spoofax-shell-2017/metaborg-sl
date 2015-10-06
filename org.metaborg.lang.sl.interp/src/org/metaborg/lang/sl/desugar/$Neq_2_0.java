package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Neq_2_0 extends Strategy 
{ 
  public static $Neq_2_0 instance = new $Neq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_4, Strategy z_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Neq_2_0");
    Fail31:
    { 
      IStrategoTerm x_70 = null;
      IStrategoTerm v_70 = null;
      IStrategoTerm w_70 = null;
      IStrategoTerm y_70 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consNeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail31;
      v_70 = term.getSubterm(0);
      w_70 = term.getSubterm(1);
      IStrategoList annos11 = term.getAnnotations();
      x_70 = annos11;
      term = y_4.invoke(context, v_70);
      if(term == null)
        break Fail31;
      y_70 = term;
      term = z_4.invoke(context, w_70);
      if(term == null)
        break Fail31;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consNeq_2, new IStrategoTerm[]{y_70, term}), checkListAnnos(termFactory, x_70));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}