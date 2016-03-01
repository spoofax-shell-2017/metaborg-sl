package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Fun$Def$Seq_2_0 extends Strategy 
{ 
  public static $Fun$Def$Seq_2_0 instance = new $Fun$Def$Seq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_6, Strategy t_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunDefSeq_2_0");
    Fail54:
    { 
      IStrategoTerm p_74 = null;
      IStrategoTerm n_74 = null;
      IStrategoTerm o_74 = null;
      IStrategoTerm q_74 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consFunDefSeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail54;
      n_74 = term.getSubterm(0);
      o_74 = term.getSubterm(1);
      IStrategoList annos29 = term.getAnnotations();
      p_74 = annos29;
      term = s_6.invoke(context, n_74);
      if(term == null)
        break Fail54;
      q_74 = term;
      term = t_6.invoke(context, o_74);
      if(term == null)
        break Fail54;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consFunDefSeq_2, new IStrategoTerm[]{q_74, term}), checkListAnnos(termFactory, p_74));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}