package test.data;

import java.io.IOException;

import org.eclipse.emf.compare.tests.framework.AbstractInputData;
import org.eclipse.emf.ecore.resource.Resource;

public class FeatureMapInputData extends AbstractInputData {
	public Resource getIdenticalResourcesLeft() throws IOException {
		return loadFromClassloader("identicalLeft.mast_definition"); //$NON-NLS-1$
	}

	public Resource getIdenticalResourcesRight() throws IOException {
		return loadFromClassloader("identicalRight.mast_definition"); //$NON-NLS-1$
	}

	public Resource getAttributeChangedLeft() throws IOException {
		return loadFromClassloader("attributeChangesLeft.mast_definition"); //$NON-NLS-1$
	}

	public Resource getAttributeChangedRight() throws IOException {
		return loadFromClassloader("attributeChangesRight.mast_definition"); //$NON-NLS-1$
	}

	public Resource getReferenceChangedLeft() throws IOException {
		return loadFromClassloader("referenceChangesLeft.mast_definition"); //$NON-NLS-1$
	}

	public Resource getReferenceChangedRight() throws IOException {
		return loadFromClassloader("referenceChangesRight.mast_definition"); //$NON-NLS-1$
	}
}
