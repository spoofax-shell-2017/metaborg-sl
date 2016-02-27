package org.metaborg.lang.sl.interpreter.natives;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.metaborg.meta.lang.dynsem.interpreter.DynSemContext;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class readln_0 extends TermBuild {

	public readln_0(SourceSection source) {
		super(source);
	}

	@Override
	public Object executeGeneric(VirtualFrame frame) {
		return executeString(frame);
	}

	@Override
	public String executeString(VirtualFrame frame) {
		DynSemContext ctx = getContext();
		try {
			return new BufferedReader(new InputStreamReader(ctx.getInput()))
					.readLine();
		} catch (IOException e) {
			throw new IllegalStateException("Failed to read input stream", e);
		}
	}

	public static TermBuild create(SourceSection source) {
		return new readln_0(source);
	}
}
