package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class desugar_params_0_0 extends Strategy 
{ 
  public static desugar_params_0_0 instance = new desugar_params_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("desugar_params_0_0");
    Fail14:
    { 
      IStrategoTerm term22 = term;
      Success11:
      { 
        Fail15:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail15;
          term = desugar.constNoParamSeq0;
          if(true)
            break Success11;
        }
        term = term22;
        IStrategoTerm v_3 = null;
        IStrategoTerm w_3 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail14;
        v_3 = ((IStrategoList)term).head();
        w_3 = ((IStrategoList)term).tail();
        term = this.invoke(context, w_3);
        if(term == null)
          break Fail14;
        term = termFactory.makeAppl(desugar._consParamSeq_2, new IStrategoTerm[]{v_3, term});
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}