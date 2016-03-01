package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Fun$Def$Desug_3_0 extends Strategy 
{ 
  public static $Fun$Def$Desug_3_0 instance = new $Fun$Def$Desug_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_6, Strategy v_6, Strategy w_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunDefDesug_3_0");
    Fail56:
    { 
      IStrategoTerm v_74 = null;
      IStrategoTerm s_74 = null;
      IStrategoTerm t_74 = null;
      IStrategoTerm u_74 = null;
      IStrategoTerm w_74 = null;
      IStrategoTerm x_74 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consFunDefDesug_3 != ((IStrategoAppl)term).getConstructor())
        break Fail56;
      s_74 = term.getSubterm(0);
      t_74 = term.getSubterm(1);
      u_74 = term.getSubterm(2);
      IStrategoList annos30 = term.getAnnotations();
      v_74 = annos30;
      term = u_6.invoke(context, s_74);
      if(term == null)
        break Fail56;
      w_74 = term;
      term = v_6.invoke(context, t_74);
      if(term == null)
        break Fail56;
      x_74 = term;
      term = w_6.invoke(context, u_74);
      if(term == null)
        break Fail56;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consFunDefDesug_3, new IStrategoTerm[]{w_74, x_74, term}), checkListAnnos(termFactory, v_74));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}