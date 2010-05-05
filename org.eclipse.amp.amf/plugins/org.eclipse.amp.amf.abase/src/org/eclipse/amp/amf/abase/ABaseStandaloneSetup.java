
package org.eclipse.amp.amf.abase;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ABaseStandaloneSetup extends ABaseStandaloneSetupGenerated{

	public static void doSetup() {
		new ABaseStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

