package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class Int_1 extends A_Expr 
{ 
  @Child private A_INT _1;

  public Int_1 (SourceSection src, A_INT _1) 
  { 
    super(src);
    this._1 = _1;
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
    final Int_1 other = (Int_1)obj;
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
    final A_C c_13412 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13294 = _2;
    final A_INT lifted_862500 = this._1;
    final __String2INT___1 $tmp4671 = lifted_862500.match(__String2INT___1.class);
    if($tmp4671 != null)
    { 
      final String s850000 = $tmp4671.get_1();
      final NumV_1 lifted_862600 = new NumV_1(this.getSourceSection(), ds.manual.interpreter.Natives.s2l_1(s850000));
      return new R_default_V(lifted_862600, l_string_v_13294);
    }
    else
    { }
    return null;
  }

  public A_INT get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Int", 1), _1.toStrategoTerm(factory));
    return term;
  }
}