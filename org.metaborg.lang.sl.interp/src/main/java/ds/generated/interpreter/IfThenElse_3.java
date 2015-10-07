package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class IfThenElse_3 extends A_Stmt 
{ 
  @Child private A_Expr _1;

  @Child private A_Block _2;

  @Child private A_Block _3;

  public IfThenElse_3 (SourceSection src, A_Expr _1, A_Block _2, A_Block _3) 
  { 
    super(src);
    this._1 = _1;
    this._2 = _2;
    this._3 = _3;
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
    final IfThenElse_3 other = (IfThenElse_3)obj;
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
    if(_3 == null)
    { 
      if(other._3 != null)
      { 
        return false;
      }
    }
    else
      if(!_3.equals(other._3))
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
    final A_C c_13413 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13295 = _2;
    final A_Expr e9410000 = this._1;
    final A_Block then1400000 = this._2;
    final A_Block else1400000 = this._3;
    final R_default_V $tmp4738 = e9410000.execute_default(frame, c_13413, l_string_v_13295);
    final A_V lifted_862800 = $tmp4738.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22431 = $tmp4738.get_1();
    final BoolV_1 $tmp4739 = lifted_862800.match(BoolV_1.class);
    if($tmp4739 != null)
    { 
      final boolean bv2090000 = $tmp4739.get_1();
      if(bv2090000 == true)
      { 
        final R_default_U $tmp4740 = new __Block2Stmt___1(this.getSourceSection(), then1400000).execute_default(frame, c_13413, l_string_v_22431);
        final A_U lifted_854000 = $tmp4740.value;
        final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_31745 = $tmp4740.get_1();
        final U_0 u3620000 = new U_0(this.getSourceSection());
        return new R_default_U(u3620000, l_string_v_22431);
      }
      else
      { 
        final R_default_U $tmp4741 = new __Block2Stmt___1(this.getSourceSection(), else1400000).execute_default(frame, c_13413, l_string_v_22431);
        final A_U lifted_854100 = $tmp4741.value;
        final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_31746 = $tmp4741.get_1();
        final U_0 u3620000 = new U_0(this.getSourceSection());
        return new R_default_U(u3620000, l_string_v_22431);
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

  public A_Block get_3()
  { 
    return this._3;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("IfThenElse", 3), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory), _3.toStrategoTerm(factory));
    return term;
  }
}