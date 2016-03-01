package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Prop$Write_3_0 extends Strategy 
{ 
  public static $Prop$Write_3_0 instance = new $Prop$Write_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_6, Strategy b_6, Strategy c_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PropWrite_3_0");
    Fail42:
    { 
      IStrategoTerm x_72 = null;
      IStrategoTerm u_72 = null;
      IStrategoTerm v_72 = null;
      IStrategoTerm w_72 = null;
      IStrategoTerm y_72 = null;
      IStrategoTerm z_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consPropWrite_3 != ((IStrategoAppl)term).getConstructor())
        break Fail42;
      u_72 = term.getSubterm(0);
      v_72 = term.getSubterm(1);
      w_72 = term.getSubterm(2);
      IStrategoList annos20 = term.getAnnotations();
      x_72 = annos20;
      term = a_6.invoke(context, u_72);
      if(term == null)
        break Fail42;
      y_72 = term;
      term = b_6.invoke(context, v_72);
      if(term == null)
        break Fail42;
      z_72 = term;
      term = c_6.invoke(context, w_72);
      if(term == null)
        break Fail42;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consPropWrite_3, new IStrategoTerm[]{y_72, z_72, term}), checkListAnnos(termFactory, x_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}