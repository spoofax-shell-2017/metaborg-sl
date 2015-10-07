package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class __Block2Stmt___1 extends A_Stmt 
{ 
  @Child private A_Block _1;

  public __Block2Stmt___1 (SourceSection src, A_Block _1) 
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
    final __Block2Stmt___1 other = (__Block2Stmt___1)obj;
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

  public R_default_U execute_default(VirtualFrame frame, A_C _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2)
  { 
    R_default_U res;
    res = execute_default_1(frame, _1, _2);
    if(res != null)
    { 
      return res;
    }
    res = execute_default_2(frame, _1, _2);
    if(res != null)
    { 
      return res;
    }
    return super.execute_default(frame, _1, _2);
  }

  private R_default_U execute_default_1(VirtualFrame frame, A_C _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2)
  { 
    final A_C c_13419 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13303 = _2;
    final A_Block lifted_87090 = this._1;
    final EmptyBlock_0 $tmp4734 = lifted_87090.match(EmptyBlock_0.class);
    if($tmp4734 != null)
    { 
      final U_0 lifted_865200 = new U_0(this.getSourceSection());
      return new R_default_U(lifted_865200, l_string_v_13303);
    }
    else
    { }
    return null;
  }

  private R_default_U execute_default_2(VirtualFrame frame, A_C _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2)
  { 
    final A_C c_13423 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13307 = _2;
    final A_Block lifted_87120 = this._1;
    final Block_1 $tmp4735 = lifted_87120.match(Block_1.class);
    if($tmp4735 != null)
    { 
      final A_Stmt stmt4790000 = $tmp4735.get_1();
      final R_default_U $tmp4736 = stmt4790000.execute_default(frame, c_13423, l_string_v_13307);
      final A_U lifted_87140 = $tmp4736.value;
      final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22440 = $tmp4736.get_1();
      return new R_default_U(lifted_87140, l_string_v_22440);
    }
    else
    { }
    return null;
  }

  public A_Block get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("__Block2Stmt__", 1), _1.toStrategoTerm(factory));
    return term;
  }
}