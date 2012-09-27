package test.data;

import java.io.IOException;

import org.eclipse.emf.compare.tests.framework.AbstractInputData;
import org.eclipse.emf.ecore.resource.Resource;

public class FeatureMapInputData extends AbstractInputData {
	public Resource getIdenticalResourcesLeft() throws IOException {
		return loadFromClassLoader("identicalLeft.mast_definition"); //$NON-NLS-1$
	}

	public Resource getIdenticalResourcesRight() throws IOException {
		return loadFromClassLoader("identicalRight.mast_definition"); //$NON-NLS-1$
	}

	public Resource getAttributeChangedLeft() throws IOException {
		return loadFromClassLoader("attributeChangesLeft.mast_definition"); //$NON-NLS-1$
	}

	public Resource getAttributeChangedRight() throws IOException {
		return loadFromClassLoader("attributeChangesRight.mast_definition"); //$NON-NLS-1$
	}

	public Resource getReferenceChangedLeft() throws IOException {
		return loadFromClassLoader("referenceChangesLeft.mast_definition"); //$NON-NLS-1$
	}

	public Resource getReferenceChangedRight() throws IOException {
		return loadFromClassLoader("referenceChangesRight.mast_definition"); //$NON-NLS-1$
	}
}
