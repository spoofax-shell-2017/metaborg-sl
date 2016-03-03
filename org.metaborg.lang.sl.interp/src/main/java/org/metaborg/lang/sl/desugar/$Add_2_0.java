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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_4, Strategy r_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Add_2_0");
    Fail24:
    { 
      IStrategoTerm s_69 = null;
      IStrategoTerm q_69 = null;
      IStrategoTerm r_69 = null;
      IStrategoTerm t_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consAdd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail24;
      q_69 = term.getSubterm(0);
      r_69 = term.getSubterm(1);
      IStrategoList annos4 = term.getAnnotations();
      s_69 = annos4;
      term = q_4.invoke(context, q_69);
      if(term == null)
        break Fail24;
      t_69 = term;
      term = r_4.invoke(context, r_69);
      if(term == null)
        break Fail24;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consAdd_2, new IStrategoTerm[]{t_69, term}), checkListAnnos(termFactory, s_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}