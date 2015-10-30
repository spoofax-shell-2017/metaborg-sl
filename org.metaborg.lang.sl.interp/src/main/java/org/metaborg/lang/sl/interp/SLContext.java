package org.metaborg.lang.sl.interp;

import java.io.BufferedReader;
import java.io.PrintWriter;

import com.oracle.truffle.api.ExecutionContext;

public final class SLContext extends ExecutionContext {

	private SLProgram program;
	private BufferedReader inputReader;
	private PrintWriter outputWriter, errorWriter;

	public SLContext(SLLanguage slLanguage, BufferedReader bufferedReader,
			PrintWriter outputWriter, PrintWriter errorWriter) {
		this.inputReader = bufferedReader;
		this.outputWriter = outputWriter;
		this.errorWriter = errorWriter;
	}

	public BufferedReader getInputReader() {
		return inputReader;
	}

	public PrintWriter getOutputWriter() {
		return outputWriter;
	}

	public PrintWriter getErrorWriter() {
		return errorWriter;
	}

	public void setProgram(SLProgram program) {
		this.program = program;
	}

	public SLProgram getProgram() {
		return program;
	}

}
