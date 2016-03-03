package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Neq_2_0 extends Strategy 
{ 
  public static $Neq_2_0 instance = new $Neq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4, Strategy p_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Neq_2_0");
    Fail28:
    { 
      IStrategoTerm e_70 = null;
      IStrategoTerm c_70 = null;
      IStrategoTerm d_70 = null;
      IStrategoTerm f_70 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consNeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail28;
      c_70 = term.getSubterm(0);
      d_70 = term.getSubterm(1);
      IStrategoList annos11 = term.getAnnotations();
      e_70 = annos11;
      term = o_4.invoke(context, c_70);
      if(term == null)
        break Fail28;
      f_70 = term;
      term = p_4.invoke(context, d_70);
      if(term == null)
        break Fail28;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consNeq_2, new IStrategoTerm[]{f_70, term}), checkListAnnos(termFactory, e_70));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}