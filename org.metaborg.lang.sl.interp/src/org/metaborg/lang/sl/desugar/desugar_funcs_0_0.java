package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class desugar_funcs_0_0 extends Strategy 
{ 
  public static desugar_funcs_0_0 instance = new desugar_funcs_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("desugar_funcs_0_0");
    Fail12:
    { 
      IStrategoTerm term21 = term;
      Success10:
      { 
        Fail13:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail13;
          term = desugar.constNoFunDefSeq0;
          if(true)
            break Success10;
        }
        term = term21;
        IStrategoTerm r_3 = null;
        IStrategoTerm s_3 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail12;
        r_3 = ((IStrategoList)term).head();
        s_3 = ((IStrategoList)term).tail();
        term = this.invoke(context, s_3);
        if(term == null)
          break Fail12;
        term = termFactory.makeAppl(desugar._consFunDefSeq_2, new IStrategoTerm[]{r_3, term});
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}