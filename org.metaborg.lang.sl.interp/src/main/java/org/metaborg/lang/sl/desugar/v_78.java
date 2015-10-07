package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class v_78 extends Strategy 
{ 
  public static final v_78 instance = new v_78();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_78)
  { 
    Fail83:
    { 
      lifted0 lifted00 = new lifted0();
      lifted00.x_78 = x_78;
      term = SRTS_all.instance.invoke(context, term, lifted00);
      if(term == null)
        break Fail83;
      term = x_78.invoke(context, term);
      if(term == null)
        break Fail83;
      if(true)
        return term;
    }
    return null;
  }
}