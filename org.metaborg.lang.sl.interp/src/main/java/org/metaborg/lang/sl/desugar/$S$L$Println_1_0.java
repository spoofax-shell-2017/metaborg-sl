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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_7)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SLPrintln_1_0");
    Fail68:
    { 
      IStrategoTerm i_76 = null;
      IStrategoTerm h_76 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consSLPrintln_1 != ((IStrategoAppl)term).getConstructor())
        break Fail68;
      h_76 = term.getSubterm(0);
      IStrategoList annos37 = term.getAnnotations();
      i_76 = annos37;
      term = l_7.invoke(context, h_76);
      if(term == null)
        break Fail68;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consSLPrintln_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_76));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}