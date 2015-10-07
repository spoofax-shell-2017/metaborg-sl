package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class Gt_2 extends A_Expr 
{ 
  @Child private A_Expr _1;

  @Child private A_Expr _2;

  public Gt_2 (SourceSection src, A_Expr _1, A_Expr _2) 
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
    final Gt_2 other = (Gt_2)obj;
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
    final A_C c_13415 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13297 = _2;
    final A_Expr lifted_863300 = this._1;
    final A_Expr lifted_863400 = this._2;
    final R_default_V $tmp4705 = lifted_863300.execute_default(frame, c_13415, l_string_v_13297);
    final A_V lifted_87060 = $tmp4705.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22433 = $tmp4705.get_1();
    final NumV_1 $tmp4706 = lifted_87060.match(NumV_1.class);
    if($tmp4706 != null)
    { 
      final long i13340000 = $tmp4706.get_1();
      final R_default_V $tmp4707 = lifted_863400.execute_default(frame, c_13415, l_string_v_22433);
      final A_V lifted_87050 = $tmp4707.value;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_31748 = $tmp4707.get_1();
      final NumV_1 $tmp4708 = lifted_87050.match(NumV_1.class);
      if($tmp4708 != null)
      { 
        final long i23340000 = $tmp4708.get_1();
        final BoolV_1 lifted_863500 = new BoolV_1(this.getSourceSection(), ds.manual.interpreter.Natives.ltI_2(i23340000, i13340000));
        return new R_default_V(lifted_863500, l_string_v_31748);
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Gt", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    return term;
  }
}