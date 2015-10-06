package org.metaborg.lang.sl.interp;

import java.util.concurrent.Callable;

import ds.generated.interpreter.R_init_U;

public class Main {

	public static void main(String[] args) throws Exception {
		String file = args[0];
		SLLanguage language = SLLanguage.INSTANCE;
		Callable<R_init_U> callee = language.getCallable(file);

		callee.call();
		// BenchmarkConfiguration benchconfig = new BenchmarkConfiguration();
		// benchconfig.warmuprounds = 100;
		// benchconfig.repetitions = 100;
		// benchconfig.dataFile = new File("data.csv");
		//
		// Benchmark benchmark = new Benchmark(callee, benchconfig);
		// benchmark.execute();
		//
		// benchmark.writeToFile();
	}

}
