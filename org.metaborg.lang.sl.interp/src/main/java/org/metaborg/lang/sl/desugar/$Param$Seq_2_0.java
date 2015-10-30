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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_7, Strategy c_7)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ParamSeq_2_0");
    Fail59:
    { 
      IStrategoTerm k_75 = null;
      IStrategoTerm i_75 = null;
      IStrategoTerm j_75 = null;
      IStrategoTerm l_75 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consParamSeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail59;
      i_75 = term.getSubterm(0);
      j_75 = term.getSubterm(1);
      IStrategoList annos32 = term.getAnnotations();
      k_75 = annos32;
      term = b_7.invoke(context, i_75);
      if(term == null)
        break Fail59;
      l_75 = term;
      term = c_7.invoke(context, j_75);
      if(term == null)
        break Fail59;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consParamSeq_2, new IStrategoTerm[]{l_75, term}), checkListAnnos(termFactory, k_75));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}