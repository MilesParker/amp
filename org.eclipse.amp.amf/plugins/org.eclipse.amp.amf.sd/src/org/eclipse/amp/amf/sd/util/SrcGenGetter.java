package org.eclipse.amp.amf.sd.util;

import org.metaabm.IAgentChild;
import org.metaabm.SAgent;

public class SrcGenGetter extends PropertyGetter {

	@Override
	String getAgentProperty(SAgent agent) {
		String srcDir = agent.getImplementation().getSrcDir();
		if (srcDir == null || srcDir.length() == 0) {
			srcDir = agent.getOwner().getImplementation().getSrcDir();
		}

		return srcDir;
	}

	public static final String getSrcGen(IAgentChild agentChild) {
		return new SrcGenGetter().getProperty(agentChild);
	}

}
