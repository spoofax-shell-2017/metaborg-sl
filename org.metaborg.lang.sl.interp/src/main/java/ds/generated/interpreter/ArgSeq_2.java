package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class ArgSeq_2 extends A_ArgSeq 
{ 
  @Child private A_Expr _1;

  @Child private A_ArgSeq _2;

  public ArgSeq_2 (SourceSection src, A_Expr _1, A_ArgSeq _2) 
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
    final ArgSeq_2 other = (ArgSeq_2)obj;
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

  public R_default_VSeq execute_default(VirtualFrame frame, A_C _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2)
  { 
    R_default_VSeq res;
    res = execute_default_1(frame, _1, _2);
    if(res != null)
    { 
      return res;
    }
    return super.execute_default(frame, _1, _2);
  }

  private R_default_VSeq execute_default_1(VirtualFrame frame, A_C _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2)
  { 
    final A_C c_13426 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13310 = _2;
    final A_Expr e9420000 = this._1;
    final A_ArgSeq aseq500000 = this._2;
    final R_default_V $tmp4663 = e9420000.execute_default(frame, c_13426, l_string_v_13310);
    final A_V lifted_87180 = $tmp4663.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22442 = $tmp4663.get_1();
    final R_default_VSeq $tmp4664 = aseq500000.execute_default(frame, c_13426, l_string_v_22442);
    final A_VSeq lifted_87170 = $tmp4664.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_31753 = $tmp4664.get_1();
    final VSeq_2 lifted_867200 = new VSeq_2(this.getSourceSection(), lifted_87180, lifted_87170);
    return new R_default_VSeq(lifted_867200, l_string_v_31753);
  }

  public A_Expr get_1()
  { 
    return this._1;
  }

  public A_ArgSeq get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("ArgSeq", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    return term;
  }
}