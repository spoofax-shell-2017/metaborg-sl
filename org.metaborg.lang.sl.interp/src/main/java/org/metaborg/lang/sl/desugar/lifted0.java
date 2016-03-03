package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted0 extends Strategy 
{ 
  Strategy y_75;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail71:
    { 
      term = w_75.instance.invoke(context, term, y_75);
      if(term == null)
        break Fail71;
      if(true)
        return term;
    }
    return null;
  }
}