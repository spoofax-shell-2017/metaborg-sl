package ds.generated.interpreter;

import java.util.Objects;
import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;

public class Generic_A_ParamSeq extends A_ParamSeq implements IGenericNode
{ 
  private IStrategoTerm aterm;

  public Generic_A_ParamSeq (SourceSection src, IStrategoTerm term) 
  { 
    super(src);
    Objects.requireNonNull(term);
    this.aterm = term;
  }

  @Override public <T> T match(Class<T> clazz)
  { 
    return specialize().match(clazz);
  }

  @Override public A_ParamSeq specialize()
  { 
    if(aterm instanceof IStrategoAppl)
    { 
      final IStrategoAppl term = (IStrategoAppl)aterm;
      final String name = term.getName();
      final SourceSection source = SourceSectionUtil.fromStrategoTerm(term);
      if(name.equals("ParamSeq") && term.getSubtermCount() == 2)
      { 
        A_ParamSeq replacement = replace(new ParamSeq_2(source, TermUtils.stringFromTerm(term.getSubterm(0)), new Generic_A_ParamSeq(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("NoParamSeq") && term.getSubtermCount() == 0)
      { 
        A_ParamSeq replacement = replace(new NoParamSeq_0(source));
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