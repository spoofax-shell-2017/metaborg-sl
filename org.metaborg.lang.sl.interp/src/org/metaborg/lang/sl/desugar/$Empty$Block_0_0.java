package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Empty$Block_0_0 extends Strategy 
{ 
  public static $Empty$Block_0_0 instance = new $Empty$Block_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail44:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consEmptyBlock_0 != ((IStrategoAppl)term).getConstructor())
        break Fail44;
      if(true)
        return term;
    }
    context.push("EmptyBlock_0_0");
    context.popOnFailure();
    return null;
  }
}