package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Add_2_0 extends Strategy 
{ 
  public static $Add_2_0 instance = new $Add_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4, Strategy l_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Add_2_0");
    Fail24:
    { 
      IStrategoTerm o_69 = null;
      IStrategoTerm m_69 = null;
      IStrategoTerm n_69 = null;
      IStrategoTerm p_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consAdd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail24;
      m_69 = term.getSubterm(0);
      n_69 = term.getSubterm(1);
      IStrategoList annos4 = term.getAnnotations();
      o_69 = annos4;
      term = k_4.invoke(context, m_69);
      if(term == null)
        break Fail24;
      p_69 = term;
      term = l_4.invoke(context, n_69);
      if(term == null)
        break Fail24;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consAdd_2, new IStrategoTerm[]{p_69, term}), checkListAnnos(termFactory, o_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}