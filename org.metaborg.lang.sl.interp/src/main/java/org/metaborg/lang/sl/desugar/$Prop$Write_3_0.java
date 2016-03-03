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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_5, Strategy v_5, Strategy w_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PropWrite_3_0");
    Fail40:
    { 
      IStrategoTerm r_72 = null;
      IStrategoTerm o_72 = null;
      IStrategoTerm p_72 = null;
      IStrategoTerm q_72 = null;
      IStrategoTerm s_72 = null;
      IStrategoTerm t_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consPropWrite_3 != ((IStrategoAppl)term).getConstructor())
        break Fail40;
      o_72 = term.getSubterm(0);
      p_72 = term.getSubterm(1);
      q_72 = term.getSubterm(2);
      IStrategoList annos20 = term.getAnnotations();
      r_72 = annos20;
      term = u_5.invoke(context, o_72);
      if(term == null)
        break Fail40;
      s_72 = term;
      term = v_5.invoke(context, p_72);
      if(term == null)
        break Fail40;
      t_72 = term;
      term = w_5.invoke(context, q_72);
      if(term == null)
        break Fail40;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consPropWrite_3, new IStrategoTerm[]{s_72, t_72, term}), checkListAnnos(termFactory, r_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}