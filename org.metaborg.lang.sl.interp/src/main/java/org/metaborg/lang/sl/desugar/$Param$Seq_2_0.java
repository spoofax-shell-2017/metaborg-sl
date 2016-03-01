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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_6, Strategy y_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ParamSeq_2_0");
    Fail57:
    { 
      IStrategoTerm b_75 = null;
      IStrategoTerm z_74 = null;
      IStrategoTerm a_75 = null;
      IStrategoTerm c_75 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consParamSeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail57;
      z_74 = term.getSubterm(0);
      a_75 = term.getSubterm(1);
      IStrategoList annos31 = term.getAnnotations();
      b_75 = annos31;
      term = x_6.invoke(context, z_74);
      if(term == null)
        break Fail57;
      c_75 = term;
      term = y_6.invoke(context, a_75);
      if(term == null)
        break Fail57;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consParamSeq_2, new IStrategoTerm[]{c_75, term}), checkListAnnos(termFactory, b_75));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}