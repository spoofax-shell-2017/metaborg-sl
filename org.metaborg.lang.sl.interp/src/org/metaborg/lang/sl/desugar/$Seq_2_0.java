package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Seq_2_0 extends Strategy 
{ 
  public static $Seq_2_0 instance = new $Seq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_5, Strategy w_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Seq_2_0");
    Fail43:
    { 
      IStrategoTerm d_73 = null;
      IStrategoTerm b_73 = null;
      IStrategoTerm c_73 = null;
      IStrategoTerm e_73 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consSeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail43;
      b_73 = term.getSubterm(0);
      c_73 = term.getSubterm(1);
      IStrategoList annos23 = term.getAnnotations();
      d_73 = annos23;
      term = v_5.invoke(context, b_73);
      if(term == null)
        break Fail43;
      e_73 = term;
      term = w_5.invoke(context, c_73);
      if(term == null)
        break Fail43;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consSeq_2, new IStrategoTerm[]{e_73, term}), checkListAnnos(termFactory, d_73));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}