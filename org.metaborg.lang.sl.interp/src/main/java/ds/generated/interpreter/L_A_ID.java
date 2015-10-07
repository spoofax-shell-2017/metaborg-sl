package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.IStrategoTerm;
import com.oracle.truffle.api.source.SourceSection;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.github.krukow.clj_lang.PersistentTreeMap;

public class L_A_ID extends AbstractNodeList<A_ID> 
{ 
  public L_A_ID (SourceSection src) 
  { 
    super(src);
  }

  public L_A_ID (SourceSection src, A_ID head, L_A_ID tail) 
  { 
    super(src, head, tail);
  }

  @Override public L_A_ID tail()
  { 
    return (L_A_ID)super.tail();
  }

  public static L_A_ID fromStrategoTerm(IStrategoTerm alist)
  { 
    L_A_ID list = new L_A_ID(SourceSectionUtil.fromStrategoTerm(alist));
    for(IStrategoTerm elem : alist)
    { 
      final SourceSection src = SourceSectionUtil.fromStrategoTerm(elem);
      list = new L_A_ID(src, new Generic_A_ID(src, elem), list);
    }
    return list;
  }
}