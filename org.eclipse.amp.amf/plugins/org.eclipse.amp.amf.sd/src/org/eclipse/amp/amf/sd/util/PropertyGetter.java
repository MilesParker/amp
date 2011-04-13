package org.eclipse.amp.amf.sd.util;

import org.metaabm.IAgentChild;
import org.metaabm.SAgent;

public abstract class PropertyGetter {

	public String getProperty(IAgentChild agentChild) {
		SAgent parent = agentChild.getParent();
		if (parent.getImplementation().getPackage() == null) {
			parent = parent.getOwner();
		}

		return getAgentProperty(parent);
	}

	abstract String getAgentProperty(SAgent parent);

}
