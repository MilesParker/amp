package org.eclipse.amp.amf.parameters;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Generated from StandaloneSetup.xpt!
 */
public class AParStandaloneSetup implements ISetup {

    public static void doSetup() {
        new AParStandaloneSetup().createInjectorAndDoEMFRegistration();
    }

    public Injector createInjectorAndDoEMFRegistration() {
        org.eclipse.xtext.common.TerminalsStandaloneSetup.doSetup();

        Injector injector = createInjector();
        register(injector);
        return injector;
    }

    public Injector createInjector() {
        return Guice.createInjector(new org.eclipse.amp.amf.parameters.AParRuntimeModule());
    }

    public void register(Injector injector) {
        if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/amp/amf/parameters/APar")) {
            EPackage.Registry.INSTANCE.put("http://www.eclipse.org/amp/amf/parameters/APar", org.eclipse.amp.amf.parameters.aPar.AParPackage.eINSTANCE);
        }

        org.eclipse.xtext.resource.IResourceFactory resourceFactory = injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("apar", resourceFactory);




    }
}
