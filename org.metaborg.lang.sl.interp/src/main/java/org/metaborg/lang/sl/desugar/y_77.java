package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class y_77 extends Strategy 
{ 
  public static final y_77 instance = new y_77();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_78)
  { 
    Fail79:
    { 
      lifted0 lifted00 = new lifted0();
      lifted00.a_78 = a_78;
      term = SRTS_all.instance.invoke(context, term, lifted00);
      if(term == null)
        break Fail79;
      term = a_78.invoke(context, term);
      if(term == null)
        break Fail79;
      if(true)
        return term;
    }
    return null;
  }
}