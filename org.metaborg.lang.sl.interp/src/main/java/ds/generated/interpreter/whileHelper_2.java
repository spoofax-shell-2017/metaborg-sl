package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class whileHelper_2 extends A_Stmt 
{ 
  @Child private A_Expr _1;

  @Child private A_Block _2;

  public whileHelper_2 (SourceSection src, A_Expr _1, A_Block _2) 
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
    final whileHelper_2 other = (whileHelper_2)obj;
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
    final A_C c_13429 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13313 = _2;
    final A_Stmt w330000 = this;
    final A_Expr e9430000 = this._1;
    final A_Block block2100000 = this._2;
    final R_default_V $tmp4651 = e9430000.execute_default(frame, c_13429, l_string_v_13313);
    final A_V lifted_867900 = $tmp4651.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22445 = $tmp4651.get_1();
    final BoolV_1 $tmp4652 = lifted_867900.match(BoolV_1.class);
    if($tmp4652 != null)
    { 
      final boolean bv2100000 = $tmp4652.get_1();
      if(bv2100000 == true)
      { 
        final R_default_U $tmp4653 = new __Block2Stmt___1(this.getSourceSection(), block2100000).execute_default(frame, c_13429, l_string_v_22445);
        final A_U lifted_854500 = $tmp4653.value;
        final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_31756 = $tmp4653.get_1();
        final R_default_U $tmp4654 = w330000.execute_default(frame, c_13429, l_string_v_31756);
        final A_U lifted_854600 = $tmp4654.value;
        final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_4204 = $tmp4654.get_1();
        final U_0 u3650000 = new U_0(this.getSourceSection());
        return new R_default_U(u3650000, l_string_v_22445);
      }
      else
      { 
        final U_0 u3650000 = new U_0(this.getSourceSection());
        return new R_default_U(u3650000, l_string_v_22445);
      }
    }
    else
    { }
    return null;
  }

  public A_Expr get_1()
  { 
    return this._1;
  }

  public A_Block get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("whileHelper", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    return term;
  }
}