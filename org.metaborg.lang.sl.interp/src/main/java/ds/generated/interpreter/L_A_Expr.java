package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.IStrategoTerm;
import com.oracle.truffle.api.source.SourceSection;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.github.krukow.clj_lang.PersistentTreeMap;

public class L_A_Expr extends AbstractNodeList<A_Expr> 
{ 
  public L_A_Expr (SourceSection src) 
  { 
    super(src);
  }

  public L_A_Expr (SourceSection src, A_Expr head, L_A_Expr tail) 
  { 
    super(src, head, tail);
  }

  @Override public L_A_Expr tail()
  { 
    return (L_A_Expr)super.tail();
  }

  public static L_A_Expr fromStrategoTerm(IStrategoTerm alist)
  { 
    L_A_Expr list = new L_A_Expr(SourceSectionUtil.fromStrategoTerm(alist));
    for(IStrategoTerm elem : alist)
    { 
      final SourceSection src = SourceSectionUtil.fromStrategoTerm(elem);
      list = new L_A_Expr(src, new Generic_A_Expr(src, elem), list);
    }
    return list;
  }
}