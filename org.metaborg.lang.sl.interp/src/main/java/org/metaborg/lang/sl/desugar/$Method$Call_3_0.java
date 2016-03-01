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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_6, Strategy e_6, Strategy f_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodCall_3_0");
    Fail43:
    { 
      IStrategoTerm e_73 = null;
      IStrategoTerm b_73 = null;
      IStrategoTerm c_73 = null;
      IStrategoTerm d_73 = null;
      IStrategoTerm f_73 = null;
      IStrategoTerm g_73 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consMethodCall_3 != ((IStrategoAppl)term).getConstructor())
        break Fail43;
      b_73 = term.getSubterm(0);
      c_73 = term.getSubterm(1);
      d_73 = term.getSubterm(2);
      IStrategoList annos21 = term.getAnnotations();
      e_73 = annos21;
      term = d_6.invoke(context, b_73);
      if(term == null)
        break Fail43;
      f_73 = term;
      term = e_6.invoke(context, c_73);
      if(term == null)
        break Fail43;
      g_73 = term;
      term = f_6.invoke(context, d_73);
      if(term == null)
        break Fail43;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consMethodCall_3, new IStrategoTerm[]{f_73, g_73, term}), checkListAnnos(termFactory, e_73));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}