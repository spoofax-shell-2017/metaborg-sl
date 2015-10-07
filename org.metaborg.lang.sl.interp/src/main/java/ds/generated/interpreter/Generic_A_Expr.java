package ds.generated.interpreter;

import java.util.Objects;
import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.frame.*;
import com.oracle.truffle.api.nodes.*;
import com.oracle.truffle.api.source.*;

public class Generic_A_Expr extends A_Expr implements IGenericNode
{ 
  private IStrategoTerm aterm;

  public Generic_A_Expr (SourceSection src, IStrategoTerm term) 
  { 
    super(src);
    Objects.requireNonNull(term);
    this.aterm = term;
  }

  @Override public <T> T match(Class<T> clazz)
  { 
    return specialize().match(clazz);
  }

  @Override public A_Expr specialize()
  { 
    if(aterm instanceof IStrategoAppl)
    { 
      final IStrategoAppl term = (IStrategoAppl)aterm;
      final String name = term.getName();
      final SourceSection source = SourceSectionUtil.fromStrategoTerm(term);
      if(name.equals("FunCallDesug") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new FunCallDesug_2(source, TermUtils.stringFromTerm(term.getSubterm(0)), new Generic_A_ArgSeq(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("MethodCallDesug") && term.getSubtermCount() == 3)
      { 
        A_Expr replacement = replace(new MethodCallDesug_3(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), TermUtils.stringFromTerm(term.getSubterm(1)), new Generic_A_ArgSeq(SourceSectionUtil.fromStrategoTerm(term.getSubterm(2)), term.getSubterm(2))));
        return replacement;
      }
      if(name.equals("SLPrintln") && term.getSubtermCount() == 1)
      { 
        A_Expr replacement = replace(new SLPrintln_1(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0))));
        return replacement;
      }
      if(name.equals("SLReadln") && term.getSubtermCount() == 0)
      { 
        A_Expr replacement = replace(new SLReadln_0(source));
        return replacement;
      }
      if(name.equals("SLDefineFunction") && term.getSubtermCount() == 1)
      { 
        A_Expr replacement = replace(new SLDefineFunction_1(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0))));
        return replacement;
      }
      if(name.equals("SLNanoTime") && term.getSubtermCount() == 0)
      { 
        A_Expr replacement = replace(new SLNanoTime_0(source));
        return replacement;
      }
      if(name.equals("SLNewObject") && term.getSubtermCount() == 0)
      { 
        A_Expr replacement = replace(new SLNewObject_0(source));
        return replacement;
      }
      if(name.equals("SLStacktrace") && term.getSubtermCount() == 0)
      { 
        A_Expr replacement = replace(new SLStacktrace_0(source));
        return replacement;
      }
      if(name.equals("FunCall") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new FunCall_2(source, new Generic_A_ID(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), L_A_Expr.fromStrategoTerm(term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("Int") && term.getSubtermCount() == 1)
      { 
        A_Expr replacement = replace(new Int_1(source, new Generic_A_INT(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0))));
        return replacement;
      }
      if(name.equals("String") && term.getSubtermCount() == 1)
      { 
        A_Expr replacement = replace(new String_1(source, new Generic_A_STRING(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0))));
        return replacement;
      }
      if(name.equals("True") && term.getSubtermCount() == 0)
      { 
        A_Expr replacement = replace(new True_0(source));
        return replacement;
      }
      if(name.equals("False") && term.getSubtermCount() == 0)
      { 
        A_Expr replacement = replace(new False_0(source));
        return replacement;
      }
      if(name.equals("Add") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new Add_2(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("Div") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new Div_2(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("Mul") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new Mul_2(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("Sub") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new Sub_2(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("Eq") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new Eq_2(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("Lte") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new Lte_2(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("Lt") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new Lt_2(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("Neq") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new Neq_2(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("Gte") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new Gte_2(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("Gt") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new Gt_2(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("And") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new And_2(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("Or") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new Or_2(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("Not") && term.getSubtermCount() == 1)
      { 
        A_Expr replacement = replace(new Not_1(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0))));
        return replacement;
      }
      if(name.equals("VarRead") && term.getSubtermCount() == 1)
      { 
        A_Expr replacement = replace(new VarRead_1(source, new Generic_A_ID(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0))));
        return replacement;
      }
      if(name.equals("VarWrite") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new VarWrite_2(source, new Generic_A_ID(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("PropRead") && term.getSubtermCount() == 2)
      { 
        A_Expr replacement = replace(new PropRead_2(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_ID(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1))));
        return replacement;
      }
      if(name.equals("PropWrite") && term.getSubtermCount() == 3)
      { 
        A_Expr replacement = replace(new PropWrite_3(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_ID(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1)), new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(2)), term.getSubterm(2))));
        return replacement;
      }
      if(name.equals("MethodCall") && term.getSubtermCount() == 3)
      { 
        A_Expr replacement = replace(new MethodCall_3(source, new Generic_A_Expr(SourceSectionUtil.fromStrategoTerm(term.getSubterm(0)), term.getSubterm(0)), new Generic_A_ID(SourceSectionUtil.fromStrategoTerm(term.getSubterm(1)), term.getSubterm(1)), L_A_Expr.fromStrategoTerm(term.getSubterm(2))));
        return replacement;
      }
    }
    throw new MalformedASTException(aterm.toString());
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    return aterm;
  }

  public R_default_V execute_default(VirtualFrame frame, A_C _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2)
  { 
    return specialize().execute_default(frame, _1, _2);
  }
}