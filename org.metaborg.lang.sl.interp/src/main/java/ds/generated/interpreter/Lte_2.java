package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class Lte_2 extends A_Expr 
{ 
  @Child private A_Expr _1;

  @Child private A_Expr _2;

  public Lte_2 (SourceSection src, A_Expr _1, A_Expr _2) 
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
    final Lte_2 other = (Lte_2)obj;
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
    final A_C c_13408 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13290 = _2;
    final A_Expr lifted_861200 = this._1;
    final A_Expr lifted_861300 = this._2;
    final R_default_V $tmp4691 = lifted_861200.execute_default(frame, c_13408, l_string_v_13290);
    final A_V lifted_87000 = $tmp4691.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22428 = $tmp4691.get_1();
    final NumV_1 $tmp4692 = lifted_87000.match(NumV_1.class);
    if($tmp4692 != null)
    { 
      final long i13310000 = $tmp4692.get_1();
      final R_default_V $tmp4693 = lifted_861300.execute_default(frame, c_13408, l_string_v_22428);
      final A_V lifted_86990 = $tmp4693.value;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_31742 = $tmp4693.get_1();
      final NumV_1 $tmp4694 = lifted_86990.match(NumV_1.class);
      if($tmp4694 != null)
      { 
        final long i23310000 = $tmp4694.get_1();
        final BoolV_1 lifted_861400 = new BoolV_1(this.getSourceSection(), ds.manual.interpreter.Natives.lteI_2(i13310000, i23310000));
        return new R_default_V(lifted_861400, l_string_v_31742);
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Lte", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    return term;
  }
}