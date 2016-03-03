package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method$Call_3_0 extends Strategy 
{ 
  public static $Method$Call_3_0 instance = new $Method$Call_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_5, Strategy y_5, Strategy z_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodCall_3_0");
    Fail41:
    { 
      IStrategoTerm y_72 = null;
      IStrategoTerm v_72 = null;
      IStrategoTerm w_72 = null;
      IStrategoTerm x_72 = null;
      IStrategoTerm z_72 = null;
      IStrategoTerm a_73 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consMethodCall_3 != ((IStrategoAppl)term).getConstructor())
        break Fail41;
      v_72 = term.getSubterm(0);
      w_72 = term.getSubterm(1);
      x_72 = term.getSubterm(2);
      IStrategoList annos21 = term.getAnnotations();
      y_72 = annos21;
      term = x_5.invoke(context, v_72);
      if(term == null)
        break Fail41;
      z_72 = term;
      term = y_5.invoke(context, w_72);
      if(term == null)
        break Fail41;
      a_73 = term;
      term = z_5.invoke(context, x_72);
      if(term == null)
        break Fail41;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consMethodCall_3, new IStrategoTerm[]{z_72, a_73, term}), checkListAnnos(termFactory, y_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}