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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_5, Strategy d_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PropRead_2_0");
    Fail36:
    { 
      IStrategoTerm o_71 = null;
      IStrategoTerm m_71 = null;
      IStrategoTerm n_71 = null;
      IStrategoTerm p_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consPropRead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail36;
      m_71 = term.getSubterm(0);
      n_71 = term.getSubterm(1);
      IStrategoList annos19 = term.getAnnotations();
      o_71 = annos19;
      term = c_5.invoke(context, m_71);
      if(term == null)
        break Fail36;
      p_71 = term;
      term = d_5.invoke(context, n_71);
      if(term == null)
        break Fail36;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consPropRead_2, new IStrategoTerm[]{p_71, term}), checkListAnnos(termFactory, o_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}