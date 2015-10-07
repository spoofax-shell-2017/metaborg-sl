package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class invoke_3 extends A_invoke__Arrow 
{ 
  @Child private A_VSeq _1;

  @Child private A_ParamSeq _2;

  @Child private A_Stmt _3;

  public invoke_3 (SourceSection src, A_VSeq _1, A_ParamSeq _2, A_Stmt _3) 
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
    final invoke_3 other = (invoke_3)obj;
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
    final A_C c_13411 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13293 = _2;
    final A_VSeq vseq1360000 = this._1;
    final A_ParamSeq parseq500000 = this._2;
    final A_Stmt stmt4780000 = this._3;
    final R_default_Map_String_V_ $tmp4643 = new bind_2(this.getSourceSection(), vseq1360000, parseq500000).execute_default(frame, c_13411, l_string_v_13293);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_862200 = $tmp4643.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22430 = $tmp4643.get_1();
    final R_default_V $tmp4644 = new onReturn_1(this.getSourceSection(), stmt4780000).execute_default(frame, c_13411, lifted_862200);
    final A_V lifted_862400 = $tmp4644.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_31744 = $tmp4644.get_1();
    return new R_default_V(lifted_862400, l_string_v_13293);
  }

  public A_VSeq get_1()
  { 
    return this._1;
  }

  public A_ParamSeq get_2()
  { 
    return this._2;
  }

  public A_Stmt get_3()
  { 
    return this._3;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("invoke", 3), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory), _3.toStrategoTerm(factory));
    return term;
  }
}