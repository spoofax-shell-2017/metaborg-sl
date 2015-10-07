package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class String_1 extends A_Expr 
{ 
  @Child private A_STRING _1;

  public String_1 (SourceSection src, A_STRING _1) 
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
    final String_1 other = (String_1)obj;
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
    final A_C c_13393 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13274 = _2;
    final A_STRING lifted_856500 = this._1;
    final __String2STRING___1 $tmp4672 = lifted_856500.match(__String2STRING___1.class);
    if($tmp4672 != null)
    { 
      final String s840000 = $tmp4672.get_1();
      final StringV_1 lifted_856600 = new StringV_1(this.getSourceSection(), s840000);
      return new R_default_V(lifted_856600, l_string_v_13274);
    }
    else
    { }
    return null;
  }

  public A_STRING get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("String", 1), _1.toStrategoTerm(factory));
    return term;
  }
}