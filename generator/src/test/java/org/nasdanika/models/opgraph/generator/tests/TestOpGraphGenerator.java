package org.nasdanika.models.opgraph.generator.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.opgraph.Attribute;
import org.nasdanika.models.opgraph.Component;
import org.nasdanika.models.opgraph.OpgraphFactory;
import org.nasdanika.models.opgraph.Package;
import org.nasdanika.models.opgraph.generator.EcoreGenerator;

/**
 * Tests Ecore -> Graph -> Processor -> actions generation
 * @author Pavel
 *
 */
public class TestOpGraphGenerator {
		
	@Test
	public void testGenerateOpGraph() throws Exception {		
		
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
		
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
				
		EcoreGenerator generator = new EcoreGenerator(opPackage);

		EPackage ePackage = generator.generate();
		Resource eRes = resourceSet.createResource(URI.createFileURI("target/opgraph.ecore"));
		eRes.getContents().add(ePackage);
		eRes.save(null);
	}	
				
}
