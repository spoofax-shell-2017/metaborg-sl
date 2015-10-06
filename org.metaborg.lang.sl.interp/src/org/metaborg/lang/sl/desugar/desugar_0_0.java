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
      IStrategoTerm term12 = term;
      IStrategoConstructor cons0 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success1:
      { 
        if(cons0 == desugar._consProgram_1)
        { 
          Fail4:
          { 
            IStrategoTerm c_4 = null;
            c_4 = term.getSubterm(0);
            term = desugar_funcs_0_0.instance.invoke(context, c_4);
            if(term == null)
              break Fail4;
            term = termFactory.makeAppl(desugar._consProgramDesug_2, new IStrategoTerm[]{term, desugar.constFunCallDesug0});
            if(true)
              break Success1;
          }
          term = term12;
        }
        Success2:
        { 
          if(cons0 == desugar._consFunDef_3)
          { 
            Fail5:
            { 
              IStrategoTerm x_3 = null;
              IStrategoTerm y_3 = null;
              IStrategoTerm z_3 = null;
              x_3 = term.getSubterm(0);
              y_3 = term.getSubterm(1);
              z_3 = term.getSubterm(2);
              term = desugar_params_0_0.instance.invoke(context, y_3);
              if(term == null)
                break Fail5;
              term = termFactory.makeAppl(desugar._consFunDefDesug_3, new IStrategoTerm[]{x_3, term, z_3});
              if(true)
                break Success2;
            }
            term = term12;
          }
          Success3:
          { 
            if(cons0 == desugar._consFunCall_2)
            { 
              Fail6:
              { 
                IStrategoTerm t_3 = null;
                IStrategoTerm u_3 = null;
                t_3 = term.getSubterm(0);
                u_3 = term.getSubterm(1);
                term = desugar_args_0_0.instance.invoke(context, u_3);
                if(term == null)
                  break Fail6;
                term = termFactory.makeAppl(desugar._consFunCallDesug_2, new IStrategoTerm[]{t_3, term});
                if(true)
                  break Success3;
              }
              term = term12;
            }
            Success4:
            { 
              if(cons0 == desugar._consIfNoElse_2)
              { 
                Fail7:
                { 
                  IStrategoTerm r_3 = null;
                  IStrategoTerm s_3 = null;
                  r_3 = term.getSubterm(0);
                  s_3 = term.getSubterm(1);
                  term = termFactory.makeAppl(desugar._consIfThenElse_3, new IStrategoTerm[]{r_3, s_3, desugar.constEmptyBlock0});
                  if(true)
                    break Success4;
                }
                term = term12;
              }
              Success5:
              { 
                if(cons0 == desugar._consMethodCall_3)
                { 
                  Fail8:
                  { 
                    IStrategoTerm m_3 = null;
                    IStrategoTerm n_3 = null;
                    IStrategoTerm o_3 = null;
                    m_3 = term.getSubterm(0);
                    n_3 = term.getSubterm(1);
                    o_3 = term.getSubterm(2);
                    term = desugar_args_0_0.instance.invoke(context, o_3);
                    if(term == null)
                      break Fail8;
                    term = termFactory.makeAppl(desugar._consMethodCallDesug_3, new IStrategoTerm[]{m_3, n_3, term});
                    if(true)
                      break Success5;
                  }
                  term = term12;
                }
                Success6:
                { 
                  if(cons0 == desugar._consFunCallDesug_2)
                  { 
                    Fail9:
                    { 
                      IStrategoTerm l_3 = null;
                      IStrategoTerm arg14 = term.getSubterm(0);
                      if(arg14.getTermType() != IStrategoTerm.STRING || !"defineFunction".equals(((IStrategoString)arg14).stringValue()))
                        break Fail9;
                      IStrategoTerm arg15 = term.getSubterm(1);
                      if(arg15.getTermType() != IStrategoTerm.APPL || desugar._consArgSeq_2 != ((IStrategoAppl)arg15).getConstructor())
                        break Fail9;
                      l_3 = arg15.getSubterm(0);
                      IStrategoTerm arg16 = arg15.getSubterm(1);
                      if(arg16.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg16).getConstructor())
                        break Fail9;
                      term = termFactory.makeAppl(desugar._consSLDefineFunction_1, new IStrategoTerm[]{l_3});
                      if(true)
                        break Success6;
                    }
                    term = term12;
                  }
                  Success7:
                  { 
                    if(cons0 == desugar._consFunCallDesug_2)
                    { 
                      Fail10:
                      { 
                        IStrategoTerm arg17 = term.getSubterm(0);
                        if(arg17.getTermType() != IStrategoTerm.STRING || !"nanoTime".equals(((IStrategoString)arg17).stringValue()))
                          break Fail10;
                        IStrategoTerm arg18 = term.getSubterm(1);
                        if(arg18.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg18).getConstructor())
                          break Fail10;
                        term = desugar.constSLNanoTime0;
                        if(true)
                          break Success7;
                      }
                      term = term12;
                    }
                    Success8:
                    { 
                      if(cons0 == desugar._consFunCallDesug_2)
                      { 
                        Fail11:
                        { 
                          IStrategoTerm arg19 = term.getSubterm(0);
                          if(arg19.getTermType() != IStrategoTerm.STRING || !"new".equals(((IStrategoString)arg19).stringValue()))
                            break Fail11;
                          IStrategoTerm arg20 = term.getSubterm(1);
                          if(arg20.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg20).getConstructor())
                            break Fail11;
                          term = desugar.constSLNewObject0;
                          if(true)
                            break Success8;
                        }
                        term = term12;
                      }
                      Success9:
                      { 
                        if(cons0 == desugar._consFunCallDesug_2)
                        { 
                          Fail12:
                          { 
                            IStrategoTerm k_3 = null;
                            IStrategoTerm arg21 = term.getSubterm(0);
                            if(arg21.getTermType() != IStrategoTerm.STRING || !"println".equals(((IStrategoString)arg21).stringValue()))
                              break Fail12;
                            IStrategoTerm arg22 = term.getSubterm(1);
                            if(arg22.getTermType() != IStrategoTerm.APPL || desugar._consArgSeq_2 != ((IStrategoAppl)arg22).getConstructor())
                              break Fail12;
                            k_3 = arg22.getSubterm(0);
                            IStrategoTerm arg23 = arg22.getSubterm(1);
                            if(arg23.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg23).getConstructor())
                              break Fail12;
                            term = termFactory.makeAppl(desugar._consSLPrintln_1, new IStrategoTerm[]{k_3});
                            if(true)
                              break Success9;
                          }
                          term = term12;
                        }
                        Success10:
                        { 
                          if(cons0 == desugar._consFunCallDesug_2)
                          { 
                            Fail13:
                            { 
                              IStrategoTerm arg24 = term.getSubterm(0);
                              if(arg24.getTermType() != IStrategoTerm.STRING || !"readln".equals(((IStrategoString)arg24).stringValue()))
                                break Fail13;
                              IStrategoTerm arg25 = term.getSubterm(1);
                              if(arg25.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg25).getConstructor())
                                break Fail13;
                              term = desugar.constSLReadln0;
                              if(true)
                                break Success10;
                            }
                            term = term12;
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
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}