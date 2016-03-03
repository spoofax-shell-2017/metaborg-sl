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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_6, Strategy n_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunDefSeq_2_0");
    Fail52:
    { 
      IStrategoTerm j_74 = null;
      IStrategoTerm h_74 = null;
      IStrategoTerm i_74 = null;
      IStrategoTerm k_74 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consFunDefSeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail52;
      h_74 = term.getSubterm(0);
      i_74 = term.getSubterm(1);
      IStrategoList annos29 = term.getAnnotations();
      j_74 = annos29;
      term = m_6.invoke(context, h_74);
      if(term == null)
        break Fail52;
      k_74 = term;
      term = n_6.invoke(context, i_74);
      if(term == null)
        break Fail52;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consFunDefSeq_2, new IStrategoTerm[]{k_74, term}), checkListAnnos(termFactory, j_74));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}