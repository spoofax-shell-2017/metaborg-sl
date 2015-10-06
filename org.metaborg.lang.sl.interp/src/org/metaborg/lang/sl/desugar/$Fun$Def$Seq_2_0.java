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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_6, Strategy j_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunDefSeq_2_0");
    Fail54:
    { 
      IStrategoTerm k_74 = null;
      IStrategoTerm i_74 = null;
      IStrategoTerm j_74 = null;
      IStrategoTerm l_74 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consFunDefSeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail54;
      i_74 = term.getSubterm(0);
      j_74 = term.getSubterm(1);
      IStrategoList annos30 = term.getAnnotations();
      k_74 = annos30;
      term = i_6.invoke(context, i_74);
      if(term == null)
        break Fail54;
      l_74 = term;
      term = j_6.invoke(context, j_74);
      if(term == null)
        break Fail54;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consFunDefSeq_2, new IStrategoTerm[]{l_74, term}), checkListAnnos(termFactory, k_74));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}