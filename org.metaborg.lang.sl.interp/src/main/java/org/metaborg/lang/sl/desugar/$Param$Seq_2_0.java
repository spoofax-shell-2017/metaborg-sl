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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_6, Strategy s_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ParamSeq_2_0");
    Fail55:
    { 
      IStrategoTerm v_74 = null;
      IStrategoTerm t_74 = null;
      IStrategoTerm u_74 = null;
      IStrategoTerm w_74 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consParamSeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail55;
      t_74 = term.getSubterm(0);
      u_74 = term.getSubterm(1);
      IStrategoList annos31 = term.getAnnotations();
      v_74 = annos31;
      term = r_6.invoke(context, t_74);
      if(term == null)
        break Fail55;
      w_74 = term;
      term = s_6.invoke(context, u_74);
      if(term == null)
        break Fail55;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consParamSeq_2, new IStrategoTerm[]{w_74, term}), checkListAnnos(termFactory, v_74));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}