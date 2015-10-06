package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Param$Seq_2_0 extends Strategy 
{ 
  public static $Param$Seq_2_0 instance = new $Param$Seq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_6, Strategy o_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ParamSeq_2_0");
    Fail57:
    { 
      IStrategoTerm w_74 = null;
      IStrategoTerm u_74 = null;
      IStrategoTerm v_74 = null;
      IStrategoTerm x_74 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consParamSeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail57;
      u_74 = term.getSubterm(0);
      v_74 = term.getSubterm(1);
      IStrategoList annos32 = term.getAnnotations();
      w_74 = annos32;
      term = n_6.invoke(context, u_74);
      if(term == null)
        break Fail57;
      x_74 = term;
      term = o_6.invoke(context, v_74);
      if(term == null)
        break Fail57;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consParamSeq_2, new IStrategoTerm[]{x_74, term}), checkListAnnos(termFactory, w_74));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}