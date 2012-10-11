package test.data;

import java.io.IOException;

import org.eclipse.emf.compare.tests.framework.AbstractInputData;
import org.eclipse.emf.ecore.resource.Resource;

public class TypesInputData  extends AbstractInputData {
	public Resource getXML() throws IOException {
		return loadFromClassLoader("xml2.xml"); //$NON-NLS-1$
	}
}
