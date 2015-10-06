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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_5, Strategy n_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PropRead_2_0");
    Fail39:
    { 
      IStrategoTerm h_72 = null;
      IStrategoTerm f_72 = null;
      IStrategoTerm g_72 = null;
      IStrategoTerm i_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consPropRead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail39;
      f_72 = term.getSubterm(0);
      g_72 = term.getSubterm(1);
      IStrategoList annos19 = term.getAnnotations();
      h_72 = annos19;
      term = m_5.invoke(context, f_72);
      if(term == null)
        break Fail39;
      i_72 = term;
      term = n_5.invoke(context, g_72);
      if(term == null)
        break Fail39;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consPropRead_2, new IStrategoTerm[]{i_72, term}), checkListAnnos(termFactory, h_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}