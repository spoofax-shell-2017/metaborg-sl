package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class Sub_2 extends A_Expr 
{ 
  @Child private A_Expr _1;

  @Child private A_Expr _2;

  public Sub_2 (SourceSection src, A_Expr _1, A_Expr _2) 
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
    final Sub_2 other = (Sub_2)obj;
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
    final A_C c_13392 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13273 = _2;
    final A_Expr lifted_856100 = this._1;
    final A_Expr lifted_856200 = this._2;
    final R_default_V $tmp4685 = lifted_856100.execute_default(frame, c_13392, l_string_v_13273);
    final A_V lifted_86860 = $tmp4685.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22415 = $tmp4685.get_1();
    final NumV_1 $tmp4686 = lifted_86860.match(NumV_1.class);
    if($tmp4686 != null)
    { 
      final long i13280000 = $tmp4686.get_1();
      final R_default_V $tmp4687 = lifted_856200.execute_default(frame, c_13392, l_string_v_22415);
      final A_V lifted_86850 = $tmp4687.value;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_31734 = $tmp4687.get_1();
      final NumV_1 $tmp4688 = lifted_86850.match(NumV_1.class);
      if($tmp4688 != null)
      { 
        final long i23280000 = $tmp4688.get_1();
        final NumV_1 lifted_856300 = new NumV_1(this.getSourceSection(), ds.manual.interpreter.Natives.subI_2(i13280000, i23280000));
        return new R_default_V(lifted_856300, l_string_v_31734);
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Sub", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    return term;
  }
}