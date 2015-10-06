package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Prop$Write_3_0 extends Strategy 
{ 
  public static $Prop$Write_3_0 instance = new $Prop$Write_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_5, Strategy p_5, Strategy q_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PropWrite_3_0");
    Fail40:
    { 
      IStrategoTerm n_72 = null;
      IStrategoTerm k_72 = null;
      IStrategoTerm l_72 = null;
      IStrategoTerm m_72 = null;
      IStrategoTerm o_72 = null;
      IStrategoTerm p_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consPropWrite_3 != ((IStrategoAppl)term).getConstructor())
        break Fail40;
      k_72 = term.getSubterm(0);
      l_72 = term.getSubterm(1);
      m_72 = term.getSubterm(2);
      IStrategoList annos20 = term.getAnnotations();
      n_72 = annos20;
      term = o_5.invoke(context, k_72);
      if(term == null)
        break Fail40;
      o_72 = term;
      term = p_5.invoke(context, l_72);
      if(term == null)
        break Fail40;
      p_72 = term;
      term = q_5.invoke(context, m_72);
      if(term == null)
        break Fail40;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consPropWrite_3, new IStrategoTerm[]{o_72, p_72, term}), checkListAnnos(termFactory, n_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}