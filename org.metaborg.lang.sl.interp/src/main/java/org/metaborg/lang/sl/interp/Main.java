package org.metaborg.lang.sl.interp;

import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.concurrent.Callable;

import org.metaborg.tools.serfer.Benchmark;
import org.metaborg.tools.serfer.BenchmarkConfiguration;

import ds.generated.interpreter.R_init_V;

public class Main {

	public static void main(String[] args) throws Exception {
		String file = args[0];
		SLLanguage language = SLLanguage.INSTANCE;

		Callable<R_init_V> callee = language.getCallable(file,
				new InputStreamReader(System.in), new OutputStreamWriter(
						System.out), new OutputStreamWriter(System.err));

		// R_init_V result = callee.call();
		// if (!(result.value instanceof NullV_0))
		// System.out.println(Natives.v2s_1(result.value));

		BenchmarkConfiguration benchconfig = new BenchmarkConfiguration();
		benchconfig.warmuprounds = 1;
		benchconfig.repetitions = 65;
		benchconfig.dataFile = new File(args[1]);

		Benchmark benchmark = new Benchmark(callee, benchconfig);
		benchmark.execute();

		benchmark.writeToFile();
	}

}
