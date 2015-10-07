package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class Return_1 extends A_Stmt 
{ 
  @Child private A_Expr _1;

  public Return_1 (SourceSection src, A_Expr _1) 
  { 
    super(src);
    this._1 = _1;
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
    final Return_1 other = (Return_1)obj;
    if(_1 == null)
    { 
      if(other._1 != null)
      { 
        return false;
      }
    }
    else
      if(!_1.equals(other._1))
      { 
        return false;
      }
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
    final A_C c_13399 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13280 = _2;
    final A_Expr lifted_857600 = this._1;
    final R_default_V $tmp4742 = lifted_857600.execute_default(frame, c_13399, l_string_v_13280);
    final A_V lifted_86870 = $tmp4742.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22420 = $tmp4742.get_1();
    final R_default_V $tmp4743 = new doReturn_1(this.getSourceSection(), lifted_86870).execute_default(frame, c_13399, l_string_v_22420);
    final A_V lifted_853400 = $tmp4743.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_31736 = $tmp4743.get_1();
    final U_0 lifted_857700 = new U_0(this.getSourceSection());
    return new R_default_U(lifted_857700, l_string_v_31736);
  }

  public A_Expr get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Return", 1), _1.toStrategoTerm(factory));
    return term;
  }
}