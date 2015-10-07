package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class bind_2 extends A_bind__Arrow 
{ 
  @Child private A_VSeq _1;

  @Child private A_ParamSeq _2;

  public bind_2 (SourceSection src, A_VSeq _1, A_ParamSeq _2) 
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
    final bind_2 other = (bind_2)obj;
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

  public R_default_Map_String_V_ execute_default(VirtualFrame frame, A_C _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2)
  { 
    R_default_Map_String_V_ res;
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

  private R_default_Map_String_V_ execute_default_1(VirtualFrame frame, A_C _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2)
  { 
    final A_C c_13424 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13308 = _2;
    final A_VSeq lifted_866200 = this._1;
    final A_ParamSeq lifted_866300 = this._2;
    final NoVSeq_0 $tmp4645 = lifted_866200.match(NoVSeq_0.class);
    if($tmp4645 != null)
    { 
      final NoParamSeq_0 $tmp4646 = lifted_866300.match(NoParamSeq_0.class);
      if($tmp4646 != null)
      { 
        final C_1 $tmp4647 = c_13424.match(C_1.class);
        if($tmp4647 != null)
        { 
          final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_866400 = $tmp4647.get_1();
          return new R_default_Map_String_V_(lifted_866400, l_string_v_13308);
        }
        else
        { }
      }
      else
      { }
    }
    else
    { }
    return null;
  }

  private R_default_Map_String_V_ execute_default_2(VirtualFrame frame, A_C _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2)
  { 
    final A_C c_13425 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_13309 = _2;
    final A_VSeq lifted_866500 = this._1;
    final A_ParamSeq lifted_866600 = this._2;
    final VSeq_2 $tmp4648 = lifted_866500.match(VSeq_2.class);
    if($tmp4648 != null)
    { 
      final A_V lifted_866800 = $tmp4648.get_1();
      final A_VSeq vseq1370000 = $tmp4648.get_2();
      final ParamSeq_2 $tmp4649 = lifted_866600.match(ParamSeq_2.class);
      if($tmp4649 != null)
      { 
        final String p2080000 = $tmp4649.get_1();
        final A_ParamSeq pseq860000 = $tmp4649.get_2();
        final R_default_Map_String_V_ $tmp4650 = new bind_2(this.getSourceSection(), vseq1370000, pseq860000).execute_default(frame, c_13425, l_string_v_13309);
        final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_867000 = $tmp4650.value;
        final com.github.krukow.clj_ds.PersistentMap<String, A_V> l_string_v_22441 = $tmp4650.get_1();
        final com.github.krukow.clj_ds.PersistentMap<String, A_V> lifted_866700 = MapUtils.plus(lifted_867000, MapUtils.add(PersistentTreeMap.EMPTY, p2080000, lifted_866800));
        return new R_default_Map_String_V_(lifted_866700, l_string_v_22441);
      }
      else
      { }
    }
    else
    { }
    return null;
  }

  public A_VSeq get_1()
  { 
    return this._1;
  }

  public A_ParamSeq get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("bind", 2), _1.toStrategoTerm(factory), _2.toStrategoTerm(factory));
    return term;
  }
}