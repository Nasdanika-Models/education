import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.education.util.EducationEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.education {
	exports org.nasdanika.models.education;
	exports org.nasdanika.models.education.impl;
	exports org.nasdanika.models.education.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.party;
	
	provides CapabilityFactory with EducationEPackageResourceSetCapabilityFactory;
	
}