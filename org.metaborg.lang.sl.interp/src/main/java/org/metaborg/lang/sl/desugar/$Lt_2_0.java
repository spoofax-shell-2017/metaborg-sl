package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lt_2_0 extends Strategy 
{ 
  public static $Lt_2_0 instance = new $Lt_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_5, Strategy d_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Lt_2_0");
    Fail30:
    { 
      IStrategoTerm w_70 = null;
      IStrategoTerm u_70 = null;
      IStrategoTerm v_70 = null;
      IStrategoTerm x_70 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consLt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail30;
      u_70 = term.getSubterm(0);
      v_70 = term.getSubterm(1);
      IStrategoList annos10 = term.getAnnotations();
      w_70 = annos10;
      term = c_5.invoke(context, u_70);
      if(term == null)
        break Fail30;
      x_70 = term;
      term = d_5.invoke(context, v_70);
      if(term == null)
        break Fail30;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consLt_2, new IStrategoTerm[]{x_70, term}), checkListAnnos(termFactory, w_70));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}