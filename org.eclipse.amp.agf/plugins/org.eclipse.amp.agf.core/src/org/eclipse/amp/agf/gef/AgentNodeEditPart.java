/**
 * <copyright>
 *
 * Copyright (c) 2010 Metascape, LLC.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Initial API and Implementation
 *
 * </copyright>
 *
 */

package org.eclipse.amp.agf.gef;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.amp.axf.space.ILocation2D;
import org.eclipse.amp.axf.space.ILocationProvider;
import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;

/**
 * 
 * @author mparker
 * 
 */
public class AgentNodeEditPart extends GenericEditPart implements NodeEditPart {

	private boolean provides2D = true;

	@SuppressWarnings("unchecked")
	@Override
	public synchronized List getModelSourceConnections() {
		ScapeEditPart parentPart = (ScapeEditPart) getParent();
		ILocationProvider locationProvider = parentPart.getLocationProvider();
		ICompositionProvider memberProvider = parentPart.getMemberProvider();
		if (getParent() instanceof ScapeGraphEditPart
			|| parentPart.getLocationProvider().getLocation(getModel()) instanceof ILocation2D) {
			Collection<?> allGraphConnections = new HashSet();
			Collection<ScapeGraphEditPart> graphParts = parentPart.getRootScapeEditPart().getGraphParts();
			for (ScapeGraphEditPart scapeGraphEditPart : graphParts) {
				allGraphConnections.addAll(scapeGraphEditPart.getModelSourceConnections(getModel()));
			}
			if (!(parentPart instanceof ScapeGraphEditPart)) {
				Collection<?> all2DAgents = new HashSet();
				for (ScapeEditPart scapeEditPart : parentPart.getRootScapeEditPart().get2DParts()) {
					all2DAgents.addAll(memberProvider.getList(scapeEditPart.getModel()));
				}
				allGraphConnections.retainAll(all2DAgents);
			}
			return new ArrayList(allGraphConnections);
		} else {
			return Collections.emptyList();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public synchronized List getModelTargetConnections() {
		ScapeEditPart parentPart = (ScapeEditPart) getParent();
		ILocationProvider locationProvider = parentPart.getLocationProvider();
		ICompositionProvider memberProvider = parentPart.getMemberProvider();
		if (getParent() instanceof ScapeGraphEditPart
			|| parentPart.getLocationProvider().getLocation(getModel()) instanceof ILocation2D) {
			Collection<?> allGraphConnections = new HashSet();
			Collection<ScapeGraphEditPart> graphParts = parentPart.getRootScapeEditPart().getGraphParts();
			for (ScapeGraphEditPart scapeGraphEditPart : graphParts) {
				allGraphConnections.addAll(scapeGraphEditPart.getModelTargetConnections(getModel()));
			}
			if (!(parentPart instanceof ScapeGraphEditPart)) {
				Collection<?> all2DAgents = new HashSet();
				for (ScapeEditPart scapeEditPart : parentPart.getRootScapeEditPart().get2DParts()) {
					all2DAgents.addAll(memberProvider.getList(scapeEditPart.getModel()));
				}
				allGraphConnections.retainAll(all2DAgents);
			}
			return new ArrayList(allGraphConnections);
		} else {
			return Collections.emptyList();
		}
	}

	protected ConnectionAnchor getConnectionAnchor() {
		if (anchor == null) {
			if (getFigure() instanceof Ellipse) {
				anchor = new EllipseAnchor(getFigure());
			} else {
				anchor = new ChopboxAnchor(getFigure());
			}
		}
		return anchor;
	}

	// /**
	// *
	// * @see org.eclipse.amp.agf.gef.GenericEditPart#refresh()
	// */
	// public synchronized void refresh() {
	// super.refresh();
	// // TODO let's optimize this as it will now slow down every non-network implementation
	// refreshSourceConnections();
	// refreshTargetConnections();
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.NodeEditPart#getSourceConnectionAnchor(org.eclipse.gef .ConnectionEditPart)
	 */
	public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
		return getConnectionAnchor();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.NodeEditPart#getSourceConnectionAnchor(org.eclipse.gef .Request)
	 */
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		return getConnectionAnchor();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.NodeEditPart#getTargetConnectionAnchor(org.eclipse.gef .ConnectionEditPart)
	 */
	public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
		return getConnectionAnchor();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.NodeEditPart#getTargetConnectionAnchor(org.eclipse.gef .Request)
	 */
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return getConnectionAnchor();
	}
}
