package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.source.*;
import com.oracle.truffle.api.CompilerDirectives.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;

public abstract class A_Stmt extends AbstractNode 
{ 
  public A_Stmt (SourceSection src) 
  { 
    super(src);
  }

  public R_default_U execute_default(VirtualFrame frame, A_C _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2)
  { 
    R_default_U res;
    throw new InterpreterException("Rule failure", "default", this);
  }
}