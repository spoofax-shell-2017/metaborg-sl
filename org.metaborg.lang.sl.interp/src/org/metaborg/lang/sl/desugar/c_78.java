package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoConstructor;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
final class c_78 extends Strategy {
	public static final c_78 instance = new c_78();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		ITermFactory termFactory = context.getFactory();
		Fail69: {
			IStrategoTerm term0 = term;
			Success12: {
				Fail70: {
					IStrategoTerm term1 = term;
					IStrategoConstructor cons1 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl) term)
							.getConstructor() : null;
					Success13: {
						if (cons1 == desugar._consProgram_1) {
							Fail71: {
								IStrategoTerm y_76 = null;
								IStrategoTerm z_76 = null;
								IStrategoTerm b_77 = null;
								y_76 = term.getSubterm(0);
								term = desugar_funcs_0_0.instance.invoke(
										context, y_76);
								if (term == null)
									break Fail71;
								z_76 = term;
								term = b_78.instance
										.invoke(context, z_76, this);
								if (term == null)
									break Fail71;
								b_77 = term;
								term = this.invoke(context,
										desugar.constFunCallDesug0);
								if (term == null)
									break Fail71;
								term = termFactory
										.makeAppl(
												desugar._consProgramDesug_2,
												new IStrategoTerm[] {
														b_77,
														termFactory
																.makeAppl(
																		desugar._consStmt_1,
																		new IStrategoTerm[] { term }) });
								if (true)
									break Success13;
							}
							term = term1;
						}
						Success14: {
							if (cons1 == desugar._consFunDef_3) {
								Fail72: {
									IStrategoTerm f_77 = null;
									IStrategoTerm g_77 = null;
									IStrategoTerm h_77 = null;
									IStrategoTerm i_77 = null;
									f_77 = term.getSubterm(0);
									g_77 = term.getSubterm(1);
									h_77 = term.getSubterm(2);
									term = desugar_params_0_0.instance.invoke(
											context, g_77);
									if (term == null)
										break Fail72;
									i_77 = term;
									term = b_78.instance.invoke(context, i_77,
											this);
									if (term == null)
										break Fail72;
									term = termFactory.makeAppl(
											desugar._consFunDefDesug_3,
											new IStrategoTerm[] { f_77, term,
													h_77 });
									if (true)
										break Success14;
								}
								term = term1;
							}
							Success15: {
								if (cons1 == desugar._consFunCall_2) {
									Fail73: {
										IStrategoTerm m_77 = null;
										IStrategoTerm n_77 = null;
										IStrategoTerm o_77 = null;
										m_77 = term.getSubterm(0);
										n_77 = term.getSubterm(1);
										term = desugar_args_0_0.instance
												.invoke(context, n_77);
										if (term == null)
											break Fail73;
										o_77 = term;
										term = b_78.instance.invoke(context,
												o_77, this);
										if (term == null)
											break Fail73;
										term = termFactory.makeAppl(
												desugar._consFunCallDesug_2,
												new IStrategoTerm[] { m_77,
														term });
										term = this.invoke(context, term);
										if (term == null)
											break Fail73;
										if (true)
											break Success15;
									}
									term = term1;
								}
								Success16: {
									if (cons1 == desugar._consMethodCall_3) {
										Fail74: {
											IStrategoTerm s_77 = null;
											IStrategoTerm t_77 = null;
											IStrategoTerm u_77 = null;
											IStrategoTerm v_77 = null;
											s_77 = term.getSubterm(0);
											t_77 = term.getSubterm(1);
											u_77 = term.getSubterm(2);
											term = desugar_args_0_0.instance
													.invoke(context, u_77);
											if (term == null)
												break Fail74;
											v_77 = term;
											term = b_78.instance.invoke(
													context, v_77, this);
											if (term == null)
												break Fail74;
											term = termFactory
													.makeAppl(
															desugar._consMethodCallDesug_3,
															new IStrategoTerm[] {
																	s_77, t_77,
																	term });
											if (true)
												break Success16;
										}
										term = term1;
									}
									Success17: {
										if (cons1 == desugar._consFunCallDesug_2) {
											Fail75: {
												IStrategoTerm z_77 = null;
												IStrategoTerm arg0 = term
														.getSubterm(0);
												if (arg0.getTermType() != IStrategoTerm.STRING
														|| !"defineFunction"
																.equals(((IStrategoString) arg0)
																		.stringValue()))
													break Fail75;
												IStrategoTerm arg1 = term
														.getSubterm(1);
												if (arg1.getTermType() != IStrategoTerm.APPL
														|| desugar._consArgSeq_2 != ((IStrategoAppl) arg1)
																.getConstructor())
													break Fail75;
												z_77 = arg1.getSubterm(0);
												IStrategoTerm arg2 = arg1
														.getSubterm(1);
												if (arg2.getTermType() != IStrategoTerm.APPL
														|| desugar._consNoArgSeq_0 != ((IStrategoAppl) arg2)
																.getConstructor())
													break Fail75;
												term = termFactory
														.makeAppl(
																desugar._consSLDefineFunction_1,
																new IStrategoTerm[] { z_77 });
												if (true)
													break Success17;
											}
											term = term1;
										}
										Success18: {
											if (cons1 == desugar._consFunCallDesug_2) {
												Fail76: {
													IStrategoTerm arg3 = term
															.getSubterm(0);
													if (arg3.getTermType() != IStrategoTerm.STRING
															|| !"nanoTime"
																	.equals(((IStrategoString) arg3)
																			.stringValue()))
														break Fail76;
													IStrategoTerm arg4 = term
															.getSubterm(1);
													if (arg4.getTermType() != IStrategoTerm.APPL
															|| desugar._consNoArgSeq_0 != ((IStrategoAppl) arg4)
																	.getConstructor())
														break Fail76;
													term = desugar.constSLNanoTime0;
													if (true)
														break Success18;
												}
												term = term1;
											}
											Success19: {
												if (cons1 == desugar._consFunCallDesug_2) {
													Fail77: {
														IStrategoTerm arg5 = term
																.getSubterm(0);
														if (arg5.getTermType() != IStrategoTerm.STRING
																|| !"new"
																		.equals(((IStrategoString) arg5)
																				.stringValue()))
															break Fail77;
														IStrategoTerm arg6 = term
																.getSubterm(1);
														if (arg6.getTermType() != IStrategoTerm.APPL
																|| desugar._consNoArgSeq_0 != ((IStrategoAppl) arg6)
																		.getConstructor())
															break Fail77;
														term = desugar.constSLNewObject0;
														if (true)
															break Success19;
													}
													term = term1;
												}
												Success20: {
													if (cons1 == desugar._consFunCallDesug_2) {
														Fail78: {
															IStrategoTerm a_78 = null;
															IStrategoTerm arg7 = term
																	.getSubterm(0);
															if (arg7.getTermType() != IStrategoTerm.STRING
																	|| !"println"
																			.equals(((IStrategoString) arg7)
																					.stringValue()))
																break Fail78;
															IStrategoTerm arg8 = term
																	.getSubterm(1);
															if (arg8.getTermType() != IStrategoTerm.APPL
																	|| desugar._consArgSeq_2 != ((IStrategoAppl) arg8)
																			.getConstructor())
																break Fail78;
															a_78 = arg8
																	.getSubterm(0);
															IStrategoTerm arg9 = arg8
																	.getSubterm(1);
															if (arg9.getTermType() != IStrategoTerm.APPL
																	|| desugar._consNoArgSeq_0 != ((IStrategoAppl) arg9)
																			.getConstructor())
																break Fail78;
															term = termFactory
																	.makeAppl(
																			desugar._consSLPrintln_1,
																			new IStrategoTerm[] { a_78 });
															if (true)
																break Success20;
														}
														term = term1;
													}
													Success21: {
														if (cons1 == desugar._consFunCallDesug_2) {
															Fail79: {
																IStrategoTerm arg10 = term
																		.getSubterm(0);
																if (arg10
																		.getTermType() != IStrategoTerm.STRING
																		|| !"readln"
																				.equals(((IStrategoString) arg10)
																						.stringValue()))
																	break Fail79;
																IStrategoTerm arg11 = term
																		.getSubterm(1);
																if (arg11
																		.getTermType() != IStrategoTerm.APPL
																		|| desugar._consNoArgSeq_0 != ((IStrategoAppl) arg11)
																				.getConstructor())
																	break Fail79;
																term = desugar.constSLReadln0;
																if (true)
																	break Success21;
															}
															term = term1;
														}
														if (cons1 == desugar._consFunCallDesug_2) {
															IStrategoTerm arg12 = term
																	.getSubterm(0);
															if (arg12
																	.getTermType() != IStrategoTerm.STRING
																	|| !"stacktrace"
																			.equals(((IStrategoString) arg12)
																					.stringValue()))
																break Fail70;
															IStrategoTerm arg13 = term
																	.getSubterm(1);
															if (arg13
																	.getTermType() != IStrategoTerm.APPL
																	|| desugar._consNoArgSeq_0 != ((IStrategoAppl) arg13)
																			.getConstructor())
																break Fail70;
															term = desugar.constSLStacktrace0;
														} else {
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
					if (true)
						break Success12;
				}
				term = term0;
			}
			if (true)
				return term;
		}
		return null;
	}
}