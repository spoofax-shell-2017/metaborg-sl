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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SLDefineFunction_1_0");
    Fail53:
    { 
      IStrategoTerm c_74 = null;
      IStrategoTerm b_74 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consSLDefineFunction_1 != ((IStrategoAppl)term).getConstructor())
        break Fail53;
      b_74 = term.getSubterm(0);
      IStrategoList annos32 = term.getAnnotations();
      c_74 = annos32;
      term = d_6.invoke(context, b_74);
      if(term == null)
        break Fail53;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consSLDefineFunction_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_74));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}