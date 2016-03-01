package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Prop$Read_2_0 extends Strategy 
{ 
  public static $Prop$Read_2_0 instance = new $Prop$Read_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_5, Strategy z_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PropRead_2_0");
    Fail41:
    { 
      IStrategoTerm r_72 = null;
      IStrategoTerm p_72 = null;
      IStrategoTerm q_72 = null;
      IStrategoTerm s_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consPropRead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail41;
      p_72 = term.getSubterm(0);
      q_72 = term.getSubterm(1);
      IStrategoList annos19 = term.getAnnotations();
      r_72 = annos19;
      term = y_5.invoke(context, p_72);
      if(term == null)
        break Fail41;
      s_72 = term;
      term = z_5.invoke(context, q_72);
      if(term == null)
        break Fail41;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consPropRead_2, new IStrategoTerm[]{s_72, term}), checkListAnnos(termFactory, r_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}