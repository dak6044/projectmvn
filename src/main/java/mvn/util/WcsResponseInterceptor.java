package mvn.util;

import de.terrestris.shogun2.util.interceptor.WcsResponseInterceptorInterface;
import de.terrestris.shogun2.util.interceptor.MutableHttpServletRequest;
import de.terrestris.shogun2.util.model.Response;

/**
 * This class demonstrates how to implement the WcsResponseInterceptorInterface.
 * 
 * @author Daniel Koch
 * @author terrestris GmbH & Co. KG
 *
 */
public class WcsResponseInterceptor implements WcsResponseInterceptorInterface{

	@Override
	public Response interceptGetCapabilities(MutableHttpServletRequest request, Response response) {
		return response;
	}

	@Override
	public Response interceptDescribeCoverage(MutableHttpServletRequest request, Response response) {
		return response;
	}

	@Override
	public Response interceptGetCoverage(MutableHttpServletRequest request, Response response) {
		return response;
	}

}
