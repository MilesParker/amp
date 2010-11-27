package org.eclipse.amp.amf.adata.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;

public class BinaryResourceFactoryImpl implements Resource.Factory {
	public Resource createResource(URI uri) {
		return new BinaryResourceImpl(uri);
	}
};
