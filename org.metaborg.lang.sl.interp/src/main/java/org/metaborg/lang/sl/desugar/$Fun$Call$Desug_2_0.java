package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Fun$Call$Desug_2_0 extends Strategy 
{ 
  public static $Fun$Call$Desug_2_0 instance = new $Fun$Call$Desug_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_6, Strategy u_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunCallDesug_2_0");
    Fail57:
    { 
      IStrategoTerm a_75 = null;
      IStrategoTerm y_74 = null;
      IStrategoTerm z_74 = null;
      IStrategoTerm b_75 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consFunCallDesug_2 != ((IStrategoAppl)term).getConstructor())
        break Fail57;
      y_74 = term.getSubterm(0);
      z_74 = term.getSubterm(1);
      IStrategoList annos32 = term.getAnnotations();
      a_75 = annos32;
      term = t_6.invoke(context, y_74);
      if(term == null)
        break Fail57;
      b_75 = term;
      term = u_6.invoke(context, z_74);
      if(term == null)
        break Fail57;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consFunCallDesug_2, new IStrategoTerm[]{b_75, term}), checkListAnnos(termFactory, a_75));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}