/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Initial development and maintenance
 *
 * </copyright>
 */
package org.metaabm.provider;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.metaabm.SAttribute;

public class SAttributeItemProviderShallow extends SAttributeItemProvider {

	SAttribute attr;

	public SAttributeItemProviderShallow(AdapterFactory adapterFactory, SAttribute attr) {
		super(adapterFactory);
		this.attr = attr;
	}

	@Override
	@SuppressWarnings("unchecked")
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		return Collections.EMPTY_LIST;
	}

	@Override
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain, Object sibling) {
		return Collections.EMPTY_LIST;
	}

	@Override
	public Collection<?> getChildren(Object object) {
		return Collections.EMPTY_LIST;
	}

	@Override
	public Object getEditableValue(Object object) {
		return attr;
	}

	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		return super.getPropertyDescriptors(attr);
	}

	@Override
	public Object getParent(Object object) {
		return super.getParent(attr);
	}

	@Override
	public String getText(Object object) {
		return super.getText(attr);
	}
}
