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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Return_1_0");
    Fail44:
    { 
      IStrategoTerm d_73 = null;
      IStrategoTerm c_73 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consReturn_1 != ((IStrategoAppl)term).getConstructor())
        break Fail44;
      c_73 = term.getSubterm(0);
      IStrategoList annos27 = term.getAnnotations();
      d_73 = annos27;
      term = t_5.invoke(context, c_73);
      if(term == null)
        break Fail44;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consReturn_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_73));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}