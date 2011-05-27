package org.eclipse.amp.amf.sd.util;

import org.metaabm.IAgentChild;
import org.metaabm.SAgent;

public abstract class PropertyGetter {

	public String getProperty(IAgentChild agentChild) {
		return getAgentProperty(agentChild.getParent());
	}

	abstract String getAgentProperty(SAgent agent);

}
