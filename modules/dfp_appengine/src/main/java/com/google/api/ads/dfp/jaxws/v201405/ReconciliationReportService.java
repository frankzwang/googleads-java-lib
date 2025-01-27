
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
@WebServiceClient(name = "ReconciliationReportService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405", wsdlLocation = "https://www.google.com/apis/ads/publisher/v201405/ReconciliationReportService?wsdl")
public class ReconciliationReportService
    extends Service
{

    private final static URL RECONCILIATIONREPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException RECONCILIATIONREPORTSERVICE_EXCEPTION;
    private final static QName RECONCILIATIONREPORTSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201405", "ReconciliationReportService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://www.google.com/apis/ads/publisher/v201405/ReconciliationReportService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RECONCILIATIONREPORTSERVICE_WSDL_LOCATION = url;
        RECONCILIATIONREPORTSERVICE_EXCEPTION = e;
    }

    public ReconciliationReportService() {
        super(__getWsdlLocation(), RECONCILIATIONREPORTSERVICE_QNAME);
    }

    public ReconciliationReportService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ReconciliationReportServiceInterface
     */
    @WebEndpoint(name = "ReconciliationReportServiceInterfacePort")
    public ReconciliationReportServiceInterface getReconciliationReportServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201405", "ReconciliationReportServiceInterfacePort"), ReconciliationReportServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReconciliationReportServiceInterface
     */
    @WebEndpoint(name = "ReconciliationReportServiceInterfacePort")
    public ReconciliationReportServiceInterface getReconciliationReportServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201405", "ReconciliationReportServiceInterfacePort"), ReconciliationReportServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RECONCILIATIONREPORTSERVICE_EXCEPTION!= null) {
            throw RECONCILIATIONREPORTSERVICE_EXCEPTION;
        }
        return RECONCILIATIONREPORTSERVICE_WSDL_LOCATION;
    }

}
