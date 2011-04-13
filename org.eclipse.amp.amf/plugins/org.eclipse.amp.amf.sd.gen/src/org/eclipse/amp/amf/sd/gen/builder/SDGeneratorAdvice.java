package org.eclipse.amp.amf.sd.gen.builder;

import org.eclipse.emf.mwe.core.WorkflowComponent;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.xpand2.Generator;
import org.eclipse.xpand2.GeneratorAdvice;

public class SDGeneratorAdvice extends GeneratorAdvice {

	@Override
	public void weave(WorkflowComponent c, Issues issues) {
		super.weave(c, issues);
		((Generator)c).setOutput(new Merge());
	}

}
