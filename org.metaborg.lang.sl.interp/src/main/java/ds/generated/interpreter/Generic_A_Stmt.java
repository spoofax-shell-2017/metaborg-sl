package ds.generated.interpreter;

import java.util.Objects;
import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;

public class Generic_A_Stmt extends A_Stmt implements IGenericNode
{ 
  private IStrategoTerm aterm;

  public Generic_A_Stmt (SourceSection src, IStrategoTerm term) 
  { 
    super(src);
    Objects.requireNonNull(term);
    this.aterm = term;
  }

  @Override public <T> T match(Class<T> clazz)
  { 
    return specialize().match(clazz);
  }

  @Override public A_Stmt specialize()
  { 
    if(aterm instanceof IStrategoAppl)
    { 
      final IStrategoAppl term = (IStrategoAppl)aterm;
      final String name = term.getName();
      final SourceSection source = SourceSectionUtil.fromStrategoTerm(term);
      if(name.equals("whileHelper") && term.getSubtermCount() == 2)
      { 
        A_Stmt replacement = replace(new whileHelper_2(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Block(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("Stmt") && term.getSubtermCount() == 1)
      { 
        A_Stmt replacement = replace(new Stmt_1(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0))));
        return replacement;
      }
      if(name.equals("Seq") && term.getSubtermCount() == 2)
      { 
        A_Stmt replacement = replace(new Seq_2(source, new Generic_A_Stmt(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Stmt(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("While") && term.getSubtermCount() == 2)
      { 
        A_Stmt replacement = replace(new While_2(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Block(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("IfNoElse") && term.getSubtermCount() == 2)
      { 
        A_Stmt replacement = replace(new IfNoElse_2(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Block(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("IfThenElse") && term.getSubtermCount() == 3)
      { 
        A_Stmt replacement = replace(new IfThenElse_3(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Block(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1)), new Generic_A_Block(SourceSectionUtil.fromStrategoTerm(term.getSubterm(2)), term.getSubterm(2))));
        return replacement;
      }
      if(name.equals("Return") && term.getSubtermCount() == 1)
      { 
        A_Stmt replacement = replace(new Return_1(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0))));
        return replacement;
      }
      if(name.equals("ReturnVoid") && term.getSubtermCount() == 0)
      { 
        A_Stmt replacement = replace(new ReturnVoid_0(source));
        return replacement;
      }
      if(name.equals("Break") && term.getSubtermCount() == 0)
      { 
        A_Stmt replacement = replace(new Break_0(source));
        return replacement;
      }
      if(name.equals("Continue") && term.getSubtermCount() == 0)
      { 
        A_Stmt replacement = replace(new Continue_0(source));
        return replacement;
      }
      if(name.equals("__Block2Stmt__") && term.getSubtermCount() == 1)
      { 
        A_Stmt replacement = replace(new __Block2Stmt___1(source, new Generic_A_Block(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0))));
        return replacement;
      }
    }
    try
    { 
      return replace(new __Block2Stmt___1(this.getSourceSection(), new Generic_A_Block(SourceSectionUtil.fromStrategoTerm(aterm), aterm)));
    }
    catch(MalformedASTException n_344469)
    { }
    throw new MalformedASTException(aterm.toString());
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    return aterm;
  }

  public R_default_U execute_default(VirtualFrame frame, A_C _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2)
  { 
    return specialize().execute_default(frame, _1, _2);
  }
}