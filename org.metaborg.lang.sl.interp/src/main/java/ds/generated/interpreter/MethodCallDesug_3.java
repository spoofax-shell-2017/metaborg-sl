package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class MethodCallDesug_3 extends A_Expr 
{ 
  @Child private A_Expr _1;

  private String _2;

  @Child private A_ArgSeq _3;

  public MethodCallDesug_3 (SourceSection src, A_Expr _1, String _2, A_ArgSeq _3) 
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
    final MethodCallDesug_3 other = (MethodCallDesug_3)obj;
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
    final A_C c_13407 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13289 = _2;
    final A_Expr lifted_860700 = this._1;
    final String fun520000 = this._2;
    final A_ArgSeq eseq520000 = this._3;
    final R_default_V $tmp4665 = lifted_860700.execute_default(frame, c_13407, l_string_v_13289);
    final A_V lifted_86980 = $tmp4665.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22427 = $tmp4665.get_1();
    final ObjV_1 $tmp4666 = lifted_86980.match(ObjV_1.class);
    if($tmp4666 != null)
    { 
      final ObjData od1600000 = $tmp4666.get_1();
      final FunV_3 $tmp4667 = od1600000.readProp(fun520000).match(FunV_3.class);
      if($tmp4667 != null)
      { 
        final String lifted_853700 = $tmp4667.get_1();
        final A_ParamSeq pseq850000 = $tmp4667.get_2();
        final A_Stmt body4480000 = $tmp4667.get_3();
        final R_default_VSeq $tmp4668 = eseq520000.execute_default(frame, c_13407, l_string_v_22427);
        final A_VSeq vseq1350000 = $tmp4668.value;
        final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_31741 = $tmp4668.get_1();
        final R_default_V $tmp4669 = new invoke_3(this.getSourceSection(), vseq1350000, pseq850000, body4480000).execute_default(frame, c_13407, l_string_v_31741);
        final A_V lifted_861100 = $tmp4669.value;
        final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_4202 = $tmp4669.get_1();
        return new R_default_V(lifted_861100, l_string_v_4202);
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

  public String get_2()
  { 
    return this._2;
  }

  public A_ArgSeq get_3()
  { 
    return this._3;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("MethodCallDesug", 3), _1.toStrategoTerm(factory), TermUtils.termFromString(_2, factory), _3.toStrategoTerm(factory));
    return term;
  }
}