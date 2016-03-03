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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_4, Strategy k_4, Strategy l_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunDef_3_0");
    Fail18:
    { 
      IStrategoTerm b_69 = null;
      IStrategoTerm y_68 = null;
      IStrategoTerm z_68 = null;
      IStrategoTerm a_69 = null;
      IStrategoTerm c_69 = null;
      IStrategoTerm d_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consFunDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail18;
      y_68 = term.getSubterm(0);
      z_68 = term.getSubterm(1);
      a_69 = term.getSubterm(2);
      IStrategoList annos0 = term.getAnnotations();
      b_69 = annos0;
      term = j_4.invoke(context, y_68);
      if(term == null)
        break Fail18;
      c_69 = term;
      term = k_4.invoke(context, z_68);
      if(term == null)
        break Fail18;
      d_69 = term;
      term = l_4.invoke(context, a_69);
      if(term == null)
        break Fail18;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consFunDef_3, new IStrategoTerm[]{c_69, d_69, term}), checkListAnnos(termFactory, b_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}