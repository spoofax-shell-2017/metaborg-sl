package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.metaborg.meta.interpreter.framework.IConvertibleToStrategoTerm;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;

public class R_default_U  implements IConvertibleToStrategoTerm
{ 
  public final A_U value;

  private com.github.krukow.clj_ds.PersistentMap<String, A_V> _1;

  public R_default_U (A_U value, com.github.krukow.clj_ds.PersistentMap<String, A_V> _1) 
  { 
    this.value = value;
    this._1 = _1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    return factory.makeAppl(factory.makeConstructor("R_default_U", 2), value.toStrategoTerm(factory), AutoMapUtils.map_String_A_V2aterm(_1, factory));
  }

  public com.github.krukow.clj_ds.PersistentMap<String, A_V> get_1()
  { 
    return this._1;
  }
}