package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Mul_2_0 extends Strategy 
{ 
  public static $Mul_2_0 instance = new $Mul_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4, Strategy p_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Mul_2_0");
    Fail26:
    { 
      IStrategoTerm y_69 = null;
      IStrategoTerm w_69 = null;
      IStrategoTerm x_69 = null;
      IStrategoTerm z_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consMul_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26;
      w_69 = term.getSubterm(0);
      x_69 = term.getSubterm(1);
      IStrategoList annos6 = term.getAnnotations();
      y_69 = annos6;
      term = o_4.invoke(context, w_69);
      if(term == null)
        break Fail26;
      z_69 = term;
      term = p_4.invoke(context, x_69);
      if(term == null)
        break Fail26;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consMul_2, new IStrategoTerm[]{z_69, term}), checkListAnnos(termFactory, y_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}