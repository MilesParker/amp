package org.eclipse.amp.amf.sd.impl;

import org.eclipse.amp.amf.sd.util.PackageGetter;

public class SdModelImplGeneratedNot extends SdModelImpl {

	@Override
	public String getPackage() {
		return new PackageGetter().getProperty(this);
	}

}
