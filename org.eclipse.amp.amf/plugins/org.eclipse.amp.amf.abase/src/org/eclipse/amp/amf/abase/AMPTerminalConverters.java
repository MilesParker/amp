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

package org.eclipse.amp.amf.abase;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

/**
 * 
 * @author mparker
 *
 */
public class AMPTerminalConverters extends DefaultTerminalConverters {

    @ValueConverter(rule = "DESC_STRING")
    public IValueConverter<String> DESC_STRING() {
        return new AbstractNullSafeConverter<String>() {
            @Override
            protected String internalToValue(String string, INode node) {
                return string.substring(1, string.length() - 1);
            }

            @Override
            protected String internalToString(String value) {
                return '«' + Strings.convertToJavaString(value) + '»';
            }
        };
    }
}
