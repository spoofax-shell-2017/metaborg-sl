package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class And_2 extends A_Expr 
{ 
  @Child private A_Expr _1;

  @Child private A_Expr _2;

  public And_2 (SourceSection src, A_Expr _1, A_Expr _2) 
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
    final And_2 other = (And_2)obj;
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
    final A_C c_13427 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13311 = _2;
    final A_Expr lifted_867300 = this._1;
    final A_Expr lifted_867400 = this._2;
    final R_default_V $tmp4709 = lifted_867300.execute_default(frame, c_13427, l_string_v_13311);
    final A_V lifted_87200 = $tmp4709.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22443 = $tmp4709.get_1();
    final BoolV_1 $tmp4710 = lifted_87200.match(BoolV_1.class);
    if($tmp4710 != null)
    { 
      final boolean b1820000 = $tmp4710.get_1();
      final R_default_V $tmp4711 = lifted_867400.execute_default(frame, c_13427, l_string_v_22443);
      final A_V lifted_87190 = $tmp4711.value;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_31754 = $tmp4711.get_1();
      final BoolV_1 $tmp4712 = lifted_87190.match(BoolV_1.class);
      if($tmp4712 != null)
      { 
        final boolean b2820000 = $tmp4712.get_1();
        final BoolV_1 lifted_867500 = new BoolV_1(this.getSourceSection(), ds.manual.interpreter.Natives.andB_2(b1820000, b2820000));
        return new R_default_V(lifted_867500, l_string_v_31754);
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("And", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    return term;
  }
}