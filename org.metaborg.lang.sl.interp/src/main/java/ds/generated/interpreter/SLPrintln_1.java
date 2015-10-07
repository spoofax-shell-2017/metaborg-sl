package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class SLPrintln_1 extends A_Expr 
{ 
  @Child private A_Expr _1;

  public SLPrintln_1 (SourceSection src, A_Expr _1) 
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
    final SLPrintln_1 other = (SLPrintln_1)obj;
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
    final A_C c_13395 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13276 = _2;
    final A_Expr e9390000 = this._1;
    final R_default_V $tmp4670 = e9390000.execute_default(frame, c_13395, l_string_v_13276);
    final A_V lifted_856800 = $tmp4670.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22417 = $tmp4670.get_1();
    final String lifted_853000 = ds.manual.interpreter.Natives.println_1(ds.manual.interpreter.Natives.v2s_1(lifted_856800));
    return new R_default_V(lifted_856800, l_string_v_22417);
  }

  public A_Expr get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("SLPrintln", 1), _1.toStrategoTerm(factory));
    return term;
  }
}