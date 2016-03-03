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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_6, Strategy b_6, Strategy c_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodCallDesug_3_0");
    Fail52:
    { 
      IStrategoTerm x_73 = null;
      IStrategoTerm u_73 = null;
      IStrategoTerm v_73 = null;
      IStrategoTerm w_73 = null;
      IStrategoTerm y_73 = null;
      IStrategoTerm z_73 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consMethodCallDesug_3 != ((IStrategoAppl)term).getConstructor())
        break Fail52;
      u_73 = term.getSubterm(0);
      v_73 = term.getSubterm(1);
      w_73 = term.getSubterm(2);
      IStrategoList annos31 = term.getAnnotations();
      x_73 = annos31;
      term = a_6.invoke(context, u_73);
      if(term == null)
        break Fail52;
      y_73 = term;
      term = b_6.invoke(context, v_73);
      if(term == null)
        break Fail52;
      z_73 = term;
      term = c_6.invoke(context, w_73);
      if(term == null)
        break Fail52;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consMethodCallDesug_3, new IStrategoTerm[]{y_73, z_73, term}), checkListAnnos(termFactory, x_73));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}