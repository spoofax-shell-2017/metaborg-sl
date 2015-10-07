package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class PropWrite_3 extends A_Expr 
{ 
  @Child private A_Expr _1;

  @Child private A_ID _2;

  @Child private A_Expr _3;

  public PropWrite_3 (SourceSection src, A_Expr _1, A_ID _2, A_Expr _3) 
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
    final PropWrite_3 other = (PropWrite_3)obj;
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
    final A_C c_13400 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13281 = _2;
    final A_Expr lifted_857900 = this._1;
    final A_ID lifted_858000 = this._2;
    final A_Expr lifted_858100 = this._3;
    final R_default_V $tmp4727 = lifted_857900.execute_default(frame, c_13400, l_string_v_13281);
    final A_V lifted_86890 = $tmp4727.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22421 = $tmp4727.get_1();
    final ObjV_1 $tmp4728 = lifted_86890.match(ObjV_1.class);
    if($tmp4728 != null)
    { 
      final ObjData od1580000 = $tmp4728.get_1();
      final __String2ID___1 $tmp4729 = lifted_858000.match(__String2ID___1.class);
      if($tmp4729 != null)
      { 
        final String prop1050000 = $tmp4729.get_1();
        final R_default_V $tmp4730 = lifted_858100.execute_default(frame, c_13400, l_string_v_22421);
        final A_V lifted_86880 = $tmp4730.value;
        final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_31737 = $tmp4730.get_1();
        final A_V lifted_858200 = od1580000.writeProp(prop1050000, lifted_86880);
        return new R_default_V(lifted_858200, l_string_v_31737);
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

  public A_ID get_2()
  { 
    return this._2;
  }

  public A_Expr get_3()
  { 
    return this._3;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("PropWrite", 3), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory), _3.toStrategoTerm(factory));
    return term;
  }
}