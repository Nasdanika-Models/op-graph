package org.nasdanika.models.opgraph.generator.tests;

import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xcore.XPackage;
import org.eclipse.emf.ecore.xcore.XcoreFactory;
import org.eclipse.emf.ecore.xcore.XcoreStandaloneSetup;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.jupiter.api.Test;
import org.nasdanika.models.opgraph.Attribute;
import org.nasdanika.models.opgraph.Component;
import org.nasdanika.models.opgraph.OpgraphFactory;
import org.nasdanika.models.opgraph.Package;
import org.nasdanika.models.opgraph.generator.XcoreGenerator;

import com.google.inject.Injector;

/**
 * Tests Ecore -> Graph -> Processor -> actions generation
 * @author Pavel
 *
 */
public class TestOpGraphGenerator {
	
	@Test
	public void testWriteXcore() throws Exception {
        Injector injector = new XcoreStandaloneSetup().createInjectorAndDoEMFRegistration();
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        Resource resource = resourceSet.createResource(URI.createFileURI("target/text.xcore"));
                               
        XcoreFactory factory = XcoreFactory.eINSTANCE;
        XPackage xPackage = factory.createXPackage();
        xPackage.setName("test");
        resource.getContents().add(xPackage);
        
        resource.save(null);
	}
	
	@Test
	public void testSaveOpGraph() throws Exception {
		
		XcoreGenerator generator = new XcoreGenerator() {

			@Override
			protected Collection<GenPackage> getGenPackages() {
				throw new UnsupportedOperationException("Not implemented yet");
			}
			
		};
		
		OpgraphFactory factory = OpgraphFactory.eINSTANCE;
		Package opPackage = factory.createPackage();
		opPackage.setName("test");
		opPackage.setNsURI("http://www.nasdanika.org/test");
		opPackage.setNsPrefix("test");
		
		Component opComponent = factory.createComponent();
		opComponent.setName("TestComponent");
		opPackage.getClasses().add(opComponent);
		
		Attribute opAttribute = factory.createAttribute();
		opAttribute.setName("testAttribute");
		opAttribute.setEType(EcorePackage.Literals.ESTRING);
		opComponent.getFeatures().add(opAttribute);
		
		
		generator.save(opPackage , URI.createFileURI("target/opgraph.xcore"));
	}	
				
}
