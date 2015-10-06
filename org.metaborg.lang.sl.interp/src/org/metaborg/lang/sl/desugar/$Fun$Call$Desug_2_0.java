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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_6, Strategy q_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunCallDesug_2_0");
    Fail59:
    { 
      IStrategoTerm b_75 = null;
      IStrategoTerm z_74 = null;
      IStrategoTerm a_75 = null;
      IStrategoTerm c_75 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consFunCallDesug_2 != ((IStrategoAppl)term).getConstructor())
        break Fail59;
      z_74 = term.getSubterm(0);
      a_75 = term.getSubterm(1);
      IStrategoList annos33 = term.getAnnotations();
      b_75 = annos33;
      term = p_6.invoke(context, z_74);
      if(term == null)
        break Fail59;
      c_75 = term;
      term = q_6.invoke(context, a_75);
      if(term == null)
        break Fail59;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consFunCallDesug_2, new IStrategoTerm[]{c_75, term}), checkListAnnos(termFactory, b_75));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}