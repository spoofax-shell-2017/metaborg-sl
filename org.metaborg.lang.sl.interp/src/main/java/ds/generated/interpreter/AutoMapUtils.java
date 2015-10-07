package ds.generated.interpreter;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import org.spoofax.interpreter.terms.*;
import org.spoofax.interpreter.core.Tools;
import org.metaborg.meta.interpreter.framework.*;
import com.github.krukow.clj_ds.PersistentMap;
import com.github.krukow.clj_lang.PersistentTreeMap;

public class AutoMapUtils  
{ 
  public static IStrategoTerm map_String_A_V2aterm(PersistentMap<String, A_V> map, ITermFactory factory)
  { 
    IStrategoConstructor bindCons = factory.makeConstructor("Bind", 2);
    IStrategoTerm[] kids = new IStrategoTerm[map.size() + 1];
    int idx = 0;
    for(Entry<String, A_V> entry : map.entrySet())
    { 
      kids[idx] = factory.makeAppl(bindCons, TermUtils.termFromString(entry.getKey(), factory), entry.getValue().toStrategoTerm(factory));
      idx++;
    }
    return factory.makeAppl(factory.makeConstructor("Map", 2), kids);
  }

  public static com.github.krukow.clj_ds.PersistentMap<String, A_V> aterm2map_String_A_V(IStrategoTerm term)
  { 
    final Map<String, A_V> result = new TreeMap<String, A_V>();
    if(Tools.isTermAppl(term))
    { 
      IStrategoAppl appl = (IStrategoAppl)term;
      if(Tools.hasConstructor(appl, "Map", 2))
      { 
        for(int idx = 1; idx < term.getSubtermCount(); idx++)
        { 
          IStrategoTerm kid = term.getSubterm(idx);
          if(Tools.isTermAppl(kid))
          { 
            IStrategoAppl bindAppl = (IStrategoAppl)kid;
            if(Tools.hasConstructor(bindAppl, "Bind", 2))
            { 
              result.put(TermUtils.stringFromTerm(bindAppl.getSubterm(0)), new Generic_A_V(SourceSectionUtil.fromStrategoTerm(bindAppl.getSubterm(1)), bindAppl.getSubterm(1)));
            }
          }
        }
        return PersistentTreeMap.create(result);
      }
    }
    throw new MalformedASTException("Malformed map");
  }
}