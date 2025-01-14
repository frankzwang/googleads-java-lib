
package com.google.api.ads.dfp.jaxws.v201405;

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
@WebServiceClient(name = "TeamService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405", wsdlLocation = "https://www.google.com/apis/ads/publisher/v201405/TeamService?wsdl")
public class TeamService
    extends Service
{

    private final static URL TEAMSERVICE_WSDL_LOCATION;
    private final static WebServiceException TEAMSERVICE_EXCEPTION;
    private final static QName TEAMSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201405", "TeamService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://www.google.com/apis/ads/publisher/v201405/TeamService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TEAMSERVICE_WSDL_LOCATION = url;
        TEAMSERVICE_EXCEPTION = e;
    }

    public TeamService() {
        super(__getWsdlLocation(), TEAMSERVICE_QNAME);
    }

    public TeamService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns TeamServiceInterface
     */
    @WebEndpoint(name = "TeamServiceInterfacePort")
    public TeamServiceInterface getTeamServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201405", "TeamServiceInterfacePort"), TeamServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TeamServiceInterface
     */
    @WebEndpoint(name = "TeamServiceInterfacePort")
    public TeamServiceInterface getTeamServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201405", "TeamServiceInterfacePort"), TeamServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TEAMSERVICE_EXCEPTION!= null) {
            throw TEAMSERVICE_EXCEPTION;
        }
        return TEAMSERVICE_WSDL_LOCATION;
    }

}
