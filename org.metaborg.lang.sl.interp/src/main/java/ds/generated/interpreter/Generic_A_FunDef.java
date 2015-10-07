package ds.generated.interpreter;

import java.util.Objects;
import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;

public class Generic_A_FunDef extends A_FunDef implements IGenericNode
{ 
  private IStrategoTerm aterm;

  public Generic_A_FunDef (SourceSection src, IStrategoTerm term) 
  { 
    super(src);
    Objects.requireNonNull(term);
    this.aterm = term;
  }

  @Override public <T> T match(Class<T> clazz)
  { 
    return specialize().match(clazz);
  }

  @Override public A_FunDef specialize()
  { 
    if(aterm instanceof IStrategoAppl)
    { 
      final IStrategoAppl term = (IStrategoAppl)aterm;
      final String name = term.getName();
      final SourceSection source = SourceSectionUtil.fromStrategoTerm(term);
      if(name.equals("FunDefDesug") && term.getSubtermCount() == 3)
      { 
        A_FunDef replacement = replace(new FunDefDesug_3(source, TermUtils.stringFromTerm(term.getSubterm(0)), new Generic_A_ParamSeq(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1)), new Generic_A_Stmt(SourceSectionUtil.fromStrategoTerm(term.getSubterm(2)), term.getSubterm(2))));
        return replacement;
      }
      if(name.equals("FunDef") && term.getSubtermCount() == 3)
      { 
        A_FunDef replacement = replace(new FunDef_3(source, new Generic_A_ID(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), L_A_ID.fromStrategoTerm(term.getSubterm(1)), new Generic_A_Block(SourceSectionUtil.fromStrategoTerm(term.getSubterm(2)), term.getSubterm(2))));
        return replacement;
      }
    }
    throw new MalformedASTException(aterm.toString());
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    return aterm;
  }

  public R_load_U execute_load(VirtualFrame frame, com.github.krukow.clj_ds.PersistentMap<String, A_V> _1)
  { 
    return specialize().execute_load(frame, _1);
  }
}