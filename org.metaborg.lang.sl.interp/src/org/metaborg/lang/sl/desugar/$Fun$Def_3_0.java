package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Fun$Def_3_0 extends Strategy 
{ 
  public static $Fun$Def_3_0 instance = new $Fun$Def_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4, Strategy e_4, Strategy f_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunDef_3_0");
    Fail18:
    { 
      IStrategoTerm x_68 = null;
      IStrategoTerm u_68 = null;
      IStrategoTerm v_68 = null;
      IStrategoTerm w_68 = null;
      IStrategoTerm y_68 = null;
      IStrategoTerm z_68 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consFunDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail18;
      u_68 = term.getSubterm(0);
      v_68 = term.getSubterm(1);
      w_68 = term.getSubterm(2);
      IStrategoList annos0 = term.getAnnotations();
      x_68 = annos0;
      term = d_4.invoke(context, u_68);
      if(term == null)
        break Fail18;
      y_68 = term;
      term = e_4.invoke(context, v_68);
      if(term == null)
        break Fail18;
      z_68 = term;
      term = f_4.invoke(context, w_68);
      if(term == null)
        break Fail18;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consFunDef_3, new IStrategoTerm[]{y_68, z_68, term}), checkListAnnos(termFactory, x_68));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}