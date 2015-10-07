package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class Neq_2 extends A_Expr 
{ 
  @Child private A_Expr _1;

  @Child private A_Expr _2;

  public Neq_2 (SourceSection src, A_Expr _1, A_Expr _2) 
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
    final Neq_2 other = (Neq_2)obj;
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
    final A_C c_13405 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13287 = _2;
    final A_Expr lifted_859800 = this._1;
    final A_Expr lifted_859900 = this._2;
    final R_default_V $tmp4699 = lifted_859800.execute_default(frame, c_13405, l_string_v_13287);
    final A_V lifted_86950 = $tmp4699.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22425 = $tmp4699.get_1();
    final R_default_V $tmp4700 = lifted_859900.execute_default(frame, c_13405, l_string_v_22425);
    final A_V lifted_86940 = $tmp4700.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_31739 = $tmp4700.get_1();
    final BoolV_1 lifted_860000 = new BoolV_1(this.getSourceSection(), ds.manual.interpreter.Natives.notB_1(ds.manual.interpreter.Natives.eqV_2(lifted_86950, lifted_86940)));
    return new R_default_V(lifted_860000, l_string_v_31739);
  }

  public A_Expr get_1()
  { 
    return this._1;
  }

  public A_Expr get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Neq", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    return term;
  }
}