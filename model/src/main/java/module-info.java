import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.opgraph.capability.OpGraphEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.opgraph {
	
	exports org.nasdanika.models.opgraph;
	exports org.nasdanika.models.opgraph.impl;
	exports org.nasdanika.models.opgraph.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.capability;
	
	provides CapabilityFactory with 
		OpGraphEPackageResourceSetCapabilityFactory;
	
}