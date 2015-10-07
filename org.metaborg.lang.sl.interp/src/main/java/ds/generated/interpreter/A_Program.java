package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.source.*;
import com.oracle.truffle.api.CompilerDirectives.*;
import com.github.krukow.clj_lang.*;
import ds.manual.interpreter.*;

public abstract class A_Program extends AbstractNode 
{ 
  public A_Program (SourceSection src) 
  { 
    super(src);
  }

  public R_init_V execute_init(VirtualFrame frame)
  { 
    R_init_V res;
    throw new InterpreterException("Rule failure", "init", this);
  }
}