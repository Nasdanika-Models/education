module org.nasdanika.models.education.processors {
		
	requires transitive org.nasdanika.models.education;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.education.processors;
	opens org.nasdanika.models.education.processors; // For loading resources
	
}
