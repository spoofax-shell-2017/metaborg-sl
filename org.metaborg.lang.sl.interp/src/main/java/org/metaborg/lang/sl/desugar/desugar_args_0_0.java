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
    Fail13:
    { 
      IStrategoTerm term20 = term;
      Success10:
      { 
        Fail14:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail14;
          term = desugar.constNoArgSeq0;
          if(true)
            break Success10;
        }
        term = term20;
        IStrategoTerm p_3 = null;
        IStrategoTerm q_3 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail13;
        p_3 = ((IStrategoList)term).head();
        q_3 = ((IStrategoList)term).tail();
        term = this.invoke(context, q_3);
        if(term == null)
          break Fail13;
        term = termFactory.makeAppl(desugar._consArgSeq_2, new IStrategoTerm[]{p_3, term});
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}