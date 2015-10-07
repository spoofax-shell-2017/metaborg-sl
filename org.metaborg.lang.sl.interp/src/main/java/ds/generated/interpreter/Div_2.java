package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class Div_2 extends A_Expr 
{ 
  @Child private A_Expr _1;

  @Child private A_Expr _2;

  public Div_2 (SourceSection src, A_Expr _1, A_Expr _2) 
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
    final Div_2 other = (Div_2)obj;
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
    final A_C c_13420 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13304 = _2;
    final A_Expr lifted_865300 = this._1;
    final A_Expr lifted_865400 = this._2;
    final R_default_V $tmp4677 = lifted_865300.execute_default(frame, c_13420, l_string_v_13304);
    final A_V lifted_87110 = $tmp4677.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22437 = $tmp4677.get_1();
    final NumV_1 $tmp4678 = lifted_87110.match(NumV_1.class);
    if($tmp4678 != null)
    { 
      final long i13350000 = $tmp4678.get_1();
      final R_default_V $tmp4679 = lifted_865400.execute_default(frame, c_13420, l_string_v_22437);
      final A_V lifted_87100 = $tmp4679.value;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_31752 = $tmp4679.get_1();
      final NumV_1 $tmp4680 = lifted_87100.match(NumV_1.class);
      if($tmp4680 != null)
      { 
        final long i23350000 = $tmp4680.get_1();
        final NumV_1 lifted_865500 = new NumV_1(this.getSourceSection(), ds.manual.interpreter.Natives.divI_2(i13350000, i23350000));
        return new R_default_V(lifted_865500, l_string_v_31752);
      }
      else
      { }
    }
    else
    { }
    return null;
  }

  public A_Expr get_1()
  { 
    return this._1;
  }

  public A_Expr get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Div", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    return term;
  }
}