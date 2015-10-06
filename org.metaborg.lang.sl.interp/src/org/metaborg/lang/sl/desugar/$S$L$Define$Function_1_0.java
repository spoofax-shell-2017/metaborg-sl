package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$L$Define$Function_1_0 extends Strategy 
{ 
  public static $S$L$Define$Function_1_0 instance = new $S$L$Define$Function_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SLDefineFunction_1_0");
    Fail63:
    { 
      IStrategoTerm r_75 = null;
      IStrategoTerm q_75 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consSLDefineFunction_1 != ((IStrategoAppl)term).getConstructor())
        break Fail63;
      q_75 = term.getSubterm(0);
      IStrategoList annos36 = term.getAnnotations();
      r_75 = annos36;
      term = w_6.invoke(context, q_75);
      if(term == null)
        break Fail63;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consSLDefineFunction_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_75));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}