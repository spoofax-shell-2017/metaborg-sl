package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Program$Desug_2_0 extends Strategy 
{ 
  public static $Program$Desug_2_0 instance = new $Program$Desug_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_6, Strategy v_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ProgramDesug_2_0");
    Fail55:
    { 
      IStrategoTerm t_74 = null;
      IStrategoTerm r_74 = null;
      IStrategoTerm s_74 = null;
      IStrategoTerm u_74 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consProgramDesug_2 != ((IStrategoAppl)term).getConstructor())
        break Fail55;
      r_74 = term.getSubterm(0);
      s_74 = term.getSubterm(1);
      IStrategoList annos29 = term.getAnnotations();
      t_74 = annos29;
      term = u_6.invoke(context, r_74);
      if(term == null)
        break Fail55;
      u_74 = term;
      term = v_6.invoke(context, s_74);
      if(term == null)
        break Fail55;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consProgramDesug_2, new IStrategoTerm[]{u_74, term}), checkListAnnos(termFactory, t_74));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}