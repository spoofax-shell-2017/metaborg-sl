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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_5, Strategy r_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarWrite_2_0");
    Fail38:
    { 
      IStrategoTerm g_72 = null;
      IStrategoTerm e_72 = null;
      IStrategoTerm f_72 = null;
      IStrategoTerm h_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consVarWrite_2 != ((IStrategoAppl)term).getConstructor())
        break Fail38;
      e_72 = term.getSubterm(0);
      f_72 = term.getSubterm(1);
      IStrategoList annos18 = term.getAnnotations();
      g_72 = annos18;
      term = q_5.invoke(context, e_72);
      if(term == null)
        break Fail38;
      h_72 = term;
      term = r_5.invoke(context, f_72);
      if(term == null)
        break Fail38;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consVarWrite_2, new IStrategoTerm[]{h_72, term}), checkListAnnos(termFactory, g_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}