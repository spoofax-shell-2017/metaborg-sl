package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class VarWrite_2 extends A_Expr 
{ 
  @Child private A_ID _1;

  @Child private A_Expr _2;

  public VarWrite_2 (SourceSection src, A_ID _1, A_Expr _2) 
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
    final VarWrite_2 other = (VarWrite_2)obj;
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
    final A_C c_13389 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13270 = _2;
    final A_ID lifted_855400 = this._1;
    final A_Expr lifted_855500 = this._2;
    final __String2ID___1 $tmp4721 = lifted_855400.match(__String2ID___1.class);
    if($tmp4721 != null)
    { 
      final String name12550000 = $tmp4721.get_1();
      final R_default_V $tmp4722 = lifted_855500.execute_default(frame, c_13389, l_string_v_13270);
      final A_V lifted_86800 = $tmp4722.value;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22413 = $tmp4722.get_1();
      final R_default_V $tmp4723 = new write_2(this.getSourceSection(), name12550000, lifted_86800).execute_default(frame, c_13389, l_string_v_22413);
      final A_V lifted_86820 = $tmp4723.value;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_31733 = $tmp4723.get_1();
      return new R_default_V(lifted_86820, l_string_v_31733);
    }
    else
    { }
    return null;
  }

  public A_ID get_1()
  { 
    return this._1;
  }

  public A_Expr get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("VarWrite", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    return term;
  }
}