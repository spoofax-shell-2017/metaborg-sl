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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_5, Strategy v_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ProgramDesug_2_0");
    Fail48:
    { 
      IStrategoTerm h_73 = null;
      IStrategoTerm f_73 = null;
      IStrategoTerm g_73 = null;
      IStrategoTerm i_73 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consProgramDesug_2 != ((IStrategoAppl)term).getConstructor())
        break Fail48;
      f_73 = term.getSubterm(0);
      g_73 = term.getSubterm(1);
      IStrategoList annos28 = term.getAnnotations();
      h_73 = annos28;
      term = u_5.invoke(context, f_73);
      if(term == null)
        break Fail48;
      i_73 = term;
      term = v_5.invoke(context, g_73);
      if(term == null)
        break Fail48;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consProgramDesug_2, new IStrategoTerm[]{i_73, term}), checkListAnnos(termFactory, h_73));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}