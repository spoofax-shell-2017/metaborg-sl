package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class w_78 extends Strategy 
{ 
  public static final w_78 instance = new w_78();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail71:
    { 
      IStrategoTerm term1 = term;
      Success14:
      { 
        Fail72:
        { 
          IStrategoTerm term2 = term;
          IStrategoConstructor cons1 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
          Success15:
          { 
            if(cons1 == desugar._consProgram_1)
            { 
              Fail73:
              { 
                IStrategoTerm q_77 = null;
                IStrategoTerm r_77 = null;
                IStrategoTerm t_77 = null;
                q_77 = term.getSubterm(0);
                term = desugar_funcs_0_0.instance.invoke(context, q_77);
                if(term == null)
                  break Fail73;
                r_77 = term;
                term = v_78.instance.invoke(context, r_77, this);
                if(term == null)
                  break Fail73;
                t_77 = term;
                term = this.invoke(context, desugar.constFunCallDesug0);
                if(term == null)
                  break Fail73;
                term = termFactory.makeAppl(desugar._consProgramDesug_2, new IStrategoTerm[]{t_77, term});
                if(true)
                  break Success15;
              }
              term = term2;
            }
            Success16:
            { 
              if(cons1 == desugar._consFunDef_3)
              { 
                Fail74:
                { 
                  IStrategoTerm x_77 = null;
                  IStrategoTerm y_77 = null;
                  IStrategoTerm z_77 = null;
                  IStrategoTerm a_78 = null;
                  x_77 = term.getSubterm(0);
                  y_77 = term.getSubterm(1);
                  z_77 = term.getSubterm(2);
                  term = desugar_params_0_0.instance.invoke(context, y_77);
                  if(term == null)
                    break Fail74;
                  a_78 = term;
                  term = v_78.instance.invoke(context, a_78, this);
                  if(term == null)
                    break Fail74;
                  term = termFactory.makeAppl(desugar._consFunDefDesug_3, new IStrategoTerm[]{x_77, term, z_77});
                  if(true)
                    break Success16;
                }
                term = term2;
              }
              Success17:
              { 
                if(cons1 == desugar._consFunCall_2)
                { 
                  Fail75:
                  { 
                    IStrategoTerm e_78 = null;
                    IStrategoTerm f_78 = null;
                    IStrategoTerm g_78 = null;
                    e_78 = term.getSubterm(0);
                    f_78 = term.getSubterm(1);
                    term = desugar_args_0_0.instance.invoke(context, f_78);
                    if(term == null)
                      break Fail75;
                    g_78 = term;
                    term = v_78.instance.invoke(context, g_78, this);
                    if(term == null)
                      break Fail75;
                    term = termFactory.makeAppl(desugar._consFunCallDesug_2, new IStrategoTerm[]{e_78, term});
                    term = this.invoke(context, term);
                    if(term == null)
                      break Fail75;
                    if(true)
                      break Success17;
                  }
                  term = term2;
                }
                Success18:
                { 
                  if(cons1 == desugar._consIfNoElse_2)
                  { 
                    Fail76:
                    { 
                      IStrategoTerm k_78 = null;
                      IStrategoTerm l_78 = null;
                      k_78 = term.getSubterm(0);
                      l_78 = term.getSubterm(1);
                      term = termFactory.makeAppl(desugar._consIfThenElse_3, new IStrategoTerm[]{k_78, l_78, desugar.constEmptyBlock0});
                      if(true)
                        break Success18;
                    }
                    term = term2;
                  }
                  Success19:
                  { 
                    if(cons1 == desugar._consMethodCall_3)
                    { 
                      Fail77:
                      { 
                        IStrategoTerm m_78 = null;
                        IStrategoTerm n_78 = null;
                        IStrategoTerm o_78 = null;
                        IStrategoTerm p_78 = null;
                        m_78 = term.getSubterm(0);
                        n_78 = term.getSubterm(1);
                        o_78 = term.getSubterm(2);
                        term = desugar_args_0_0.instance.invoke(context, o_78);
                        if(term == null)
                          break Fail77;
                        p_78 = term;
                        term = v_78.instance.invoke(context, p_78, this);
                        if(term == null)
                          break Fail77;
                        term = termFactory.makeAppl(desugar._consMethodCallDesug_3, new IStrategoTerm[]{m_78, n_78, term});
                        if(true)
                          break Success19;
                      }
                      term = term2;
                    }
                    Success20:
                    { 
                      if(cons1 == desugar._consFunCallDesug_2)
                      { 
                        Fail78:
                        { 
                          IStrategoTerm t_78 = null;
                          IStrategoTerm arg0 = term.getSubterm(0);
                          if(arg0.getTermType() != IStrategoTerm.STRING || !"defineFunction".equals(((IStrategoString)arg0).stringValue()))
                            break Fail78;
                          IStrategoTerm arg1 = term.getSubterm(1);
                          if(arg1.getTermType() != IStrategoTerm.APPL || desugar._consArgSeq_2 != ((IStrategoAppl)arg1).getConstructor())
                            break Fail78;
                          t_78 = arg1.getSubterm(0);
                          IStrategoTerm arg2 = arg1.getSubterm(1);
                          if(arg2.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg2).getConstructor())
                            break Fail78;
                          term = termFactory.makeAppl(desugar._consSLDefineFunction_1, new IStrategoTerm[]{t_78});
                          if(true)
                            break Success20;
                        }
                        term = term2;
                      }
                      Success21:
                      { 
                        if(cons1 == desugar._consFunCallDesug_2)
                        { 
                          Fail79:
                          { 
                            IStrategoTerm arg3 = term.getSubterm(0);
                            if(arg3.getTermType() != IStrategoTerm.STRING || !"nanoTime".equals(((IStrategoString)arg3).stringValue()))
                              break Fail79;
                            IStrategoTerm arg4 = term.getSubterm(1);
                            if(arg4.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg4).getConstructor())
                              break Fail79;
                            term = desugar.constSLNanoTime0;
                            if(true)
                              break Success21;
                          }
                          term = term2;
                        }
                        Success22:
                        { 
                          if(cons1 == desugar._consFunCallDesug_2)
                          { 
                            Fail80:
                            { 
                              IStrategoTerm arg5 = term.getSubterm(0);
                              if(arg5.getTermType() != IStrategoTerm.STRING || !"new".equals(((IStrategoString)arg5).stringValue()))
                                break Fail80;
                              IStrategoTerm arg6 = term.getSubterm(1);
                              if(arg6.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg6).getConstructor())
                                break Fail80;
                              term = desugar.constSLNewObject0;
                              if(true)
                                break Success22;
                            }
                            term = term2;
                          }
                          Success23:
                          { 
                            if(cons1 == desugar._consFunCallDesug_2)
                            { 
                              Fail81:
                              { 
                                IStrategoTerm u_78 = null;
                                IStrategoTerm arg7 = term.getSubterm(0);
                                if(arg7.getTermType() != IStrategoTerm.STRING || !"println".equals(((IStrategoString)arg7).stringValue()))
                                  break Fail81;
                                IStrategoTerm arg8 = term.getSubterm(1);
                                if(arg8.getTermType() != IStrategoTerm.APPL || desugar._consArgSeq_2 != ((IStrategoAppl)arg8).getConstructor())
                                  break Fail81;
                                u_78 = arg8.getSubterm(0);
                                IStrategoTerm arg9 = arg8.getSubterm(1);
                                if(arg9.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg9).getConstructor())
                                  break Fail81;
                                term = termFactory.makeAppl(desugar._consSLPrintln_1, new IStrategoTerm[]{u_78});
                                if(true)
                                  break Success23;
                              }
                              term = term2;
                            }
                            Success24:
                            { 
                              if(cons1 == desugar._consFunCallDesug_2)
                              { 
                                Fail82:
                                { 
                                  IStrategoTerm arg10 = term.getSubterm(0);
                                  if(arg10.getTermType() != IStrategoTerm.STRING || !"readln".equals(((IStrategoString)arg10).stringValue()))
                                    break Fail82;
                                  IStrategoTerm arg11 = term.getSubterm(1);
                                  if(arg11.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg11).getConstructor())
                                    break Fail82;
                                  term = desugar.constSLReadln0;
                                  if(true)
                                    break Success24;
                                }
                                term = term2;
                              }
                              if(cons1 == desugar._consFunCallDesug_2)
                              { 
                                IStrategoTerm arg12 = term.getSubterm(0);
                                if(arg12.getTermType() != IStrategoTerm.STRING || !"stacktrace".equals(((IStrategoString)arg12).stringValue()))
                                  break Fail72;
                                IStrategoTerm arg13 = term.getSubterm(1);
                                if(arg13.getTermType() != IStrategoTerm.APPL || desugar._consNoArgSeq_0 != ((IStrategoAppl)arg13).getConstructor())
                                  break Fail72;
                                term = desugar.constSLStacktrace0;
                              }
                              else
                              { 
                                break Fail72;
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
            break Success14;
        }
        term = term1;
      }
      if(true)
        return term;
    }
    return null;
  }
}