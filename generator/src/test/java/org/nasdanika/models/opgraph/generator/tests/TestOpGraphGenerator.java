package org.nasdanika.models.opgraph.generator.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xcore.XAnnotation;
import org.eclipse.emf.ecore.xcore.XAnnotationDirective;
import org.eclipse.emf.ecore.xcore.XPackage;
import org.eclipse.emf.ecore.xcore.XcoreFactory;
import org.eclipse.emf.ecore.xcore.XcoreStandaloneSetup;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.jupiter.api.Test;

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
        
        // Ecore annotation directive
        XAnnotationDirective ecoreDirective = factory.createXAnnotationDirective();
        ecoreDirective.setName("Ecore");
        ecoreDirective.setSourceURI("http://www.eclipse.org/emf/2002/Ecore");
        xPackage.getAnnotationDirectives().add(ecoreDirective);
        
        // @Ecore annotation with nsURI and nsPrefix
        XAnnotation ecoreAnnotation = factory.createXAnnotation();
        ecoreAnnotation.setSource(ecoreDirective);
        ecoreAnnotation.getDetails().put("nsURI", "dudu");
        ecoreAnnotation.getDetails().put("nsPrefix", "dodo");
                
        xPackage.getAnnotations().add(ecoreAnnotation);

        resource.save(null);
	}
				
}
