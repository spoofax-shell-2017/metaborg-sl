package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class x_75 extends Strategy 
{ 
  public static final x_75 instance = new x_75();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail59:
    { 
      IStrategoTerm term1 = term;
      Success11:
      { 
        Fail60:
        { 
          IStrategoTerm term2 = term;
          IStrategoConstructor cons1 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
          Success12:
          { 
            if(cons1 == desugar._consProgram_1)
            { 
              Fail61:
              { 
                IStrategoTerm c_75 = null;
                c_75 = term.getSubterm(0);
                term = this.invoke(context, desugar.constFunCallDesug0);
                if(term == null)
                  break Fail61;
                term = termFactory.makeAppl(desugar._consProgramDesug_2, new IStrategoTerm[]{c_75, term});
                if(true)
                  break Success12;
              }
              term = term2;
            }
            Success13:
            { 
              if(cons1 == desugar._consFunCall_2)
              { 
                Fail62:
                { 
                  IStrategoTerm f_75 = null;
                  IStrategoTerm g_75 = null;
                  IStrategoTerm h_75 = null;
                  f_75 = term.getSubterm(0);
                  g_75 = term.getSubterm(1);
                  term = desugar_args_0_0.instance.invoke(context, g_75);
                  if(term == null)
                    break Fail62;
                  h_75 = term;
                  term = w_75.instance.invoke(context, h_75, this);
                  if(term == null)
                    break Fail62;
                  term = termFactory.makeAppl(desugar._consFunCallDesug_2, new IStrategoTerm[]{f_75, term});
                  term = this.invoke(context, term);
                  if(term == null)
                    break Fail62;
                  if(true)
                    break Success13;
                }
                term = term2;
              }
              Success14:
              { 
                if(cons1 == desugar._consIfNoElse_2)
                { 
                  Fail63:
                  { 
                    IStrategoTerm l_75 = null;
                    IStrategoTerm m_75 = null;
                    l_75 = term.getSubterm(0);
                    m_75 = term.getSubterm(1);
                    term = termFactory.makeAppl(desugar._consIfThenElse_3, new IStrategoTerm[]{l_75, m_75, desugar.constBlock0});
                    if(true)
                      break Success14;
                  }
                  term = term2;
                }
                Success15:
                { 
                  if(cons1 == desugar._consMethodCall_3)
                  { 
                    Fail64:
                    { 
                      IStrategoTerm n_75 = null;
                      IStrategoTerm o_75 = null;
                      IStrategoTerm p_75 = null;
                      IStrategoTerm q_75 = null;
                      n_75 = term.getSubterm(0);
                      o_75 = term.getSubterm(1);
                      p_75 = term.getSubterm(2);
                      term = desugar_args_0_0.instance.invoke(context, p_75);
                      if(term == null)
                        break Fail64;
                      q_75 = term;
                      term = w_75.instance.invoke(context, q_75, this);
                      if(term == null)
                        break Fail64;
                      term = termFactory.makeAppl(desugar._consMethodCallDesug_3, new IStrategoTerm[]{n_75, o_75, term});
                      if(true)
                        break Success15;
                    }
                    term = term2;
                  }
                  Success16:
                  { 
                    if(cons1 == desugar._consFunCallDesug_2)
                    { 
                      Fail65:
                      { 
                        IStrategoTerm u_75 = null;
                        IStrategoTerm arg0 = term.getSubterm(0);
                        if(arg0.getTermType() != IStrategoTerm.STRING || !"defineFunction".equals(((IStrategoString)arg0).stringValue()))
                          break Fail65;
                        IStrategoTerm arg1 = term.getSubterm(1);
                        if(arg1.getTermType() != IStrategoTerm.APPL || desugar._consArgSeq_2 != ((IStrategoAppl)arg1).getConstructor())
                          break Fail65;
                        u_75 = arg1.getSubterm(0);
                        IStrategoTerm arg2 = arg1.getSubterm(1);
                        if(arg2.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg2).getConstructor())
                          break Fail65;
                        term = termFactory.makeAppl(desugar._consSLDefineFunction_1, new IStrategoTerm[]{u_75});
                        if(true)
                          break Success16;
                      }
                      term = term2;
                    }
                    Success17:
                    { 
                      if(cons1 == desugar._consFunCallDesug_2)
                      { 
                        Fail66:
                        { 
                          IStrategoTerm arg3 = term.getSubterm(0);
                          if(arg3.getTermType() != IStrategoTerm.STRING || !"nanoTime".equals(((IStrategoString)arg3).stringValue()))
                            break Fail66;
                          IStrategoTerm arg4 = term.getSubterm(1);
                          if(arg4.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg4).getConstructor())
                            break Fail66;
                          term = desugar.constSLNanoTime0;
                          if(true)
                            break Success17;
                        }
                        term = term2;
                      }
                      Success18:
                      { 
                        if(cons1 == desugar._consFunCallDesug_2)
                        { 
                          Fail67:
                          { 
                            IStrategoTerm arg5 = term.getSubterm(0);
                            if(arg5.getTermType() != IStrategoTerm.STRING || !"new".equals(((IStrategoString)arg5).stringValue()))
                              break Fail67;
                            IStrategoTerm arg6 = term.getSubterm(1);
                            if(arg6.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg6).getConstructor())
                              break Fail67;
                            term = desugar.constSLNewObject0;
                            if(true)
                              break Success18;
                          }
                          term = term2;
                        }
                        Success19:
                        { 
                          if(cons1 == desugar._consFunCallDesug_2)
                          { 
                            Fail68:
                            { 
                              IStrategoTerm v_75 = null;
                              IStrategoTerm arg7 = term.getSubterm(0);
                              if(arg7.getTermType() != IStrategoTerm.STRING || !"println".equals(((IStrategoString)arg7).stringValue()))
                                break Fail68;
                              IStrategoTerm arg8 = term.getSubterm(1);
                              if(arg8.getTermType() != IStrategoTerm.APPL || desugar._consArgSeq_2 != ((IStrategoAppl)arg8).getConstructor())
                                break Fail68;
                              v_75 = arg8.getSubterm(0);
                              IStrategoTerm arg9 = arg8.getSubterm(1);
                              if(arg9.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg9).getConstructor())
                                break Fail68;
                              term = termFactory.makeAppl(desugar._consSLPrintln_1, new IStrategoTerm[]{v_75});
                              if(true)
                                break Success19;
                            }
                            term = term2;
                          }
                          Success20:
                          { 
                            if(cons1 == desugar._consFunCallDesug_2)
                            { 
                              Fail69:
                              { 
                                IStrategoTerm arg10 = term.getSubterm(0);
                                if(arg10.getTermType() != IStrategoTerm.STRING || !"readln".equals(((IStrategoString)arg10).stringValue()))
                                  break Fail69;
                                IStrategoTerm arg11 = term.getSubterm(1);
                                if(arg11.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg11).getConstructor())
                                  break Fail69;
                                term = desugar.constSLReadln0;
                                if(true)
                                  break Success20;
                              }
                              term = term2;
                            }
                            if(cons1 == desugar._consFunCallDesug_2)
                            { 
                              IStrategoTerm arg12 = term.getSubterm(0);
                              if(arg12.getTermType() != IStrategoTerm.STRING || !"stacktrace".equals(((IStrategoString)arg12).stringValue()))
                                break Fail60;
                              IStrategoTerm arg13 = term.getSubterm(1);
                              if(arg13.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg13).getConstructor())
                                break Fail60;
                              term = desugar.constSLStacktrace0;
                            }
                            else
                            { 
                              break Fail60;
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
          if(true)
            break Success11;
        }
        term = term1;
      }
      if(true)
        return term;
    }
    return null;
  }
}