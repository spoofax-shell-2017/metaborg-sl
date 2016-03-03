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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_6, Strategy y_6, Strategy z_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodCallDesug_3_0");
    Fail60:
    { 
      IStrategoTerm l_75 = null;
      IStrategoTerm i_75 = null;
      IStrategoTerm j_75 = null;
      IStrategoTerm k_75 = null;
      IStrategoTerm m_75 = null;
      IStrategoTerm n_75 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consMethodCallDesug_3 != ((IStrategoAppl)term).getConstructor())
        break Fail60;
      i_75 = term.getSubterm(0);
      j_75 = term.getSubterm(1);
      k_75 = term.getSubterm(2);
      IStrategoList annos34 = term.getAnnotations();
      l_75 = annos34;
      term = x_6.invoke(context, i_75);
      if(term == null)
        break Fail60;
      m_75 = term;
      term = y_6.invoke(context, j_75);
      if(term == null)
        break Fail60;
      n_75 = term;
      term = z_6.invoke(context, k_75);
      if(term == null)
        break Fail60;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consMethodCallDesug_3, new IStrategoTerm[]{m_75, n_75, term}), checkListAnnos(termFactory, l_75));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}