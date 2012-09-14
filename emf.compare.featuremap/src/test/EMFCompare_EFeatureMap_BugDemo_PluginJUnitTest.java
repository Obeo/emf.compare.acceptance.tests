package test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;

import test.data.FeatureMapInputData;

public class EMFCompare_EFeatureMap_BugDemo_PluginJUnitTest {
	private final FeatureMapInputData data = new FeatureMapInputData();

	@Test
	public void identicalModelsNoDiff() throws IOException {
		final Resource left = data.getIdenticalResourcesLeft();
		final Resource right = data.getIdenticalResourcesRight();

		final IComparisonScope scope = EMFCompare.createDefaultScope(left,
				right);
		final Comparison comparison = EMFCompare.newComparator(scope).compare();

		assertEquals(0, comparison.getDifferences().size());
	}

	@Test
	public void mergeAttributeChangesLtR() throws IOException {
		final Resource left = data.getAttributeChangedLeft();
		final Resource right = data.getAttributeChangedRight();

		final IComparisonScope scope = EMFCompare.createDefaultScope(left,
				right);
		 Comparison comparison = EMFCompare.newComparator(scope).compare();
		
		final List<Diff> differences = comparison.getDifferences();
		assertEquals(2, differences.size());
		
		for (Diff diff : differences) {
			assertTrue(diff instanceof AttributeChange);
			diff.copyLeftToRight();
		}
		
		comparison = EMFCompare.newComparator(scope).compare();
		assertEquals(0, comparison.getDifferences().size());
	}
	
	@Test
	public void mergeAttributeChangesRtL() throws IOException {
		final Resource left = data.getAttributeChangedLeft();
		final Resource right = data.getAttributeChangedRight();

		final IComparisonScope scope = EMFCompare.createDefaultScope(left,
				right);
		 Comparison comparison = EMFCompare.newComparator(scope).compare();
		
		final List<Diff> differences = comparison.getDifferences();
		assertEquals(2, differences.size());
		
		for (Diff diff : differences) {
			assertTrue(diff instanceof AttributeChange);
			diff.copyRightToLeft();
		}
		
		comparison = EMFCompare.newComparator(scope).compare();
		assertEquals(0, comparison.getDifferences().size());
	}
	
	@Test
	public void mergeReferenceChangesLtR() throws IOException {
		final Resource left = data.getReferenceChangedLeft();
		final Resource right = data.getReferenceChangedRight();

		final IComparisonScope scope = EMFCompare.createDefaultScope(left,
				right);
		 Comparison comparison = EMFCompare.newComparator(scope).compare();
		
		final List<Diff> differences = comparison.getDifferences();
		assertEquals(3, differences.size());
		
		for (Diff diff : differences) {
			assertTrue(diff instanceof ReferenceChange);
			diff.copyLeftToRight();
		}
		
		comparison = EMFCompare.newComparator(scope).compare();
		assertEquals(0, comparison.getDifferences().size());
	}
	
	@Test
	public void mergeReferenceChangesRtL() throws IOException {
		final Resource left = data.getReferenceChangedLeft();
		final Resource right = data.getReferenceChangedRight();

		final IComparisonScope scope = EMFCompare.createDefaultScope(left,
				right);
		 Comparison comparison = EMFCompare.newComparator(scope).compare();
		
		final List<Diff> differences = comparison.getDifferences();
		assertEquals(3, differences.size());
		
		for (Diff diff : differences) {
			assertTrue(diff instanceof ReferenceChange);
			diff.copyRightToLeft();
		}
		
		comparison = EMFCompare.newComparator(scope).compare();
		assertEquals(0, comparison.getDifferences().size());
	}
}
