
package com.google.api.ads.adwords.jaxws.v201402.cm;

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
@WebServiceClient(name = "DataService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201402/DataService?wsdl")
public class DataService
    extends Service
{

    private final static URL DATASERVICE_WSDL_LOCATION;
    private final static WebServiceException DATASERVICE_EXCEPTION;
    private final static QName DATASERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201402", "DataService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201402/DataService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DATASERVICE_WSDL_LOCATION = url;
        DATASERVICE_EXCEPTION = e;
    }

    public DataService() {
        super(__getWsdlLocation(), DATASERVICE_QNAME);
    }

    public DataService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns DataServiceInterface
     */
    @WebEndpoint(name = "DataServiceInterfacePort")
    public DataServiceInterface getDataServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201402", "DataServiceInterfacePort"), DataServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DataServiceInterface
     */
    @WebEndpoint(name = "DataServiceInterfacePort")
    public DataServiceInterface getDataServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201402", "DataServiceInterfacePort"), DataServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DATASERVICE_EXCEPTION!= null) {
            throw DATASERVICE_EXCEPTION;
        }
        return DATASERVICE_WSDL_LOCATION;
    }

}
