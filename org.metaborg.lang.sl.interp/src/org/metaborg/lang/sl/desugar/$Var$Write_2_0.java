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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_5, Strategy l_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarWrite_2_0");
    Fail38:
    { 
      IStrategoTerm c_72 = null;
      IStrategoTerm a_72 = null;
      IStrategoTerm b_72 = null;
      IStrategoTerm d_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consVarWrite_2 != ((IStrategoAppl)term).getConstructor())
        break Fail38;
      a_72 = term.getSubterm(0);
      b_72 = term.getSubterm(1);
      IStrategoList annos18 = term.getAnnotations();
      c_72 = annos18;
      term = k_5.invoke(context, a_72);
      if(term == null)
        break Fail38;
      d_72 = term;
      term = l_5.invoke(context, b_72);
      if(term == null)
        break Fail38;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consVarWrite_2, new IStrategoTerm[]{d_72, term}), checkListAnnos(termFactory, c_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}