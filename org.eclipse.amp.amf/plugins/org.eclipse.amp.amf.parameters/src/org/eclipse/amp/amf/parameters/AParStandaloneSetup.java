
package org.eclipse.amp.amf.parameters;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AParStandaloneSetup extends AParStandaloneSetupGenerated{

	public static void doSetup() {
		new AParStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

