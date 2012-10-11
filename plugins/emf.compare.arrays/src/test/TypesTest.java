package test;

import static junit.framework.Assert.assertEquals;

import java.io.IOException;

import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;

import test.data.TypesInputData;

public class TypesTest {
	private final TypesInputData data = new TypesInputData();
	
	@Test
	public void identicalModels() throws IOException {
		final Resource left = data.getXML();
		final Resource right = data.getXML();

		final IComparisonScope scope = EMFCompare.createDefaultScope(left,
				right);
		final Comparison comparison = EMFCompare.newComparator(scope).compare();

		assertEquals(0, comparison.getDifferences().size());
	}
}
