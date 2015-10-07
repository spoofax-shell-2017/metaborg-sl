package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class Add_2 extends A_Expr 
{ 
  @Child private A_Expr _1;

  @Child private A_Expr _2;

  public Add_2 (SourceSection src, A_Expr _1, A_Expr _2) 
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
    final Add_2 other = (Add_2)obj;
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
    final A_C c_13428 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13312 = _2;
    final A_Expr lifted_867700 = this._1;
    final A_Expr lifted_867800 = this._2;
    final R_default_V $tmp4673 = lifted_867700.execute_default(frame, c_13428, l_string_v_13312);
    final A_V lifted_87220 = $tmp4673.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22444 = $tmp4673.get_1();
    final R_default_V $tmp4674 = lifted_867800.execute_default(frame, c_13428, l_string_v_22444);
    final A_V lifted_87210 = $tmp4674.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_31755 = $tmp4674.get_1();
    if(ds.manual.interpreter.Natives.orB_2(ds.manual.interpreter.Natives.isS_1(lifted_87220), ds.manual.interpreter.Natives.isS_1(lifted_87210)) == true)
    { 
      final StringV_1 vout2090000 = new StringV_1(this.getSourceSection(), ds.manual.interpreter.Natives.concatS_2(ds.manual.interpreter.Natives.v2s_1(lifted_87220), ds.manual.interpreter.Natives.v2s_1(lifted_87210)));
      return new R_default_V(vout2090000, l_string_v_31755);
    }
    else
    { 
      final NumV_1 $tmp4675 = lifted_87220.match(NumV_1.class);
      if($tmp4675 != null)
      { 
        final long i13360000 = $tmp4675.get_1();
        final NumV_1 $tmp4676 = lifted_87210.match(NumV_1.class);
        if($tmp4676 != null)
        { 
          final long i23360000 = $tmp4676.get_1();
          final NumV_1 vout2090000 = new NumV_1(this.getSourceSection(), ds.manual.interpreter.Natives.addI_2(i13360000, i23360000));
          return new R_default_V(vout2090000, l_string_v_31755);
        }
        else
        { }
      }
      else
      { }
    }
    return null;
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
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Add", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    return term;
  }
}