package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class desugar_0_0 extends Strategy 
{ 
  public static desugar_0_0 instance = new desugar_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("desugar_0_0");
    Fail3:
    { 
      IStrategoTerm term11 = term;
      IStrategoConstructor cons0 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success1:
      { 
        if(cons0 == desugar._consProgram_1)
        { 
          Fail4:
          { 
            IStrategoTerm o_3 = null;
            o_3 = term.getSubterm(0);
            term = termFactory.makeAppl(desugar._consProgramDesug_2, new IStrategoTerm[]{o_3, desugar.constFunCallDesug0});
            if(true)
              break Success1;
          }
          term = term11;
        }
        Success2:
        { 
          if(cons0 == desugar._consFunCall_2)
          { 
            Fail5:
            { 
              IStrategoTerm k_3 = null;
              IStrategoTerm l_3 = null;
              k_3 = term.getSubterm(0);
              l_3 = term.getSubterm(1);
              term = desugar_args_0_0.instance.invoke(context, l_3);
              if(term == null)
                break Fail5;
              term = termFactory.makeAppl(desugar._consFunCallDesug_2, new IStrategoTerm[]{k_3, term});
              if(true)
                break Success2;
            }
            term = term11;
          }
          Success3:
          { 
            if(cons0 == desugar._consIfNoElse_2)
            { 
              Fail6:
              { 
                IStrategoTerm i_3 = null;
                IStrategoTerm j_3 = null;
                i_3 = term.getSubterm(0);
                j_3 = term.getSubterm(1);
                term = termFactory.makeAppl(desugar._consIfThenElse_3, new IStrategoTerm[]{i_3, j_3, desugar.constBlock0});
                if(true)
                  break Success3;
              }
              term = term11;
            }
            Success4:
            { 
              if(cons0 == desugar._consMethodCall_3)
              { 
                Fail7:
                { 
                  IStrategoTerm d_3 = null;
                  IStrategoTerm e_3 = null;
                  IStrategoTerm f_3 = null;
                  d_3 = term.getSubterm(0);
                  e_3 = term.getSubterm(1);
                  f_3 = term.getSubterm(2);
                  term = desugar_args_0_0.instance.invoke(context, f_3);
                  if(term == null)
                    break Fail7;
                  term = termFactory.makeAppl(desugar._consMethodCallDesug_3, new IStrategoTerm[]{d_3, e_3, term});
                  if(true)
                    break Success4;
                }
                term = term11;
              }
              Success5:
              { 
                if(cons0 == desugar._consFunCallDesug_2)
                { 
                  Fail8:
                  { 
                    IStrategoTerm c_3 = null;
                    IStrategoTerm arg14 = term.getSubterm(0);
                    if(arg14.getTermType() != IStrategoTerm.STRING || !"defineFunction".equals(((IStrategoString)arg14).stringValue()))
                      break Fail8;
                    IStrategoTerm arg15 = term.getSubterm(1);
                    if(arg15.getTermType() != IStrategoTerm.APPL || desugar._consArgSeq_2 != ((IStrategoAppl)arg15).getConstructor())
                      break Fail8;
                    c_3 = arg15.getSubterm(0);
                    IStrategoTerm arg16 = arg15.getSubterm(1);
                    if(arg16.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg16).getConstructor())
                      break Fail8;
                    term = termFactory.makeAppl(desugar._consSLDefineFunction_1, new IStrategoTerm[]{c_3});
                    if(true)
                      break Success5;
                  }
                  term = term11;
                }
                Success6:
                { 
                  if(cons0 == desugar._consFunCallDesug_2)
                  { 
                    Fail9:
                    { 
                      IStrategoTerm arg17 = term.getSubterm(0);
                      if(arg17.getTermType() != IStrategoTerm.STRING || !"nanoTime".equals(((IStrategoString)arg17).stringValue()))
                        break Fail9;
                      IStrategoTerm arg18 = term.getSubterm(1);
                      if(arg18.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg18).getConstructor())
                        break Fail9;
                      term = desugar.constSLNanoTime0;
                      if(true)
                        break Success6;
                    }
                    term = term11;
                  }
                  Success7:
                  { 
                    if(cons0 == desugar._consFunCallDesug_2)
                    { 
                      Fail10:
                      { 
                        IStrategoTerm arg19 = term.getSubterm(0);
                        if(arg19.getTermType() != IStrategoTerm.STRING || !"new".equals(((IStrategoString)arg19).stringValue()))
                          break Fail10;
                        IStrategoTerm arg20 = term.getSubterm(1);
                        if(arg20.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg20).getConstructor())
                          break Fail10;
                        term = desugar.constSLNewObject0;
                        if(true)
                          break Success7;
                      }
                      term = term11;
                    }
                    Success8:
                    { 
                      if(cons0 == desugar._consFunCallDesug_2)
                      { 
                        Fail11:
                        { 
                          IStrategoTerm b_3 = null;
                          IStrategoTerm arg21 = term.getSubterm(0);
                          if(arg21.getTermType() != IStrategoTerm.STRING || !"println".equals(((IStrategoString)arg21).stringValue()))
                            break Fail11;
                          IStrategoTerm arg22 = term.getSubterm(1);
                          if(arg22.getTermType() != IStrategoTerm.APPL || desugar._consArgSeq_2 != ((IStrategoAppl)arg22).getConstructor())
                            break Fail11;
                          b_3 = arg22.getSubterm(0);
                          IStrategoTerm arg23 = arg22.getSubterm(1);
                          if(arg23.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg23).getConstructor())
                            break Fail11;
                          term = termFactory.makeAppl(desugar._consSLPrintln_1, new IStrategoTerm[]{b_3});
                          if(true)
                            break Success8;
                        }
                        term = term11;
                      }
                      Success9:
                      { 
                        if(cons0 == desugar._consFunCallDesug_2)
                        { 
                          Fail12:
                          { 
                            IStrategoTerm arg24 = term.getSubterm(0);
                            if(arg24.getTermType() != IStrategoTerm.STRING || !"readln".equals(((IStrategoString)arg24).stringValue()))
                              break Fail12;
                            IStrategoTerm arg25 = term.getSubterm(1);
                            if(arg25.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg25).getConstructor())
                              break Fail12;
                            term = desugar.constSLReadln0;
                            if(true)
                              break Success9;
                          }
                          term = term11;
                        }
                        if(cons0 == desugar._consFunCallDesug_2)
                        { 
                          IStrategoTerm arg26 = term.getSubterm(0);
                          if(arg26.getTermType() != IStrategoTerm.STRING || !"stacktrace".equals(((IStrategoString)arg26).stringValue()))
                            break Fail3;
                          IStrategoTerm arg27 = term.getSubterm(1);
                          if(arg27.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg27).getConstructor())
                            break Fail3;
                          term = desugar.constSLStacktrace0;
                        }
                        else
                        { 
                          break Fail3;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}