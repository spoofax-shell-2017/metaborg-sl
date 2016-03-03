package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $String_1_0 extends Strategy 
{ 
  public static $String_1_0 instance = new $String_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_3)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("String_1_0");
    Fail18:
    { 
      IStrategoTerm r_68 = null;
      IStrategoTerm q_68 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consString_1 != ((IStrategoAppl)term).getConstructor())
        break Fail18;
      q_68 = term.getSubterm(0);
      IStrategoList annos3 = term.getAnnotations();
      r_68 = annos3;
      term = z_3.invoke(context, q_68);
      if(term == null)
        break Fail18;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consString_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_68));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}