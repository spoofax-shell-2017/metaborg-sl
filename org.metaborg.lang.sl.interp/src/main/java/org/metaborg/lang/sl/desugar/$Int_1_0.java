package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Int_1_0 extends Strategy 
{ 
  public static $Int_1_0 instance = new $Int_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_3)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Int_1_0");
    Fail17:
    { 
      IStrategoTerm o_68 = null;
      IStrategoTerm n_68 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consInt_1 != ((IStrategoAppl)term).getConstructor())
        break Fail17;
      n_68 = term.getSubterm(0);
      IStrategoList annos2 = term.getAnnotations();
      o_68 = annos2;
      term = y_3.invoke(context, n_68);
      if(term == null)
        break Fail17;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consInt_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_68));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}