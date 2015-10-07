package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class Seq_2 extends A_Stmt 
{ 
  @Child private A_Stmt _1;

  @Child private A_Stmt _2;

  public Seq_2 (SourceSection src, A_Stmt _1, A_Stmt _2) 
  { 
    super(src);
    this._1 = _1;
    this._2 = _2;
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
    final Seq_2 other = (Seq_2)obj;
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
    if(_2 == null)
    { 
      if(other._2 != null)
      { 
        return false;
      }
    }
    else
      if(!_2.equals(other._2))
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
    final A_C c_13397 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13278 = _2;
    final A_Stmt stmt11430000 = this._1;
    final A_Stmt stmt21610000 = this._2;
    final R_default_U $tmp4732 = stmt11430000.execute_default(frame, c_13397, l_string_v_13278);
    final A_U lifted_853100 = $tmp4732.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22418 = $tmp4732.get_1();
    final R_default_U $tmp4733 = stmt21610000.execute_default(frame, c_13397, l_string_v_22418);
    final A_U lifted_853200 = $tmp4733.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_31735 = $tmp4733.get_1();
    final U_0 lifted_857200 = new U_0(this.getSourceSection());
    return new R_default_U(lifted_857200, l_string_v_31735);
  }

  public A_Stmt get_1()
  { 
    return this._1;
  }

  public A_Stmt get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Seq", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    return term;
  }
}