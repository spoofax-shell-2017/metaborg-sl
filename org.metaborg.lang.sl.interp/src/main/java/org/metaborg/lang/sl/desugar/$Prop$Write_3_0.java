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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_5, Strategy f_5, Strategy g_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PropWrite_3_0");
    Fail37:
    { 
      IStrategoTerm u_71 = null;
      IStrategoTerm r_71 = null;
      IStrategoTerm s_71 = null;
      IStrategoTerm t_71 = null;
      IStrategoTerm v_71 = null;
      IStrategoTerm w_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consPropWrite_3 != ((IStrategoAppl)term).getConstructor())
        break Fail37;
      r_71 = term.getSubterm(0);
      s_71 = term.getSubterm(1);
      t_71 = term.getSubterm(2);
      IStrategoList annos20 = term.getAnnotations();
      u_71 = annos20;
      term = e_5.invoke(context, r_71);
      if(term == null)
        break Fail37;
      v_71 = term;
      term = f_5.invoke(context, s_71);
      if(term == null)
        break Fail37;
      w_71 = term;
      term = g_5.invoke(context, t_71);
      if(term == null)
        break Fail37;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consPropWrite_3, new IStrategoTerm[]{v_71, w_71, term}), checkListAnnos(termFactory, u_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}