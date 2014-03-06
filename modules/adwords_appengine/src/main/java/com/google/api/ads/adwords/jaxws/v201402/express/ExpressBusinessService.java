
package com.google.api.ads.adwords.jaxws.v201402.express;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ExpressBusinessService", targetNamespace = "https://adwords.google.com/api/adwords/express/v201402", wsdlLocation = "https://adwords.google.com/api/adwords/express/v201402/ExpressBusinessService?wsdl")
public class ExpressBusinessService
    extends Service
{

    private final static URL EXPRESSBUSINESSSERVICE_WSDL_LOCATION;
    private final static WebServiceException EXPRESSBUSINESSSERVICE_EXCEPTION;
    private final static QName EXPRESSBUSINESSSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/express/v201402", "ExpressBusinessService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/express/v201402/ExpressBusinessService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EXPRESSBUSINESSSERVICE_WSDL_LOCATION = url;
        EXPRESSBUSINESSSERVICE_EXCEPTION = e;
    }

    public ExpressBusinessService() {
        super(__getWsdlLocation(), EXPRESSBUSINESSSERVICE_QNAME);
    }

    public ExpressBusinessService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ExpressBusinessServiceInterface
     */
    @WebEndpoint(name = "ExpressBusinessServiceInterfacePort")
    public ExpressBusinessServiceInterface getExpressBusinessServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/express/v201402", "ExpressBusinessServiceInterfacePort"), ExpressBusinessServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ExpressBusinessServiceInterface
     */
    @WebEndpoint(name = "ExpressBusinessServiceInterfacePort")
    public ExpressBusinessServiceInterface getExpressBusinessServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/express/v201402", "ExpressBusinessServiceInterfacePort"), ExpressBusinessServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EXPRESSBUSINESSSERVICE_EXCEPTION!= null) {
            throw EXPRESSBUSINESSSERVICE_EXCEPTION;
        }
        return EXPRESSBUSINESSSERVICE_WSDL_LOCATION;
    }

}
