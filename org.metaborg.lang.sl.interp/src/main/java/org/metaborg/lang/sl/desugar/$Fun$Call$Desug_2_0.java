package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Fun$Call$Desug_2_0 extends Strategy 
{ 
  public static $Fun$Call$Desug_2_0 instance = new $Fun$Call$Desug_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_6, Strategy a_7)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunCallDesug_2_0");
    Fail59:
    { 
      IStrategoTerm g_75 = null;
      IStrategoTerm e_75 = null;
      IStrategoTerm f_75 = null;
      IStrategoTerm h_75 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consFunCallDesug_2 != ((IStrategoAppl)term).getConstructor())
        break Fail59;
      e_75 = term.getSubterm(0);
      f_75 = term.getSubterm(1);
      IStrategoList annos32 = term.getAnnotations();
      g_75 = annos32;
      term = z_6.invoke(context, e_75);
      if(term == null)
        break Fail59;
      h_75 = term;
      term = a_7.invoke(context, f_75);
      if(term == null)
        break Fail59;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consFunCallDesug_2, new IStrategoTerm[]{h_75, term}), checkListAnnos(termFactory, g_75));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}