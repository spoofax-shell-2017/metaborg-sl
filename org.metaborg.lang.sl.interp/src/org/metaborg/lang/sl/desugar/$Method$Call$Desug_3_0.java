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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_6, Strategy u_6, Strategy v_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodCallDesug_3_0");
    Fail62:
    { 
      IStrategoTerm m_75 = null;
      IStrategoTerm j_75 = null;
      IStrategoTerm k_75 = null;
      IStrategoTerm l_75 = null;
      IStrategoTerm n_75 = null;
      IStrategoTerm o_75 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consMethodCallDesug_3 != ((IStrategoAppl)term).getConstructor())
        break Fail62;
      j_75 = term.getSubterm(0);
      k_75 = term.getSubterm(1);
      l_75 = term.getSubterm(2);
      IStrategoList annos35 = term.getAnnotations();
      m_75 = annos35;
      term = t_6.invoke(context, j_75);
      if(term == null)
        break Fail62;
      n_75 = term;
      term = u_6.invoke(context, k_75);
      if(term == null)
        break Fail62;
      o_75 = term;
      term = v_6.invoke(context, l_75);
      if(term == null)
        break Fail62;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consMethodCallDesug_3, new IStrategoTerm[]{n_75, o_75, term}), checkListAnnos(termFactory, m_75));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}