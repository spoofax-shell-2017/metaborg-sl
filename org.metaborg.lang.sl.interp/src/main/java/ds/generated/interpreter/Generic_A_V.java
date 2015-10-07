package ds.generated.interpreter;

import java.util.Objects;
import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;

public class Generic_A_V extends A_V implements IGenericNode
{ 
  private IStrategoTerm aterm;

  public Generic_A_V (SourceSection src, IStrategoTerm term) 
  { 
    super(src);
    Objects.requireNonNull(term);
    this.aterm = term;
  }

  @Override public <T> T match(Class<T> clazz)
  { 
    return specialize().match(clazz);
  }

  @Override public A_V specialize()
  { 
    if(aterm instanceof IStrategoAppl)
    { 
      final IStrategoAppl term = (IStrategoAppl)aterm;
      final String name = term.getName();
      final SourceSection source = SourceSectionUtil.fromStrategoTerm(term);
      if(name.equals("ObjV") && term.getSubtermCount() == 1)
      { 
        A_V replacement = replace(new ObjV_1(source, null));
        return replacement;
      }
      if(name.equals("NullV") && term.getSubtermCount() == 0)
      { 
        A_V replacement = replace(new NullV_0(source));
        return replacement;
      }
      if(name.equals("BoolV") && term.getSubtermCount() == 1)
      { 
        A_V replacement = replace(new BoolV_1(source, TermUtils.boolFromTerm(term.getSubterm(0))));
        return replacement;
      }
      if(name.equals("NumV") && term.getSubtermCount() == 1)
      { 
        A_V replacement = replace(new NumV_1(source, TermUtils.longFromTerm(term.getSubterm(0))));
        return replacement;
      }
      if(name.equals("StringV") && term.getSubtermCount() == 1)
      { 
        A_V replacement = replace(new StringV_1(source, TermUtils.stringFromTerm(term.getSubterm(0))));
        return replacement;
      }
      if(name.equals("FunV") && term.getSubtermCount() == 3)
      { 
        A_V replacement = replace(new FunV_3(source, TermUtils.stringFromTerm(term.getSubterm(0)), new Generic_A_ParamSeq(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1)), new Generic_A_Stmt(SourceSectionUtil.fromStrategoTerm(term.getSubterm(2)), term.getSubterm(2))));
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