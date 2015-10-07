package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class While_2 extends A_Stmt 
{ 
  @Child private A_Expr _1;

  @Child private A_Block _2;

  public While_2 (SourceSection src, A_Expr _1, A_Block _2) 
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
    final While_2 other = (While_2)obj;
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
    final A_C c_13388 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13269 = _2;
    final A_Expr e9370000 = this._1;
    final A_Block block2090000 = this._2;
    final R_default_U $tmp4737 = new onBreak_1(this.getSourceSection(), new onContinue_1(this.getSourceSection(), new whileHelper_2(this.getSourceSection(), e9370000, block2090000))).execute_default(frame, c_13388, l_string_v_13269);
    final A_U lifted_852800 = $tmp4737.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22412 = $tmp4737.get_1();
    final U_0 lifted_855000 = new U_0(this.getSourceSection());
    return new R_default_U(lifted_855000, l_string_v_22412);
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("While", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    return term;
  }
}