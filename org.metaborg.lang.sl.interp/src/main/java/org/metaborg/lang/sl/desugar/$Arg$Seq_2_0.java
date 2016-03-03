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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_5, Strategy z_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ArgSeq_2_0");
    Fail50:
    { 
      IStrategoTerm r_73 = null;
      IStrategoTerm p_73 = null;
      IStrategoTerm q_73 = null;
      IStrategoTerm s_73 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consArgSeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail50;
      p_73 = term.getSubterm(0);
      q_73 = term.getSubterm(1);
      IStrategoList annos30 = term.getAnnotations();
      r_73 = annos30;
      term = y_5.invoke(context, p_73);
      if(term == null)
        break Fail50;
      s_73 = term;
      term = z_5.invoke(context, q_73);
      if(term == null)
        break Fail50;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consArgSeq_2, new IStrategoTerm[]{s_73, term}), checkListAnnos(termFactory, r_73));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}