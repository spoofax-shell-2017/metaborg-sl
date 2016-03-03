package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class w_75 extends Strategy 
{ 
  public static final w_75 instance = new w_75();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_75)
  { 
    Fail70:
    { 
      lifted0 lifted00 = new lifted0();
      lifted00.y_75 = y_75;
      term = SRTS_all.instance.invoke(context, term, lifted00);
      if(term == null)
        break Fail70;
      term = y_75.invoke(context, term);
      if(term == null)
        break Fail70;
      if(true)
        return term;
    }
    return null;
  }
}