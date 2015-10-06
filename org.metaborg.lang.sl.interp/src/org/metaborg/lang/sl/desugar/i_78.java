package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class i_78 extends Strategy 
{ 
  public static final i_78 instance = new i_78();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail69:
    { 
      IStrategoTerm term0 = term;
      Success13:
      { 
        Fail70:
        { 
          IStrategoTerm term1 = term;
          IStrategoConstructor cons1 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
          Success14:
          { 
            if(cons1 == desugar._consProgram_1)
            { 
              Fail71:
              { 
                IStrategoTerm c_77 = null;
                IStrategoTerm d_77 = null;
                IStrategoTerm f_77 = null;
                c_77 = term.getSubterm(0);
                term = desugar_funcs_0_0.instance.invoke(context, c_77);
                if(term == null)
                  break Fail71;
                d_77 = term;
                term = h_78.instance.invoke(context, d_77, this);
                if(term == null)
                  break Fail71;
                f_77 = term;
                term = this.invoke(context, desugar.constFunCallDesug0);
                if(term == null)
                  break Fail71;
                term = termFactory.makeAppl(desugar._consProgramDesug_2, new IStrategoTerm[]{f_77, termFactory.makeAppl(desugar._consStmt_1, new IStrategoTerm[]{term})});
                if(true)
                  break Success14;
              }
              term = term1;
            }
            Success15:
            { 
              if(cons1 == desugar._consFunDef_3)
              { 
                Fail72:
                { 
                  IStrategoTerm j_77 = null;
                  IStrategoTerm k_77 = null;
                  IStrategoTerm l_77 = null;
                  IStrategoTerm m_77 = null;
                  j_77 = term.getSubterm(0);
                  k_77 = term.getSubterm(1);
                  l_77 = term.getSubterm(2);
                  term = desugar_params_0_0.instance.invoke(context, k_77);
                  if(term == null)
                    break Fail72;
                  m_77 = term;
                  term = h_78.instance.invoke(context, m_77, this);
                  if(term == null)
                    break Fail72;
                  term = termFactory.makeAppl(desugar._consFunDefDesug_3, new IStrategoTerm[]{j_77, term, l_77});
                  if(true)
                    break Success15;
                }
                term = term1;
              }
              Success16:
              { 
                if(cons1 == desugar._consFunCall_2)
                { 
                  Fail73:
                  { 
                    IStrategoTerm q_77 = null;
                    IStrategoTerm r_77 = null;
                    IStrategoTerm s_77 = null;
                    q_77 = term.getSubterm(0);
                    r_77 = term.getSubterm(1);
                    term = desugar_args_0_0.instance.invoke(context, r_77);
                    if(term == null)
                      break Fail73;
                    s_77 = term;
                    term = h_78.instance.invoke(context, s_77, this);
                    if(term == null)
                      break Fail73;
                    term = termFactory.makeAppl(desugar._consFunCallDesug_2, new IStrategoTerm[]{q_77, term});
                    term = this.invoke(context, term);
                    if(term == null)
                      break Fail73;
                    if(true)
                      break Success16;
                  }
                  term = term1;
                }
                Success17:
                { 
                  if(cons1 == desugar._consIfNoElse_2)
                  { 
                    Fail74:
                    { 
                      IStrategoTerm w_77 = null;
                      IStrategoTerm x_77 = null;
                      w_77 = term.getSubterm(0);
                      x_77 = term.getSubterm(1);
                      term = termFactory.makeAppl(desugar._consIfThenElse_3, new IStrategoTerm[]{w_77, x_77, desugar.constEmptyBlock0});
                      if(true)
                        break Success17;
                    }
                    term = term1;
                  }
                  Success18:
                  { 
                    if(cons1 == desugar._consMethodCall_3)
                    { 
                      Fail75:
                      { 
                        IStrategoTerm y_77 = null;
                        IStrategoTerm z_77 = null;
                        IStrategoTerm a_78 = null;
                        IStrategoTerm b_78 = null;
                        y_77 = term.getSubterm(0);
                        z_77 = term.getSubterm(1);
                        a_78 = term.getSubterm(2);
                        term = desugar_args_0_0.instance.invoke(context, a_78);
                        if(term == null)
                          break Fail75;
                        b_78 = term;
                        term = h_78.instance.invoke(context, b_78, this);
                        if(term == null)
                          break Fail75;
                        term = termFactory.makeAppl(desugar._consMethodCallDesug_3, new IStrategoTerm[]{y_77, z_77, term});
                        if(true)
                          break Success18;
                      }
                      term = term1;
                    }
                    Success19:
                    { 
                      if(cons1 == desugar._consFunCallDesug_2)
                      { 
                        Fail76:
                        { 
                          IStrategoTerm f_78 = null;
                          IStrategoTerm arg0 = term.getSubterm(0);
                          if(arg0.getTermType() != IStrategoTerm.STRING || !"defineFunction".equals(((IStrategoString)arg0).stringValue()))
                            break Fail76;
                          IStrategoTerm arg1 = term.getSubterm(1);
                          if(arg1.getTermType() != IStrategoTerm.APPL || desugar._consArgSeq_2 != ((IStrategoAppl)arg1).getConstructor())
                            break Fail76;
                          f_78 = arg1.getSubterm(0);
                          IStrategoTerm arg2 = arg1.getSubterm(1);
                          if(arg2.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg2).getConstructor())
                            break Fail76;
                          term = termFactory.makeAppl(desugar._consSLDefineFunction_1, new IStrategoTerm[]{f_78});
                          if(true)
                            break Success19;
                        }
                        term = term1;
                      }
                      Success20:
                      { 
                        if(cons1 == desugar._consFunCallDesug_2)
                        { 
                          Fail77:
                          { 
                            IStrategoTerm arg3 = term.getSubterm(0);
                            if(arg3.getTermType() != IStrategoTerm.STRING || !"nanoTime".equals(((IStrategoString)arg3).stringValue()))
                              break Fail77;
                            IStrategoTerm arg4 = term.getSubterm(1);
                            if(arg4.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg4).getConstructor())
                              break Fail77;
                            term = desugar.constSLNanoTime0;
                            if(true)
                              break Success20;
                          }
                          term = term1;
                        }
                        Success21:
                        { 
                          if(cons1 == desugar._consFunCallDesug_2)
                          { 
                            Fail78:
                            { 
                              IStrategoTerm arg5 = term.getSubterm(0);
                              if(arg5.getTermType() != IStrategoTerm.STRING || !"new".equals(((IStrategoString)arg5).stringValue()))
                                break Fail78;
                              IStrategoTerm arg6 = term.getSubterm(1);
                              if(arg6.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg6).getConstructor())
                                break Fail78;
                              term = desugar.constSLNewObject0;
                              if(true)
                                break Success21;
                            }
                            term = term1;
                          }
                          Success22:
                          { 
                            if(cons1 == desugar._consFunCallDesug_2)
                            { 
                              Fail79:
                              { 
                                IStrategoTerm g_78 = null;
                                IStrategoTerm arg7 = term.getSubterm(0);
                                if(arg7.getTermType() != IStrategoTerm.STRING || !"println".equals(((IStrategoString)arg7).stringValue()))
                                  break Fail79;
                                IStrategoTerm arg8 = term.getSubterm(1);
                                if(arg8.getTermType() != IStrategoTerm.APPL || desugar._consArgSeq_2 != ((IStrategoAppl)arg8).getConstructor())
                                  break Fail79;
                                g_78 = arg8.getSubterm(0);
                                IStrategoTerm arg9 = arg8.getSubterm(1);
                                if(arg9.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg9).getConstructor())
                                  break Fail79;
                                term = termFactory.makeAppl(desugar._consSLPrintln_1, new IStrategoTerm[]{g_78});
                                if(true)
                                  break Success22;
                              }
                              term = term1;
                            }
                            Success23:
                            { 
                              if(cons1 == desugar._consFunCallDesug_2)
                              { 
                                Fail80:
                                { 
                                  IStrategoTerm arg10 = term.getSubterm(0);
                                  if(arg10.getTermType() != IStrategoTerm.STRING || !"readln".equals(((IStrategoString)arg10).stringValue()))
                                    break Fail80;
                                  IStrategoTerm arg11 = term.getSubterm(1);
                                  if(arg11.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg11).getConstructor())
                                    break Fail80;
                                  term = desugar.constSLReadln0;
                                  if(true)
                                    break Success23;
                                }
                                term = term1;
                              }
                              if(cons1 == desugar._consFunCallDesug_2)
                              { 
                                IStrategoTerm arg12 = term.getSubterm(0);
                                if(arg12.getTermType() != IStrategoTerm.STRING || !"stacktrace".equals(((IStrategoString)arg12).stringValue()))
                                  break Fail70;
                                IStrategoTerm arg13 = term.getSubterm(1);
                                if(arg13.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg13).getConstructor())
                                  break Fail70;
                                term = desugar.constSLStacktrace0;
                              }
                              else
                              { 
                                break Fail70;
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
          if(true)
            break Success13;
        }
        term = term0;
      }
      if(true)
        return term;
    }
    return null;
  }
}