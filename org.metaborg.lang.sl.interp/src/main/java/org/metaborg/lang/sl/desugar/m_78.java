package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class m_78 extends Strategy 
{ 
  public static final m_78 instance = new m_78();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_78)
  { 
    Fail81:
    { 
      lifted0 lifted00 = new lifted0();
      lifted00.o_78 = o_78;
      term = SRTS_all.instance.invoke(context, term, lifted00);
      if(term == null)
        break Fail81;
      term = o_78.invoke(context, term);
      if(term == null)
        break Fail81;
      if(true)
        return term;
    }
    return null;
  }
}