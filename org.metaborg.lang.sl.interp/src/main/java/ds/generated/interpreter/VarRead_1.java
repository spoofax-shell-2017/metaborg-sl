package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class VarRead_1 extends A_Expr 
{ 
  @Child private A_ID _1;

  public VarRead_1 (SourceSection src, A_ID _1) 
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
    final VarRead_1 other = (VarRead_1)obj;
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
    final A_C c_13390 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13271 = _2;
    final A_ID lifted_855700 = this._1;
    final __String2ID___1 $tmp4719 = lifted_855700.match(__String2ID___1.class);
    if($tmp4719 != null)
    { 
      final String name12560000 = $tmp4719.get_1();
      final R_default_V $tmp4720 = new lookup_1(this.getSourceSection(), name12560000).execute_default(frame, c_13390, l_string_v_13271);
      final A_V lifted_86840 = $tmp4720.value;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22414 = $tmp4720.get_1();
      return new R_default_V(lifted_86840, l_string_v_22414);
    }
    else
    { }
    return null;
  }

  public A_ID get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("VarRead", 1), _1.toStrategoTerm(factory));
    return term;
  }
}