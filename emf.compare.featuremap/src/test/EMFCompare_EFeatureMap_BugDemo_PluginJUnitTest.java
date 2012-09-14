package test;

import static junit.framework.Assert.assertEquals;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

public class EMFCompare_EFeatureMap_BugDemo_PluginJUnitTest {
	@Test
	public void testAccessOperationsTransformation() {
		URI expectedOutputMastModelURI = URI
				.createPlatformPluginURI(
						"/emf.compare.featuremap/models/expected.mast_definition",
						true);
		URI actualOutputMastModelURI = URI
				.createPlatformPluginURI(
						"/emf.compare.featuremap/models/actual.mast_definition",
						true);

		Resource expectedOutputMastModelResource = new ResourceSetImpl()
				.getResource(expectedOutputMastModelURI, true);
		Resource actualOutputMastModelResource = new ResourceSetImpl()
				.getResource(actualOutputMastModelURI, true);

		final IComparisonScope scope = EMFCompare.createDefaultScope(
				expectedOutputMastModelResource, actualOutputMastModelResource);
		final Comparison comparison = EMFCompare.newComparator(scope).compare();

		assertEquals(0, comparison.getDifferences().size());
	}
}
