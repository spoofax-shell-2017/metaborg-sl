package org.metaborg.lang.sl.interp;

import java.util.concurrent.Callable;

import ds.generated.interpreter.NullV_0;
import ds.generated.interpreter.R_init_V;
import ds.manual.interpreter.Natives;

public class Main {

	public static void main(String[] args) throws Exception {
		String file = args[0];
		SLLanguage language = SLLanguage.INSTANCE;
		Callable<R_init_V> callee = language.getCallable(file);

		R_init_V result = callee.call();
		if (!(result.value instanceof NullV_0))
			System.out.println(Natives.v2s_1(result.value));

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
