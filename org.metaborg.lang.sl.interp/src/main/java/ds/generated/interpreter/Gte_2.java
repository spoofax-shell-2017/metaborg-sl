package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class Gte_2 extends A_Expr 
{ 
  @Child private A_Expr _1;

  @Child private A_Expr _2;

  public Gte_2 (SourceSection src, A_Expr _1, A_Expr _2) 
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
    final Gte_2 other = (Gte_2)obj;
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
    final A_C c_13414 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13296 = _2;
    final A_Expr lifted_862900 = this._1;
    final A_Expr lifted_863000 = this._2;
    final R_default_V $tmp4701 = lifted_862900.execute_default(frame, c_13414, l_string_v_13296);
    final A_V lifted_87040 = $tmp4701.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22432 = $tmp4701.get_1();
    final NumV_1 $tmp4702 = lifted_87040.match(NumV_1.class);
    if($tmp4702 != null)
    { 
      final long i13330000 = $tmp4702.get_1();
      final R_default_V $tmp4703 = lifted_863000.execute_default(frame, c_13414, l_string_v_22432);
      final A_V lifted_87030 = $tmp4703.value;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_31747 = $tmp4703.get_1();
      final NumV_1 $tmp4704 = lifted_87030.match(NumV_1.class);
      if($tmp4704 != null)
      { 
        final long i23330000 = $tmp4704.get_1();
        final BoolV_1 lifted_863100 = new BoolV_1(this.getSourceSection(), ds.manual.interpreter.Natives.lteI_2(i23330000, i13330000));
        return new R_default_V(lifted_863100, l_string_v_31747);
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

  public A_Expr get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("Gte", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    return term;
  }
}