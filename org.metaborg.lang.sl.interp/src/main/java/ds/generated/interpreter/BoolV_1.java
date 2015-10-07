package ds.generated.interpreter;

import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;
import org.metaborg.meta.interpreter.framework.*;

public class BoolV_1 extends A_V 
{ 
  private boolean _1;

  public BoolV_1 (SourceSection src, boolean _1) 
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
    final BoolV_1 other = (BoolV_1)obj;
    if(_1 != other._1)
    { 
      return false;
    }
    return true;
  }

  public boolean get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("BoolV", 1), TermUtils.termFromBool(_1, factory));
    return term;
  }
}