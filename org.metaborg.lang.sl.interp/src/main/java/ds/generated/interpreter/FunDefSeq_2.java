package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class FunDefSeq_2 extends A_FunDefSeq 
{ 
  @Child private A_FunDef _1;

  @Child private A_FunDefSeq _2;

  public FunDefSeq_2 (SourceSection src, A_FunDef _1, A_FunDefSeq _2) 
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
    final FunDefSeq_2 other = (FunDefSeq_2)obj;
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

  public R_load_U execute_load(VirtualFrame frame, com.github.krukow.clj_ds.PersistentMap<String, A_V> _1)
  { 
    R_load_U res;
    res = execute_load_1(frame, _1);
    if(res != null)
    { 
      return res;
    }
    return super.execute_load(frame, _1);
  }

  private R_load_U execute_load_1(VirtualFrame frame, com.github.krukow.clj_ds.PersistentMap<String, A_V> _1)
  { 
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13298 = _1;
    final A_FunDef fdef1920000 = this._1;
    final A_FunDefSeq fdefseq3840000 = this._2;
    final R_load_U $tmp4657 = fdef1920000.execute_load(frame, l_string_v_13298);
    final A_U lifted_854200 = $tmp4657.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22434 = $tmp4657.get_1();
    final R_load_U $tmp4658 = fdefseq3840000.execute_load(frame, l_string_v_22434);
    final A_U lifted_854300 = $tmp4658.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_31749 = $tmp4658.get_1();
    final U_0 lifted_863700 = new U_0(this.getSourceSection());
    return new R_load_U(lifted_863700, l_string_v_31749);
  }

  public A_FunDef get_1()
  { 
    return this._1;
  }

  public A_FunDefSeq get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("FunDefSeq", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    return term;
  }
}