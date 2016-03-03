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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SLPrintln_1_0");
    Fail56:
    { 
      IStrategoTerm f_74 = null;
      IStrategoTerm e_74 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consSLPrintln_1 != ((IStrategoAppl)term).getConstructor())
        break Fail56;
      e_74 = term.getSubterm(0);
      IStrategoList annos33 = term.getAnnotations();
      f_74 = annos33;
      term = e_6.invoke(context, e_74);
      if(term == null)
        break Fail56;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consSLPrintln_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_74));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}