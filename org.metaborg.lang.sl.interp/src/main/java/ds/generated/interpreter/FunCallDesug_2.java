package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class FunCallDesug_2 extends A_Expr 
{ 
  private String _1;

  @Child private A_ArgSeq _2;

  public FunCallDesug_2 (SourceSection src, String _1, A_ArgSeq _2) 
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
    final FunCallDesug_2 other = (FunCallDesug_2)obj;
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
    final A_C c_13416 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13300 = _2;
    final String name12590000 = this._1;
    final A_ArgSeq args3710000 = this._2;
    final R_default_V $tmp4659 = new lookup_1(this.getSourceSection(), name12590000).execute_default(frame, c_13416, l_string_v_13300);
    final A_V lifted_864300 = $tmp4659.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22435 = $tmp4659.get_1();
    final FunV_3 $tmp4660 = lifted_864300.match(FunV_3.class);
    if($tmp4660 != null)
    { 
      final String lifted_854400 = $tmp4660.get_1();
      final A_ParamSeq params3930000 = $tmp4660.get_2();
      final A_Stmt body4500000 = $tmp4660.get_3();
      final R_default_VSeq $tmp4661 = args3710000.execute_default(frame, c_13416, l_string_v_22435);
      final A_VSeq vargs500000 = $tmp4661.value;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_31750 = $tmp4661.get_1();
      final R_default_V $tmp4662 = new invoke_3(this.getSourceSection(), vargs500000, params3930000, body4500000).execute_default(frame, c_13416, l_string_v_31750);
      final A_V lifted_864500 = $tmp4662.value;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_4203 = $tmp4662.get_1();
      return new R_default_V(lifted_864500, l_string_v_4203);
    }
    else
    { }
    return null;
  }

  public String get_1()
  { 
    return this._1;
  }

  public A_ArgSeq get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("FunCallDesug", 2), TermUtils.termFromString(_1, factory), _2.toStrategoTerm(factory));
    return term;
  }
}