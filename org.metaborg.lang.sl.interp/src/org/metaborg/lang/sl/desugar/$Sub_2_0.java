package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sub_2_0 extends Strategy 
{ 
  public static $Sub_2_0 instance = new $Sub_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_4, Strategy r_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Sub_2_0");
    Fail27:
    { 
      IStrategoTerm d_70 = null;
      IStrategoTerm b_70 = null;
      IStrategoTerm c_70 = null;
      IStrategoTerm e_70 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consSub_2 != ((IStrategoAppl)term).getConstructor())
        break Fail27;
      b_70 = term.getSubterm(0);
      c_70 = term.getSubterm(1);
      IStrategoList annos7 = term.getAnnotations();
      d_70 = annos7;
      term = q_4.invoke(context, b_70);
      if(term == null)
        break Fail27;
      e_70 = term;
      term = r_4.invoke(context, c_70);
      if(term == null)
        break Fail27;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consSub_2, new IStrategoTerm[]{e_70, term}), checkListAnnos(termFactory, d_70));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}