package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class ReturnVoid_0 extends A_Stmt 
{ 
  public ReturnVoid_0 (SourceSection src) 
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
    final ReturnVoid_0 other = (ReturnVoid_0)obj;
    return true;
  }

  public R_default_U execute_default(VirtualFrame frame, A_C _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2)
  { 
    R_default_U res;
    res = execute_default_1(frame, _1, _2);
    if(res != null)
    { 
      return res;
    }
    return super.execute_default(frame, _1, _2);
  }

  private R_default_U execute_default_1(VirtualFrame frame, A_C _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2)
  { 
    final A_C c_13398 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13279 = _2;
    final R_default_V $tmp4744 = new doReturn_1(this.getSourceSection(), new NullV_0(this.getSourceSection())).execute_default(frame, c_13398, l_string_v_13279);
    final A_V lifted_853300 = $tmp4744.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22419 = $tmp4744.get_1();
    final U_0 lifted_857300 = new U_0(this.getSourceSection());
    return new R_default_U(lifted_857300, l_string_v_22419);
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("ReturnVoid", 0));
    return term;
  }
}