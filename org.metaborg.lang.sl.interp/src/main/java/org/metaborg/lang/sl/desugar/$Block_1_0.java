package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Block_1_0 extends Strategy 
{ 
  public static $Block_1_0 instance = new $Block_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Block_1_0");
    Fail40:
    { 
      IStrategoTerm j_72 = null;
      IStrategoTerm i_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consBlock_1 != ((IStrategoAppl)term).getConstructor())
        break Fail40;
      i_72 = term.getSubterm(0);
      IStrategoList annos23 = term.getAnnotations();
      j_72 = annos23;
      term = l_5.invoke(context, i_72);
      if(term == null)
        break Fail40;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consBlock_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}