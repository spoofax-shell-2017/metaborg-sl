package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class NoFunDefSeq_0 extends A_FunDefSeq 
{ 
  public NoFunDefSeq_0 (SourceSection src) 
  { 
    super(src);
  }

  @Override public boolean equals(Object obj)
  { 
    if(this == obj)
    { 
      return true;
    }
    if(obj == null)
    { 
      return false;
    }
    if(getClass() != obj.getClass())
    { 
      return false;
    }
    final NoFunDefSeq_0 other = (NoFunDefSeq_0)obj;
    return true;
  }

  public R_load_U execute_load(VirtualFrame frame, com.github.krukow.clj_ds.PersistentMap<String, A_V> _1)
  { 
    R_load_U res;
    res = execute_load_1(frame, _1);
    if(res != null)
    { 
      return res;
    }
    return super.execute_load(frame, _1);
  }

  private R_load_U execute_load_1(VirtualFrame frame, com.github.krukow.clj_ds.PersistentMap<String, A_V> _1)
  { 
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13285 = _1;
    final U_0 lifted_859600 = new U_0(this.getSourceSection());
    return new R_load_U(lifted_859600, l_string_v_13285);
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("NoFunDefSeq", 0));
    return term;
  }
}