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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_6, Strategy w_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ArgSeq_2_0");
    Fail58:
    { 
      IStrategoTerm f_75 = null;
      IStrategoTerm d_75 = null;
      IStrategoTerm e_75 = null;
      IStrategoTerm g_75 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consArgSeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail58;
      d_75 = term.getSubterm(0);
      e_75 = term.getSubterm(1);
      IStrategoList annos33 = term.getAnnotations();
      f_75 = annos33;
      term = v_6.invoke(context, d_75);
      if(term == null)
        break Fail58;
      g_75 = term;
      term = w_6.invoke(context, e_75);
      if(term == null)
        break Fail58;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consArgSeq_2, new IStrategoTerm[]{g_75, term}), checkListAnnos(termFactory, f_75));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}