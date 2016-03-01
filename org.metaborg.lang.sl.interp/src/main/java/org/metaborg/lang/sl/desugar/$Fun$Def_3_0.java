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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_4, Strategy q_4, Strategy r_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunDef_3_0");
    Fail20:
    { 
      IStrategoTerm h_69 = null;
      IStrategoTerm e_69 = null;
      IStrategoTerm f_69 = null;
      IStrategoTerm g_69 = null;
      IStrategoTerm i_69 = null;
      IStrategoTerm j_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consFunDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail20;
      e_69 = term.getSubterm(0);
      f_69 = term.getSubterm(1);
      g_69 = term.getSubterm(2);
      IStrategoList annos0 = term.getAnnotations();
      h_69 = annos0;
      term = p_4.invoke(context, e_69);
      if(term == null)
        break Fail20;
      i_69 = term;
      term = q_4.invoke(context, f_69);
      if(term == null)
        break Fail20;
      j_69 = term;
      term = r_4.invoke(context, g_69);
      if(term == null)
        break Fail20;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consFunDef_3, new IStrategoTerm[]{i_69, j_69, term}), checkListAnnos(termFactory, h_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}