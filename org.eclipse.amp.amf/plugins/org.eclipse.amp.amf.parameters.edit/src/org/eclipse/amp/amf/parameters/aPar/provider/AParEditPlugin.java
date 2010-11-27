/**
 * <copyright>
 * </copyright>
 *
 * $Id: AParEditPlugin.java,v 1.5 2010/08/04 01:54:50 mparker Exp $
 */
package org.eclipse.amp.amf.parameters.aPar.provider;

import org.eclipse.amp.amf.abase.aBase.provider.ABaseEditPlugin;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.metaabm.provider.MetaABMEditPlugin;

/**
 * This is the central singleton for the APar edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class AParEditPlugin extends EMFPlugin {
    /**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final AParEditPlugin INSTANCE = new AParEditPlugin();

    /**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private static Implementation plugin;

    /**
	 * Create the instance.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AParEditPlugin() {
		super
		  (new ResourceLocator [] {
		     MetaABMEditPlugin.INSTANCE,
		     ABaseEditPlugin.INSTANCE,
		   });
	}

    /**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
    @Override
    public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

    /**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
    public static Implementation getPlugin() {
		return plugin;
	}

    /**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static class Implementation extends EclipsePlugin {
        /**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
    }

}
