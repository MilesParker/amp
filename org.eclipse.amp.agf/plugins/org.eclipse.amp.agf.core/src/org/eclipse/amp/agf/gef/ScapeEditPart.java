/**
 * <copyright>
 *
 * Copyright (c) 2009 Metascape, LLC.
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

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.space.ILocation;
import org.eclipse.amp.axf.space.ILocation2D;
import org.eclipse.amp.axf.space.ILocationProvider;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ScalableFreeformLayeredPane;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.jface.viewers.IFilter;

public class ScapeEditPart extends GenericEditPart implements PropertyChangeListener, NodeEditPart {

	ICompositionProvider memberProvider;

	ILocationProvider locationProvider;

	private IFilter filter;

	boolean updating;

	public ScapeEditPart(ICompositionProvider memberProvider, ILocationProvider locationProvider, IFilter filter) {
		super();
		this.memberProvider = memberProvider;
		this.locationProvider = locationProvider;
		this.setFilter(filter);
	}

	@Override
	protected IFigure createFigure() {
		Figure f = null;
		Dimension calculateDimension = calculateDimension();
		if (calculateDimension != null) {
			ScalableFreeformLayeredPane scalableFreeformLayeredPane = new ScalableFreeformLayeredPane();
			f = scalableFreeformLayeredPane;
			f.setBounds(new Rectangle(new Point(0, 0), calculateDimension));
		} else {
			f = new FreeformLayer();
			ScapeEditPart rootScapeEditPart = getRootScapeEditPart();
			if (rootScapeEditPart != this) {
				f.setBounds(rootScapeEditPart.getFigure().getBounds());
			}
		}
		f.setLayoutManager(new XYLayout());
		f.setOpaque(false);
		return f;
	}

	// @Override
	public synchronized void refresh() {
		if (getFilter() == null || getFilter().select(getModel())) {
			refreshVisuals();
			refreshChildren();
			// performance improvement..we only need to do this once for Array2D
			if (memberProvider.isMutable(getModel())) {
				for (Object child : getChildren()) {
					((EditPart) child).refresh();
					calculateConstraints(((GraphicalEditPart) child));
				}
			} else {
				for (Object child : getChildren()) {
					((GenericEditPart) child).refreshVisuals();
				}
			}
			if (this instanceof ScapeGraphEditPart) {
				super.refreshSourceConnections();
				super.refreshTargetConnections();
			}
		}
	}

	public Dimension calculateDimension() {
		ILocation extent = locationProvider.getExtent(getModel());
		if (extent instanceof ILocation2D) {
			return GEFUtils.toScaledDimension((ILocation2D) extent);
		}
		return null;
	}

	protected void calculateConstraints(GraphicalEditPart editPart) {
		Object agent = editPart.getModel();
		ILocation2D location = (ILocation2D) locationProvider.getLocation(agent);
		if (location != null) {
			IFigure childFigure = editPart.getFigure();
			Rectangle bounds = new Rectangle(GEFUtils.toScaledPoint(location), childFigure.getSize());
			getFigure().setConstraint(childFigure, bounds);
		}
	}

	/**
	 * Must not be called while scape is updating.
	 */
	protected synchronized void refreshChildren() {
		if (getRootScapeEditPart() != this) {
			if (memberProvider.isMutable(getModel())) {
					Map<Object, EditPart> modelToEditPart = new HashMap<Object, EditPart>();
					for (Object object : getChildren()) {
						EditPart editPart = (EditPart) object;
						modelToEditPart.put(editPart.getModel(), editPart);
					}
					for (Object agent : memberProvider.getIteratable(getModel())) {
							EditPart editPart = modelToEditPart.remove(agent);
							if (editPart == null) {
								editPart = createChild(agent);
								addChild(editPart, -1);
							}
					}
					for (EditPart part : modelToEditPart.values()) {
						removeChild(part);
					}
				}
		} else {
				for (Object agent : memberProvider.getIteratable(getModel())) {
					boolean hasChild = false;
					for (Object child : getChildren()) {
						EditPart part = (EditPart) child;
						if (agent == part.getModel()) {
							hasChild = true;
							break;
						}
					}
					if (!hasChild) {
						EditPart editPart = createChild(agent);
						addChild(editPart, -1);
					}
				}
			}
		}

	public synchronized List<ScapeGraphEditPart> getGraphParts() {
		if (memberProvider.isChildrenComposition(getModel())) {
			List<ScapeGraphEditPart> parts = new ArrayList<ScapeGraphEditPart>();
			for (Object editPart : getChildren()) {
				if (editPart instanceof ScapeGraphEditPart) {
					parts.add((ScapeGraphEditPart) editPart);
				} else if (editPart instanceof ScapeEditPart) {
					parts.addAll(((ScapeEditPart) editPart).getGraphParts());
				}
			}
			return parts;
		}
		return Collections.emptyList();
	}

	public synchronized List<ScapeEditPart> get2DParts() {
		if (memberProvider.isChildrenComposition(getModel())) {
			List<ScapeEditPart> parts = new ArrayList<ScapeEditPart>();
			for (Object editPart : getChildren()) {
				if (editPart instanceof ScapeGraphEditPart && locationProvider.getLocation(memberProvider.getChildrenPrototype(((ScapeEditPart) editPart).getModel())) instanceof ILocation2D) {
					parts.add((ScapeGraphEditPart) editPart);
				} else if (editPart instanceof ScapeEditPart) {
					parts.addAll(((ScapeEditPart) editPart).get2DParts());
				}
			}
			return parts;
		}
		return Collections.emptyList();
	}

	public ScapeEditPart getRootScapeEditPart() {
		if (memberProvider.getParent(getModel()) == null || !(getParent() instanceof ScapeEditPart)) {
			return this;
		}
		return ((ScapeEditPart) getParent()).getRootScapeEditPart();
	}

	@Override
	public List getSourceConnections() {
		return Collections.EMPTY_LIST;
	}

	@Override
	public List getTargetConnections() {
		return Collections.EMPTY_LIST;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
		// installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, new
		// SelectionEditPolicy() {
		//
		// @Override
		// protected void setSelectedState(int type) {
		// super.setSelectedState(type);
		// IFigure f = ((GraphicalEditPart) getHost()).getFigure();
		// System.err.println("h  "+getHost());
		// System.err.println("f " + f.getClass());
		// if (f instanceof Shape) {
		// Shape s = (Shape) f;
		// if (type == EditPart.SELECTED_PRIMARY) {
		// s.setForegroundColor(ColorConstants.yellow);
		// s.setOutline(true);
		// } else if (type == EditPart.SELECTED) {
		// showSelection();
		// } else {
		// hideSelection();
		// }
		// }
		// }
		//
		// @Override
		// protected void hideSelection() {
		// }
		//
		// @Override
		// protected void showSelection() {
		// }
		// });

	}

	public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
		// TODO Auto-generated method stub
		return null;
	}

	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
		// TODO Auto-generated method stub
		return null;
	}

	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seejava.beans.PropertyChangeListener#propertyChange(java.beans. PropertyChangeEvent)
	 */
	public void propertyChange(PropertyChangeEvent evt) {
		// String prop = evt.getPropertyName();
		// if (Shape.SIZE_PROP.equals(prop) || Shape.LOCATION_PROP.equals(prop))
		// {
		// refreshVisuals();
		// } else if (Shape.SOURCE_CONNECTIONS_PROP.equals(prop)) {
		// refreshSourceConnections();
		// } else if (Shape.TARGET_CONNECTIONS_PROP.equals(prop)) {
		// refreshTargetConnections();
		// }
	}

	public IFilter getFilter() {
		return filter;
	}

	public void setFilter(IFilter filter) {
		this.filter = filter;
	}

	public ICompositionProvider getMemberProvider() {
		return memberProvider;
	}

	public void setMemberProvider(ICompositionProvider memberProvider) {
		this.memberProvider = memberProvider;
	}

	public ILocationProvider getLocationProvider() {
		return locationProvider;
	}

	public void setLocationProvider(ILocationProvider locationProvider) {
		this.locationProvider = locationProvider;
	}

	public Object getModelRoot() {
		Object model = getModel();
		if (model instanceof IModel) {
			return ((IModel) getModel()).getRoot();
		}
		return model;
	}
}
