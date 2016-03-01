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
  Strategy o_78;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail82:
    { 
      term = m_78.instance.invoke(context, term, o_78);
      if(term == null)
        break Fail82;
      if(true)
        return term;
    }
    return null;
  }
}