package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Return_1_0 extends Strategy 
{ 
  public static $Return_1_0 instance = new $Return_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Return_1_0");
    Fail49:
    { 
      IStrategoTerm g_74 = null;
      IStrategoTerm f_74 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consReturn_1 != ((IStrategoAppl)term).getConstructor())
        break Fail49;
      f_74 = term.getSubterm(0);
      IStrategoList annos27 = term.getAnnotations();
      g_74 = annos27;
      term = p_6.invoke(context, f_74);
      if(term == null)
        break Fail49;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consReturn_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_74));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}