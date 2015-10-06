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
    Fail16:
    { 
      IStrategoTerm term23 = term;
      Success12:
      { 
        Fail17:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail17;
          term = desugar.constNoParamSeq0;
          if(true)
            break Success12;
        }
        term = term23;
        IStrategoTerm j_4 = null;
        IStrategoTerm k_4 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail16;
        j_4 = ((IStrategoList)term).head();
        k_4 = ((IStrategoList)term).tail();
        term = this.invoke(context, k_4);
        if(term == null)
          break Fail16;
        term = termFactory.makeAppl(desugar._consParamSeq_2, new IStrategoTerm[]{j_4, term});
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}