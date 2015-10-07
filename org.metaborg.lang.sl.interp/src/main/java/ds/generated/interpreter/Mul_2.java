package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class Mul_2 extends A_Expr 
{ 
  @Child private A_Expr _1;

  @Child private A_Expr _2;

  public Mul_2 (SourceSection src, A_Expr _1, A_Expr _2) 
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
    final Mul_2 other = (Mul_2)obj;
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
    final A_C c_13406 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13288 = _2;
    final A_Expr lifted_860300 = this._1;
    final A_Expr lifted_860400 = this._2;
    final R_default_V $tmp4681 = lifted_860300.execute_default(frame, c_13406, l_string_v_13288);
    final A_V lifted_86970 = $tmp4681.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22426 = $tmp4681.get_1();
    final NumV_1 $tmp4682 = lifted_86970.match(NumV_1.class);
    if($tmp4682 != null)
    { 
      final long i13290000 = $tmp4682.get_1();
      final R_default_V $tmp4683 = lifted_860400.execute_default(frame, c_13406, l_string_v_22426);
      final A_V lifted_86960 = $tmp4683.value;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_31740 = $tmp4683.get_1();
      final NumV_1 $tmp4684 = lifted_86960.match(NumV_1.class);
      if($tmp4684 != null)
      { 
        final long i23290000 = $tmp4684.get_1();
        final NumV_1 lifted_860500 = new NumV_1(this.getSourceSection(), ds.manual.interpreter.Natives.mulI_2(i13290000, i23290000));
        return new R_default_V(lifted_860500, l_string_v_31740);
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Mul", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    return term;
  }
}