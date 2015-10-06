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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_6, Strategy s_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ArgSeq_2_0");
    Fail60:
    { 
      IStrategoTerm g_75 = null;
      IStrategoTerm e_75 = null;
      IStrategoTerm f_75 = null;
      IStrategoTerm h_75 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consArgSeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail60;
      e_75 = term.getSubterm(0);
      f_75 = term.getSubterm(1);
      IStrategoList annos34 = term.getAnnotations();
      g_75 = annos34;
      term = r_6.invoke(context, e_75);
      if(term == null)
        break Fail60;
      h_75 = term;
      term = s_6.invoke(context, f_75);
      if(term == null)
        break Fail60;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consArgSeq_2, new IStrategoTerm[]{h_75, term}), checkListAnnos(termFactory, g_75));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}