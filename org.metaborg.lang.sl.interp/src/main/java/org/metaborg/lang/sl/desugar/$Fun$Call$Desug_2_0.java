package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Fun$Call$Desug_2_0 extends Strategy 
{ 
  public static $Fun$Call$Desug_2_0 instance = new $Fun$Call$Desug_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_5, Strategy x_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunCallDesug_2_0");
    Fail49:
    { 
      IStrategoTerm m_73 = null;
      IStrategoTerm k_73 = null;
      IStrategoTerm l_73 = null;
      IStrategoTerm n_73 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consFunCallDesug_2 != ((IStrategoAppl)term).getConstructor())
        break Fail49;
      k_73 = term.getSubterm(0);
      l_73 = term.getSubterm(1);
      IStrategoList annos29 = term.getAnnotations();
      m_73 = annos29;
      term = w_5.invoke(context, k_73);
      if(term == null)
        break Fail49;
      n_73 = term;
      term = x_5.invoke(context, l_73);
      if(term == null)
        break Fail49;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consFunCallDesug_2, new IStrategoTerm[]{n_73, term}), checkListAnnos(termFactory, m_73));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}