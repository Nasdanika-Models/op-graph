module org.nasdanika.models.opgraph.generator {
		
	requires transitive org.nasdanika.models.opgraph;

	requires org.nasdanika.xtext;
	requires transitive org.eclipse.emf.ecore.xcore;
	requires com.google.guice;
	requires org.eclipse.xtext.common.types;
	requires org.apache.log4j;
	requires org.eclipse.emf.codegen.ecore;
	
	exports org.nasdanika.models.opgraph.generator;
	opens org.nasdanika.models.opgraph.generator; // For loading resources

	
}
