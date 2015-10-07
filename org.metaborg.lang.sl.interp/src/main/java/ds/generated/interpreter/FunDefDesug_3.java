package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class FunDefDesug_3 extends A_FunDef 
{ 
  private String _1;

  @Child private A_ParamSeq _2;

  @Child private A_Stmt _3;

  public FunDefDesug_3 (SourceSection src, String _1, A_ParamSeq _2, A_Stmt _3) 
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
    final FunDefDesug_3 other = (FunDefDesug_3)obj;
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
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13299 = _1;
    final String name12580000 = this._1;
    final A_ParamSeq params3920000 = this._2;
    final A_Stmt body4490000 = this._3;
    final U_0 lifted_863800 = new U_0(this.getSourceSection());
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_863900 = MapUtils.plus(l_string_v_13299, MapUtils.add(PersistentTreeMap.EMPTY, name12580000, new FunV_3(this.getSourceSection(), name12580000, params3920000, body4490000)));
    return new R_load_U(lifted_863800, lifted_863900);
  }

  public String get_1()
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("FunDefDesug", 3), TermUtils.termFromString(_1, factory), _2.toStrategoTerm(factory), _3.toStrategoTerm(factory));
    return term;
  }
}