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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_6, Strategy h_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ProgramDesug_2_0");
    Fail53:
    { 
      IStrategoTerm f_74 = null;
      IStrategoTerm d_74 = null;
      IStrategoTerm e_74 = null;
      IStrategoTerm g_74 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consProgramDesug_2 != ((IStrategoAppl)term).getConstructor())
        break Fail53;
      d_74 = term.getSubterm(0);
      e_74 = term.getSubterm(1);
      IStrategoList annos29 = term.getAnnotations();
      f_74 = annos29;
      term = g_6.invoke(context, d_74);
      if(term == null)
        break Fail53;
      g_74 = term;
      term = h_6.invoke(context, e_74);
      if(term == null)
        break Fail53;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consProgramDesug_2, new IStrategoTerm[]{g_74, term}), checkListAnnos(termFactory, f_74));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}