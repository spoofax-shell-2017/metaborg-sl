package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class ProgramDesug_2 extends A_Program 
{ 
  @Child private A_FunDefSeq _1;

  @Child private A_Expr _2;

  public ProgramDesug_2 (SourceSection src, A_FunDefSeq _1, A_Expr _2) 
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
    final ProgramDesug_2 other = (ProgramDesug_2)obj;
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

  public R_init_V execute_init(VirtualFrame frame)
  { 
    R_init_V res;
    res = execute_init_1(frame);
    if(res != null)
    { 
      return res;
    }
    return super.execute_init(frame);
  }

  private R_init_V execute_init_1(VirtualFrame frame)
  { 
    final A_FunDefSeq fdefseq3830000 = this._1;
    final A_Expr e9400000 = this._2;
    final R_load_U $tmp4655 = fdefseq3830000.execute_load(frame, (com.github.krukow.clj_ds.PersistentMap<String, A_V>)PersistentTreeMap.EMPTY);
    final A_U lifted_853500 = $tmp4655.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> E9620000 = $tmp4655.get_1();
    final R_default_V $tmp4656 = e9400000.execute_default(frame, new C_1(this.getSourceSection(), E9620000), E9620000);
    final A_V lifted_858800 = $tmp4656.value;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_853600 = $tmp4656.get_1();
    return new R_init_V(lifted_858800);
  }

  public A_FunDefSeq get_1()
  { 
    return this._1;
  }

  public A_Expr get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("ProgramDesug", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    return term;
  }
}