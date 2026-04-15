import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.opgraph.ecore.ECoreGenOpGraphProcessorsCapabilityFactory;

module org.nasdanika.models.opgraph.ecore {
		
	requires transitive org.nasdanika.models.opgraph;
	requires transitive org.nasdanika.models.ecore.graph;
	requires org.eclipse.emf.common;
	
	exports org.nasdanika.models.opgraph.ecore;
	opens org.nasdanika.models.opgraph.ecore; // For loading resources

	provides CapabilityFactory with	ECoreGenOpGraphProcessorsCapabilityFactory; 		
	
}
