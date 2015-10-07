package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class FunDef_3 extends A_FunDef 
{ 
  @Child private A_ID _1;

  @Child private L_A_ID _2;

  @Child private A_Block _3;

  public FunDef_3 (SourceSection src, A_ID _1, L_A_ID _2, A_Block _3) 
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
    final FunDef_3 other = (FunDef_3)obj;
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
    return super.execute_load(frame, _1);
  }

  public A_ID get_1()
  { 
    return this._1;
  }

  public L_A_ID get_2()
  { 
    return this._2;
  }

  public A_Block get_3()
  { 
    return this._3;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("FunDef", 3), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory), _3.toStrategoTerm(factory));
    return term;
  }
}