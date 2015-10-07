package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class Continue_0 extends A_Stmt 
{ 
  public Continue_0 (SourceSection src) 
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
    final Continue_0 other = (Continue_0)obj;
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
    final A_C c_13421 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13305 = _2;
    final R_default_U $tmp4746 = new doContinue_0(this.getSourceSection()).execute_default(frame, c_13421, l_string_v_13305);
    final A_U lifted_865800 = $tmp4746.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22438 = $tmp4746.get_1();
    return new R_default_U(lifted_865800, l_string_v_22438);
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Continue", 0));
    return term;
  }
}