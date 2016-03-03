package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sub_2_0 extends Strategy 
{ 
  public static $Sub_2_0 instance = new $Sub_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4, Strategy x_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Sub_2_0");
    Fail27:
    { 
      IStrategoTerm h_70 = null;
      IStrategoTerm f_70 = null;
      IStrategoTerm g_70 = null;
      IStrategoTerm i_70 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consSub_2 != ((IStrategoAppl)term).getConstructor())
        break Fail27;
      f_70 = term.getSubterm(0);
      g_70 = term.getSubterm(1);
      IStrategoList annos7 = term.getAnnotations();
      h_70 = annos7;
      term = w_4.invoke(context, f_70);
      if(term == null)
        break Fail27;
      i_70 = term;
      term = x_4.invoke(context, g_70);
      if(term == null)
        break Fail27;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consSub_2, new IStrategoTerm[]{i_70, term}), checkListAnnos(termFactory, h_70));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}