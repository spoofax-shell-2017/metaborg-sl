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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_7, Strategy g_7)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ArgSeq_2_0");
    Fail62:
    { 
      IStrategoTerm u_75 = null;
      IStrategoTerm s_75 = null;
      IStrategoTerm t_75 = null;
      IStrategoTerm v_75 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consArgSeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail62;
      s_75 = term.getSubterm(0);
      t_75 = term.getSubterm(1);
      IStrategoList annos34 = term.getAnnotations();
      u_75 = annos34;
      term = f_7.invoke(context, s_75);
      if(term == null)
        break Fail62;
      v_75 = term;
      term = g_7.invoke(context, t_75);
      if(term == null)
        break Fail62;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consArgSeq_2, new IStrategoTerm[]{v_75, term}), checkListAnnos(termFactory, u_75));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}