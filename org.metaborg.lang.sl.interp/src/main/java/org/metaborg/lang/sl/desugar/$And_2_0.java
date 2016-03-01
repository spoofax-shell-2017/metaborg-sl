package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $And_2_0 extends Strategy 
{ 
  public static $And_2_0 instance = new $And_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_5, Strategy r_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("And_2_0");
    Fail36:
    { 
      IStrategoTerm w_71 = null;
      IStrategoTerm u_71 = null;
      IStrategoTerm v_71 = null;
      IStrategoTerm x_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consAnd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail36;
      u_71 = term.getSubterm(0);
      v_71 = term.getSubterm(1);
      IStrategoList annos14 = term.getAnnotations();
      w_71 = annos14;
      term = q_5.invoke(context, u_71);
      if(term == null)
        break Fail36;
      x_71 = term;
      term = r_5.invoke(context, v_71);
      if(term == null)
        break Fail36;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consAnd_2, new IStrategoTerm[]{x_71, term}), checkListAnnos(termFactory, w_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}