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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_4, Strategy f_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Mul_2_0");
    Fail23:
    { 
      IStrategoTerm f_69 = null;
      IStrategoTerm d_69 = null;
      IStrategoTerm e_69 = null;
      IStrategoTerm g_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consMul_2 != ((IStrategoAppl)term).getConstructor())
        break Fail23;
      d_69 = term.getSubterm(0);
      e_69 = term.getSubterm(1);
      IStrategoList annos6 = term.getAnnotations();
      f_69 = annos6;
      term = e_4.invoke(context, d_69);
      if(term == null)
        break Fail23;
      g_69 = term;
      term = f_4.invoke(context, e_69);
      if(term == null)
        break Fail23;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consMul_2, new IStrategoTerm[]{g_69, term}), checkListAnnos(termFactory, f_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}