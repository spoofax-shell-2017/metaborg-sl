package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$L$Println_1_0 extends Strategy 
{ 
  public static $S$L$Println_1_0 instance = new $S$L$Println_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SLPrintln_1_0");
    Fail66:
    { 
      IStrategoTerm u_75 = null;
      IStrategoTerm t_75 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consSLPrintln_1 != ((IStrategoAppl)term).getConstructor())
        break Fail66;
      t_75 = term.getSubterm(0);
      IStrategoList annos37 = term.getAnnotations();
      u_75 = annos37;
      term = x_6.invoke(context, t_75);
      if(term == null)
        break Fail66;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consSLPrintln_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_75));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}