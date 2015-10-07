package ds.generated.interpreter;

import java.util.Objects;
import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;

public class Generic_A_Program extends A_Program implements IGenericNode
{ 
  private IStrategoTerm aterm;

  public Generic_A_Program (SourceSection src, IStrategoTerm term) 
  { 
    super(src);
    Objects.requireNonNull(term);
    this.aterm = term;
  }

  @Override public <T> T match(Class<T> clazz)
  { 
    return specialize().match(clazz);
  }

  @Override public A_Program specialize()
  { 
    if(aterm instanceof IStrategoAppl)
    { 
      final IStrategoAppl term = (IStrategoAppl)aterm;
      final String name = term.getName();
      final SourceSection source = SourceSectionUtil.fromStrategoTerm(term);
      if(name.equals("ProgramDesug") && term.getSubtermCount() == 2)
      { 
        A_Program replacement = replace(new ProgramDesug_2(source, new Generic_A_FunDefSeq(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("Program") && term.getSubtermCount() == 1)
      { 
        A_Program replacement = replace(new Program_1(source, L_A_FunDef.fromStrategoTerm(term.getSubterm(0))));
        return replacement;
      }
    }
    throw new MalformedASTException(aterm.toString());
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    return aterm;
  }

  public R_init_V execute_init(VirtualFrame frame)
  { 
    return specialize().execute_init(frame);
  }
}