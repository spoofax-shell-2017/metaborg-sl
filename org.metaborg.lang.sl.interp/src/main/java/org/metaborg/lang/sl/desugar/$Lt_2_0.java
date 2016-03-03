package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lt_2_0 extends Strategy 
{ 
  public static $Lt_2_0 instance = new $Lt_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_4, Strategy n_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Lt_2_0");
    Fail27:
    { 
      IStrategoTerm z_69 = null;
      IStrategoTerm x_69 = null;
      IStrategoTerm y_69 = null;
      IStrategoTerm a_70 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consLt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail27;
      x_69 = term.getSubterm(0);
      y_69 = term.getSubterm(1);
      IStrategoList annos10 = term.getAnnotations();
      z_69 = annos10;
      term = m_4.invoke(context, x_69);
      if(term == null)
        break Fail27;
      a_70 = term;
      term = n_4.invoke(context, y_69);
      if(term == null)
        break Fail27;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consLt_2, new IStrategoTerm[]{a_70, term}), checkListAnnos(termFactory, z_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}