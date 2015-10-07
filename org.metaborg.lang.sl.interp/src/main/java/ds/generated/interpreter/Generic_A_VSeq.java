package ds.generated.interpreter;

import java.util.Objects;
import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;

public class Generic_A_VSeq extends A_VSeq implements IGenericNode
{ 
  private IStrategoTerm aterm;

  public Generic_A_VSeq (SourceSection src, IStrategoTerm term) 
  { 
    super(src);
    Objects.requireNonNull(term);
    this.aterm = term;
  }

  @Override public <T> T match(Class<T> clazz)
  { 
    return specialize().match(clazz);
  }

  @Override public A_VSeq specialize()
  { 
    if(aterm instanceof IStrategoAppl)
    { 
      final IStrategoAppl term = (IStrategoAppl)aterm;
      final String name = term.getName();
      final SourceSection source = SourceSectionUtil.fromStrategoTerm(term);
      if(name.equals("VSeq") && term.getSubtermCount() == 2)
      { 
        A_VSeq replacement = replace(new VSeq_2(source, new Generic_A_V(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_VSeq(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("NoVSeq") && term.getSubtermCount() == 0)
      { 
        A_VSeq replacement = replace(new NoVSeq_0(source));
        return replacement;
      }
    }
    throw new MalformedASTException(aterm.toString());
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    return aterm;
  }
}