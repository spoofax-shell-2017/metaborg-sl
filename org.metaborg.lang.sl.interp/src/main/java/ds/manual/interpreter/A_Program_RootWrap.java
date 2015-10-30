package ds.manual.interpreter;

import org.metaborg.lang.sl.interp.SLLanguage;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.RootNode;

import ds.generated.interpreter.A_Program;

public class A_Program_RootWrap extends RootNode {

	@Child private A_Program program;

	public A_Program_RootWrap(A_Program program, FrameDescriptor descriptor) {
		super(SLLanguage.class, program.getSourceSection(), descriptor);
		this.program = program;
	}

	@Override
	public Object execute(VirtualFrame frame) {
		return program.execute_init(frame);
	}

}
