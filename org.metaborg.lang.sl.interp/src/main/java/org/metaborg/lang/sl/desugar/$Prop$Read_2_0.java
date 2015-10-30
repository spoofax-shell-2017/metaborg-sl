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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_6, Strategy b_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PropRead_2_0");
    Fail41:
    { 
      IStrategoTerm v_72 = null;
      IStrategoTerm t_72 = null;
      IStrategoTerm u_72 = null;
      IStrategoTerm w_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consPropRead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail41;
      t_72 = term.getSubterm(0);
      u_72 = term.getSubterm(1);
      IStrategoList annos19 = term.getAnnotations();
      v_72 = annos19;
      term = a_6.invoke(context, t_72);
      if(term == null)
        break Fail41;
      w_72 = term;
      term = b_6.invoke(context, u_72);
      if(term == null)
        break Fail41;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consPropRead_2, new IStrategoTerm[]{w_72, term}), checkListAnnos(termFactory, v_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}