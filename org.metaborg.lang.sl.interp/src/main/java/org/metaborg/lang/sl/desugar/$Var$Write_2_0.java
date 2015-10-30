package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Var$Write_2_0 extends Strategy 
{ 
  public static $Var$Write_2_0 instance = new $Var$Write_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_5, Strategy z_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarWrite_2_0");
    Fail40:
    { 
      IStrategoTerm q_72 = null;
      IStrategoTerm o_72 = null;
      IStrategoTerm p_72 = null;
      IStrategoTerm r_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consVarWrite_2 != ((IStrategoAppl)term).getConstructor())
        break Fail40;
      o_72 = term.getSubterm(0);
      p_72 = term.getSubterm(1);
      IStrategoList annos18 = term.getAnnotations();
      q_72 = annos18;
      term = y_5.invoke(context, o_72);
      if(term == null)
        break Fail40;
      r_72 = term;
      term = z_5.invoke(context, p_72);
      if(term == null)
        break Fail40;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consVarWrite_2, new IStrategoTerm[]{r_72, term}), checkListAnnos(termFactory, q_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}