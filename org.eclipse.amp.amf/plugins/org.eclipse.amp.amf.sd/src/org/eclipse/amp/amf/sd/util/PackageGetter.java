package org.eclipse.amp.amf.sd.util;

import org.metaabm.IAgentChild;
import org.metaabm.SAgent;

public class PackageGetter extends PropertyGetter {

	/**
	 * @see org.metaabm.IAgentChild#getPackage()
	 */
	@Override
	String getAgentProperty(SAgent agent) {
		String packge = agent.getImplementation().getPackage();
		if (packge == null || packge.length() == 0) {
			packge = agent.getOwner().getImplementation().getPackage();
		}

		return packge + "." + agent.getID().toLowerCase() + "_SD";
	}

	public static final String getPackage(IAgentChild agentChild) {
		return new PackageGetter().getProperty(agentChild);
	}

}
