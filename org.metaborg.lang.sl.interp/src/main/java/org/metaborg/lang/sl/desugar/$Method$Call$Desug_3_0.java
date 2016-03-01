package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method$Call$Desug_3_0 extends Strategy 
{ 
  public static $Method$Call$Desug_3_0 instance = new $Method$Call$Desug_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_7, Strategy e_7, Strategy f_7)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodCallDesug_3_0");
    Fail62:
    { 
      IStrategoTerm r_75 = null;
      IStrategoTerm o_75 = null;
      IStrategoTerm p_75 = null;
      IStrategoTerm q_75 = null;
      IStrategoTerm s_75 = null;
      IStrategoTerm t_75 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consMethodCallDesug_3 != ((IStrategoAppl)term).getConstructor())
        break Fail62;
      o_75 = term.getSubterm(0);
      p_75 = term.getSubterm(1);
      q_75 = term.getSubterm(2);
      IStrategoList annos34 = term.getAnnotations();
      r_75 = annos34;
      term = d_7.invoke(context, o_75);
      if(term == null)
        break Fail62;
      s_75 = term;
      term = e_7.invoke(context, p_75);
      if(term == null)
        break Fail62;
      t_75 = term;
      term = f_7.invoke(context, q_75);
      if(term == null)
        break Fail62;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consMethodCallDesug_3, new IStrategoTerm[]{s_75, t_75, term}), checkListAnnos(termFactory, r_75));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}