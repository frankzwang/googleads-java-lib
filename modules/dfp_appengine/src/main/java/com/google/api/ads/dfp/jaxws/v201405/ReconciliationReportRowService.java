
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
@WebServiceClient(name = "ReconciliationReportRowService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405", wsdlLocation = "https://www.google.com/apis/ads/publisher/v201405/ReconciliationReportRowService?wsdl")
public class ReconciliationReportRowService
    extends Service
{

    private final static URL RECONCILIATIONREPORTROWSERVICE_WSDL_LOCATION;
    private final static WebServiceException RECONCILIATIONREPORTROWSERVICE_EXCEPTION;
    private final static QName RECONCILIATIONREPORTROWSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201405", "ReconciliationReportRowService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://www.google.com/apis/ads/publisher/v201405/ReconciliationReportRowService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RECONCILIATIONREPORTROWSERVICE_WSDL_LOCATION = url;
        RECONCILIATIONREPORTROWSERVICE_EXCEPTION = e;
    }

    public ReconciliationReportRowService() {
        super(__getWsdlLocation(), RECONCILIATIONREPORTROWSERVICE_QNAME);
    }

    public ReconciliationReportRowService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ReconciliationReportRowServiceInterface
     */
    @WebEndpoint(name = "ReconciliationReportRowServiceInterfacePort")
    public ReconciliationReportRowServiceInterface getReconciliationReportRowServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201405", "ReconciliationReportRowServiceInterfacePort"), ReconciliationReportRowServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReconciliationReportRowServiceInterface
     */
    @WebEndpoint(name = "ReconciliationReportRowServiceInterfacePort")
    public ReconciliationReportRowServiceInterface getReconciliationReportRowServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201405", "ReconciliationReportRowServiceInterfacePort"), ReconciliationReportRowServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RECONCILIATIONREPORTROWSERVICE_EXCEPTION!= null) {
            throw RECONCILIATIONREPORTROWSERVICE_EXCEPTION;
        }
        return RECONCILIATIONREPORTROWSERVICE_WSDL_LOCATION;
    }

}
