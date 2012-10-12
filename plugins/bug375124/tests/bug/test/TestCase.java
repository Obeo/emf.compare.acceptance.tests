package bug.test;

import junit.framework.Assert;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;

import bug.BugFactory;
import bug.Class1;
import bug.Class2;

public class TestCase {

	@Test
	public void test() throws InterruptedException {

		final EObject root1 = createModel();
		final EObject root2 = EcoreUtil.copy(root1);

		
		Comparison comp = EMFCompare.newComparator(EMFCompare.createDefaultScope(root1, root2)).compare();
				// Dump any differences to std.err before asserting
		for (final Diff d : comp.getDifferences()) {
			System.err.println(d.toString());
		}

		Assert.assertTrue(comp.getDifferences().isEmpty());
	}

	EObject createModel() {
		final Class1 c1 = BugFactory.eINSTANCE.createClass1();

		final Class2 refA = BugFactory.eINSTANCE.createClass2();
		c1.setRefA(refA);

		final Class2 refB = BugFactory.eINSTANCE.createClass2();
		c1.setRefB(refB);

		return c1;

	}
}
