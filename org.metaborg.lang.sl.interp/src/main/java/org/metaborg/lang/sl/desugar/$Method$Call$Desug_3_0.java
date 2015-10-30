package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method$Call$Desug_3_0 extends Strategy 
{ 
  public static $Method$Call$Desug_3_0 instance = new $Method$Call$Desug_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_7, Strategy i_7, Strategy j_7)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodCallDesug_3_0");
    Fail64:
    { 
      IStrategoTerm a_76 = null;
      IStrategoTerm x_75 = null;
      IStrategoTerm y_75 = null;
      IStrategoTerm z_75 = null;
      IStrategoTerm b_76 = null;
      IStrategoTerm c_76 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consMethodCallDesug_3 != ((IStrategoAppl)term).getConstructor())
        break Fail64;
      x_75 = term.getSubterm(0);
      y_75 = term.getSubterm(1);
      z_75 = term.getSubterm(2);
      IStrategoList annos35 = term.getAnnotations();
      a_76 = annos35;
      term = h_7.invoke(context, x_75);
      if(term == null)
        break Fail64;
      b_76 = term;
      term = i_7.invoke(context, y_75);
      if(term == null)
        break Fail64;
      c_76 = term;
      term = j_7.invoke(context, z_75);
      if(term == null)
        break Fail64;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consMethodCallDesug_3, new IStrategoTerm[]{b_76, c_76, term}), checkListAnnos(termFactory, a_76));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}