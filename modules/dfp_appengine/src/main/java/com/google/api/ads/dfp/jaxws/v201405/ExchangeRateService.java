
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
@WebServiceClient(name = "ExchangeRateService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405", wsdlLocation = "https://www.google.com/apis/ads/publisher/v201405/ExchangeRateService?wsdl")
public class ExchangeRateService
    extends Service
{

    private final static URL EXCHANGERATESERVICE_WSDL_LOCATION;
    private final static WebServiceException EXCHANGERATESERVICE_EXCEPTION;
    private final static QName EXCHANGERATESERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201405", "ExchangeRateService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://www.google.com/apis/ads/publisher/v201405/ExchangeRateService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EXCHANGERATESERVICE_WSDL_LOCATION = url;
        EXCHANGERATESERVICE_EXCEPTION = e;
    }

    public ExchangeRateService() {
        super(__getWsdlLocation(), EXCHANGERATESERVICE_QNAME);
    }

    public ExchangeRateService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ExchangeRateServiceInterface
     */
    @WebEndpoint(name = "ExchangeRateServiceInterfacePort")
    public ExchangeRateServiceInterface getExchangeRateServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201405", "ExchangeRateServiceInterfacePort"), ExchangeRateServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ExchangeRateServiceInterface
     */
    @WebEndpoint(name = "ExchangeRateServiceInterfacePort")
    public ExchangeRateServiceInterface getExchangeRateServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201405", "ExchangeRateServiceInterfacePort"), ExchangeRateServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EXCHANGERATESERVICE_EXCEPTION!= null) {
            throw EXCHANGERATESERVICE_EXCEPTION;
        }
        return EXCHANGERATESERVICE_WSDL_LOCATION;
    }

}
