package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Arg$Seq_2_0 extends Strategy 
{ 
  public static $Arg$Seq_2_0 instance = new $Arg$Seq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_7, Strategy c_7)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ArgSeq_2_0");
    Fail60:
    { 
      IStrategoTerm l_75 = null;
      IStrategoTerm j_75 = null;
      IStrategoTerm k_75 = null;
      IStrategoTerm m_75 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consArgSeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail60;
      j_75 = term.getSubterm(0);
      k_75 = term.getSubterm(1);
      IStrategoList annos33 = term.getAnnotations();
      l_75 = annos33;
      term = b_7.invoke(context, j_75);
      if(term == null)
        break Fail60;
      m_75 = term;
      term = c_7.invoke(context, k_75);
      if(term == null)
        break Fail60;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consArgSeq_2, new IStrategoTerm[]{m_75, term}), checkListAnnos(termFactory, l_75));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}