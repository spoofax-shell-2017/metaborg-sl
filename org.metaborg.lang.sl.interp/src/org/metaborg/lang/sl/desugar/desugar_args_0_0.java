package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class desugar_args_0_0 extends Strategy 
{ 
  public static desugar_args_0_0 instance = new desugar_args_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("desugar_args_0_0");
    Fail18:
    { 
      IStrategoTerm term24 = term;
      Success13:
      { 
        Fail19:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail19;
          term = desugar.constNoArgSeq0;
          if(true)
            break Success13;
        }
        term = term24;
        IStrategoTerm n_4 = null;
        IStrategoTerm o_4 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail18;
        n_4 = ((IStrategoList)term).head();
        o_4 = ((IStrategoList)term).tail();
        term = this.invoke(context, o_4);
        if(term == null)
          break Fail18;
        term = termFactory.makeAppl(desugar._consArgSeq_2, new IStrategoTerm[]{n_4, term});
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}