package org.eclipse.amp.amf.sd.util;

import org.metaabm.IAgentChild;
import org.metaabm.SAgent;
import org.metaabm.SImplementation;

public class PackageGetter extends PropertyGetter {

	/**
	 * @see org.metaabm.IAgentChild#getPackage()
	 */
	@Override
	String getAgentProperty(SAgent parent) {
		SImplementation impl = parent.getImplementation();
		return impl.getPackage() + "." + impl.getClassName().toLowerCase() + "agent_SD";
	}

	public static final String getPackage(IAgentChild agentChild) {
		return new PackageGetter().getProperty(agentChild);
	}

}
