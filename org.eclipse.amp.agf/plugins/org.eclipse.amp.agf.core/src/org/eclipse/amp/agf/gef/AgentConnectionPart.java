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

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;

public class AgentConnectionPart extends AbstractConnectionEditPart {

	public static final PointList FLAT_TIP = new PointList();

	static {
		FLAT_TIP.addPoint(1, 0);
		FLAT_TIP.addPoint(-2, 0);
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}

	@Override
	protected IFigure createFigure() {
		PolylineConnection connect = new PolylineConnection() {
		};
		connect.setEnd(new Point(0, 0));
		connect.setTargetDecoration(createDecoration());
		connect.setSourceDecoration(createDecoration());
		return connect;
	}

	PolygonDecoration createDecoration() {
		PolygonDecoration d = new PolygonDecoration();
		d.setPoints(FLAT_TIP);
		return d;
	}
}
