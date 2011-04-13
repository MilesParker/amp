package org.eclipse.amp.amf.sd.util;

import org.metaabm.IAgentChild;
import org.metaabm.SAgent;

public class SrcGenGetter extends PropertyGetter {

	@Override
	String getAgentProperty(SAgent parent) {
		return parent.getImplementation().getSrcDir();
	}

	public static final String getSrcGen(IAgentChild agentChild) {
		return new SrcGenGetter().getProperty(agentChild);
	}

}
