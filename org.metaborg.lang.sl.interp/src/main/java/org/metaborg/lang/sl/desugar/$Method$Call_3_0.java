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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_5, Strategy i_5, Strategy j_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodCall_3_0");
    Fail38:
    { 
      IStrategoTerm b_72 = null;
      IStrategoTerm y_71 = null;
      IStrategoTerm z_71 = null;
      IStrategoTerm a_72 = null;
      IStrategoTerm c_72 = null;
      IStrategoTerm d_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consMethodCall_3 != ((IStrategoAppl)term).getConstructor())
        break Fail38;
      y_71 = term.getSubterm(0);
      z_71 = term.getSubterm(1);
      a_72 = term.getSubterm(2);
      IStrategoList annos21 = term.getAnnotations();
      b_72 = annos21;
      term = h_5.invoke(context, y_71);
      if(term == null)
        break Fail38;
      c_72 = term;
      term = i_5.invoke(context, z_71);
      if(term == null)
        break Fail38;
      d_72 = term;
      term = j_5.invoke(context, a_72);
      if(term == null)
        break Fail38;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consMethodCall_3, new IStrategoTerm[]{c_72, d_72, term}), checkListAnnos(termFactory, b_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}