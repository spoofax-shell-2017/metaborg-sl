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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_7)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SLDefineFunction_1_0");
    Fail61:
    { 
      IStrategoTerm q_75 = null;
      IStrategoTerm p_75 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consSLDefineFunction_1 != ((IStrategoAppl)term).getConstructor())
        break Fail61;
      p_75 = term.getSubterm(0);
      IStrategoList annos35 = term.getAnnotations();
      q_75 = annos35;
      term = a_7.invoke(context, p_75);
      if(term == null)
        break Fail61;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consSLDefineFunction_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_75));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}