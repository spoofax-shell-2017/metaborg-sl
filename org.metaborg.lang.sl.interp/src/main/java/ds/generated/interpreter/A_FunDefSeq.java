package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.source.*;
import com.oracle.truffle.api.CompilerDirectives.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;

public abstract class A_FunDefSeq extends AbstractNode 
{ 
  public A_FunDefSeq (SourceSection src) 
  { 
    super(src);
  }

  public R_load_U execute_load(VirtualFrame frame, com.github.krukow.clj_ds.PersistentMap<String, A_V> _1)
  { 
    R_load_U res;
    throw new InterpreterException("Rule failure", "load", this);
  }
}