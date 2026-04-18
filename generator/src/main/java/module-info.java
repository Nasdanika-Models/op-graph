module org.nasdanika.models.opgraph.generator {
		
	requires transitive org.nasdanika.models.opgraph;
	requires org.apache.commons.lang3;
	
	exports org.nasdanika.models.opgraph.generator;
	opens org.nasdanika.models.opgraph.generator; // For loading resources

	
}
