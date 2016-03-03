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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_3, Strategy u_3, Strategy v_3)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunDef_3_0");
    Fail15:
    { 
      IStrategoTerm e_68 = null;
      IStrategoTerm b_68 = null;
      IStrategoTerm c_68 = null;
      IStrategoTerm d_68 = null;
      IStrategoTerm f_68 = null;
      IStrategoTerm g_68 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consFunDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail15;
      b_68 = term.getSubterm(0);
      c_68 = term.getSubterm(1);
      d_68 = term.getSubterm(2);
      IStrategoList annos0 = term.getAnnotations();
      e_68 = annos0;
      term = t_3.invoke(context, b_68);
      if(term == null)
        break Fail15;
      f_68 = term;
      term = u_3.invoke(context, c_68);
      if(term == null)
        break Fail15;
      g_68 = term;
      term = v_3.invoke(context, d_68);
      if(term == null)
        break Fail15;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consFunDef_3, new IStrategoTerm[]{f_68, g_68, term}), checkListAnnos(termFactory, e_68));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}