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
    Fail16:
    { 
      IStrategoTerm term23 = term;
      Success12:
      { 
        Fail17:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail17;
          term = desugar.constNoArgSeq0;
          if(true)
            break Success12;
        }
        term = term23;
        IStrategoTerm z_3 = null;
        IStrategoTerm a_4 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail16;
        z_3 = ((IStrategoList)term).head();
        a_4 = ((IStrategoList)term).tail();
        term = this.invoke(context, a_4);
        if(term == null)
          break Fail16;
        term = termFactory.makeAppl(desugar._consArgSeq_2, new IStrategoTerm[]{z_3, term});
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}