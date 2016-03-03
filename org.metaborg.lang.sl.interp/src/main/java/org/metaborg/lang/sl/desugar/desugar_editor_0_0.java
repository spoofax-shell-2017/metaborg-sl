package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class desugar_editor_0_0 extends Strategy 
{ 
  public static desugar_editor_0_0 instance = new desugar_editor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("desugar_editor_0_0");
    Fail0:
    { 
      IStrategoTerm s_2 = null;
      IStrategoTerm t_2 = null;
      IStrategoTerm u_2 = null;
      IStrategoTerm v_2 = null;
      IStrategoTerm w_2 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail0;
      u_2 = term.getSubterm(2);
      s_2 = term.getSubterm(3);
      w_2 = term;
      IStrategoTerm term0 = term;
      Success0:
      { 
        Fail1:
        { 
          IStrategoTerm y_2 = null;
          y_2 = s_2;
          term = guarantee_extension_0_1.instance.invoke(context, y_2, desugar.const0);
          if(term == null)
            break Fail1;
          t_2 = term;
          term = desugar_all_0_0.instance.invoke(context, u_2);
          if(term == null)
            break Fail1;
          v_2 = term;
          if(true)
            break Success0;
        }
        term = term0;
        IStrategoTerm a_3 = null;
        a_3 = term;
        term = report_with_failure_0_1.instance.invoke(context, a_3, desugar.const1);
        if(term == null)
          break Fail0;
      }
      term = w_2;
      if(t_2 == null || v_2 == null)
        break Fail0;
      term = termFactory.makeTuple(t_2, v_2);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}