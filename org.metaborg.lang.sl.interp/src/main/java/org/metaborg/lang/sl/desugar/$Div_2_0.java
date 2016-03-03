package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Div_2_0 extends Strategy 
{ 
  public static $Div_2_0 instance = new $Div_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4, Strategy d_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Div_2_0");
    Fail22:
    { 
      IStrategoTerm a_69 = null;
      IStrategoTerm y_68 = null;
      IStrategoTerm z_68 = null;
      IStrategoTerm b_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consDiv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail22;
      y_68 = term.getSubterm(0);
      z_68 = term.getSubterm(1);
      IStrategoList annos5 = term.getAnnotations();
      a_69 = annos5;
      term = c_4.invoke(context, y_68);
      if(term == null)
        break Fail22;
      b_69 = term;
      term = d_4.invoke(context, z_68);
      if(term == null)
        break Fail22;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consDiv_2, new IStrategoTerm[]{b_69, term}), checkListAnnos(termFactory, a_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}