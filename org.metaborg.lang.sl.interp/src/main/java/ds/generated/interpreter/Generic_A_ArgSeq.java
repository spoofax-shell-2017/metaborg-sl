package ds.generated.interpreter;

import java.util.Objects;
import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;

public class Generic_A_ArgSeq extends A_ArgSeq implements IGenericNode
{ 
  private IStrategoTerm aterm;

  public Generic_A_ArgSeq (SourceSection src, IStrategoTerm term) 
  { 
    super(src);
    Objects.requireNonNull(term);
    this.aterm = term;
  }

  @Override public <T> T match(Class<T> clazz)
  { 
    return specialize().match(clazz);
  }

  @Override public A_ArgSeq specialize()
  { 
    if(aterm instanceof IStrategoAppl)
    { 
      final IStrategoAppl term = (IStrategoAppl)aterm;
      final String name = term.getName();
      final SourceSection source = SourceSectionUtil.fromStrategoTerm(term);
      if(name.equals("ArgSeq") && term.getSubtermCount() == 2)
      { 
        A_ArgSeq replacement = replace(new ArgSeq_2(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_ArgSeq(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("NoArgSeq") && term.getSubtermCount() == 0)
      { 
        A_ArgSeq replacement = replace(new NoArgSeq_0(source));
        return replacement;
      }
    }
    throw new MalformedASTException(aterm.toString());
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    return aterm;
  }

  public R_default_VSeq execute_default(VirtualFrame frame, A_C _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2)
  { 
    return specialize().execute_default(frame, _1, _2);
  }
}