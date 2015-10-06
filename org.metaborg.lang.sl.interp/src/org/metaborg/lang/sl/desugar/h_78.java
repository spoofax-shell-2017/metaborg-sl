package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class h_78 extends Strategy 
{ 
  public static final h_78 instance = new h_78();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_78)
  { 
    Fail81:
    { 
      lifted0 lifted00 = new lifted0();
      lifted00.j_78 = j_78;
      term = SRTS_all.instance.invoke(context, term, lifted00);
      if(term == null)
        break Fail81;
      term = j_78.invoke(context, term);
      if(term == null)
        break Fail81;
      if(true)
        return term;
    }
    return null;
  }
}