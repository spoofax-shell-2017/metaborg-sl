package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class Lt_2 extends A_Expr 
{ 
  @Child private A_Expr _1;

  @Child private A_Expr _2;

  public Lt_2 (SourceSection src, A_Expr _1, A_Expr _2) 
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
    final Lt_2 other = (Lt_2)obj;
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
    final A_C c_13409 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13291 = _2;
    final A_Expr lifted_861600 = this._1;
    final A_Expr lifted_861700 = this._2;
    final R_default_V $tmp4695 = lifted_861600.execute_default(frame, c_13409, l_string_v_13291);
    final A_V lifted_87020 = $tmp4695.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22429 = $tmp4695.get_1();
    final NumV_1 $tmp4696 = lifted_87020.match(NumV_1.class);
    if($tmp4696 != null)
    { 
      final long i13320000 = $tmp4696.get_1();
      final R_default_V $tmp4697 = lifted_861700.execute_default(frame, c_13409, l_string_v_22429);
      final A_V lifted_87010 = $tmp4697.value;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_31743 = $tmp4697.get_1();
      final NumV_1 $tmp4698 = lifted_87010.match(NumV_1.class);
      if($tmp4698 != null)
      { 
        final long i23320000 = $tmp4698.get_1();
        final BoolV_1 lifted_861800 = new BoolV_1(this.getSourceSection(), ds.manual.interpreter.Natives.ltI_2(i13320000, i23320000));
        return new R_default_V(lifted_861800, l_string_v_31743);
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Lt", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    return term;
  }
}