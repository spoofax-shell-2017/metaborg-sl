package org.metaborg.lang.sl.interp;

import java.io.BufferedReader;
import java.io.PrintWriter;

import com.oracle.truffle.api.ExecutionContext;

public final class SLContext extends ExecutionContext {

	private SLProgram program;

	public SLContext(SLLanguage slLanguage, BufferedReader bufferedReader,
			PrintWriter printWriter) {
	}

	public void setProgram(SLProgram program) {
		this.program = program;
	}

	public SLProgram getProgram() {
		return program;
	}

}
