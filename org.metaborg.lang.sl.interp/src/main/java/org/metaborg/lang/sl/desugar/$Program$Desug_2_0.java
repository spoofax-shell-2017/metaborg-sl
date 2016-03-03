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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_6, Strategy l_6)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ProgramDesug_2_0");
    Fail51:
    { 
      IStrategoTerm e_74 = null;
      IStrategoTerm c_74 = null;
      IStrategoTerm d_74 = null;
      IStrategoTerm f_74 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consProgramDesug_2 != ((IStrategoAppl)term).getConstructor())
        break Fail51;
      c_74 = term.getSubterm(0);
      d_74 = term.getSubterm(1);
      IStrategoList annos28 = term.getAnnotations();
      e_74 = annos28;
      term = k_6.invoke(context, c_74);
      if(term == null)
        break Fail51;
      f_74 = term;
      term = l_6.invoke(context, d_74);
      if(term == null)
        break Fail51;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consProgramDesug_2, new IStrategoTerm[]{f_74, term}), checkListAnnos(termFactory, e_74));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}