package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Add_2_0 extends Strategy 
{ 
  public static $Add_2_0 instance = new $Add_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_4, Strategy b_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Add_2_0");
    Fail21:
    { 
      IStrategoTerm v_68 = null;
      IStrategoTerm t_68 = null;
      IStrategoTerm u_68 = null;
      IStrategoTerm w_68 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consAdd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail21;
      t_68 = term.getSubterm(0);
      u_68 = term.getSubterm(1);
      IStrategoList annos4 = term.getAnnotations();
      v_68 = annos4;
      term = a_4.invoke(context, t_68);
      if(term == null)
        break Fail21;
      w_68 = term;
      term = b_4.invoke(context, u_68);
      if(term == null)
        break Fail21;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consAdd_2, new IStrategoTerm[]{w_68, term}), checkListAnnos(termFactory, v_68));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}