package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class Not_1 extends A_Expr 
{ 
  @Child private A_Expr _1;

  public Not_1 (SourceSection src, A_Expr _1) 
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
    final Not_1 other = (Not_1)obj;
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

  public R_default_V execute_default(VirtualFrame frame, A_C _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2)
  { 
    R_default_V res;
    res = execute_default_1(frame, _1, _2);
    if(res != null)
    { 
      return res;
    }
    return super.execute_default(frame, _1, _2);
  }

  private R_default_V execute_default_1(VirtualFrame frame, A_C _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2)
  { 
    final A_C c_13403 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13284 = _2;
    final A_Expr lifted_859300 = this._1;
    final R_default_V $tmp4717 = lifted_859300.execute_default(frame, c_13403, l_string_v_13284);
    final A_V lifted_86930 = $tmp4717.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22424 = $tmp4717.get_1();
    final BoolV_1 $tmp4718 = lifted_86930.match(BoolV_1.class);
    if($tmp4718 != null)
    { 
      final boolean b620000 = $tmp4718.get_1();
      final BoolV_1 lifted_859400 = new BoolV_1(this.getSourceSection(), ds.manual.interpreter.Natives.notB_1(b620000));
      return new R_default_V(lifted_859400, l_string_v_22424);
    }
    else
    { }
    return null;
  }

  public A_Expr get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Not", 1), _1.toStrategoTerm(factory));
    return term;
  }
}