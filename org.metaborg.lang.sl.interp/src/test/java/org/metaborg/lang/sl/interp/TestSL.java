package org.metaborg.lang.sl.interp;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.Callable;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ds.generated.interpreter.R_init_V;

@RunWith(Parameterized.class)
public class TestSL {

	private TestData testData;

	public TestSL(TestData td) {
		this.testData = td;
	}

	@Test
	public void test() throws Exception {
		Callable<R_init_V> invokable = SLLanguage.INSTANCE
				.getCallable("src/test/resources/" + testData.programFile);
		R_init_V res = invokable.call();

	}

	@Parameters(name = "{index}: {0}")
	public static Collection<TestData[]> testTargets() {
		Collection<TestData[]> tests = new LinkedList<>();

		// @formatter:off
		tests.addAll(Arrays.asList(new TestData[][] {
				
				{ new TestData("Add.sl", null, null) },

		}));

		// @formatter:on

		return tests;
	}

	private static class TestData {
		public final String programFile;
		public final String inputFile;
		public final String outputFile;

		public TestData(String programFile, String inputFile, String outputFile) {
			this.programFile = programFile;
			this.inputFile = inputFile;
			this.outputFile = outputFile;
		}
	}
}
