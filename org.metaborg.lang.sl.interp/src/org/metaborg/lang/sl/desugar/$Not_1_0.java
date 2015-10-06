package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Not_1_0 extends Strategy 
{ 
  public static $Not_1_0 instance = new $Not_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Not_1_0");
    Fail36:
    { 
      IStrategoTerm v_71 = null;
      IStrategoTerm u_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consNot_1 != ((IStrategoAppl)term).getConstructor())
        break Fail36;
      u_71 = term.getSubterm(0);
      IStrategoList annos16 = term.getAnnotations();
      v_71 = annos16;
      term = i_5.invoke(context, u_71);
      if(term == null)
        break Fail36;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consNot_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}