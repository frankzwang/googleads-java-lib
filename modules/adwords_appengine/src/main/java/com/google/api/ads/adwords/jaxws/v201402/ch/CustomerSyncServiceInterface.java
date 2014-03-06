
package com.google.api.ads.adwords.jaxws.v201402.ch;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Use this service to retrieve the changed entities for a customer account
 *       or campaign based on the given date range.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CustomerSyncServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/ch/v201402")
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201402.ch.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201402.cm.ObjectFactory.class
})
public interface CustomerSyncServiceInterface {


    /**
     * 
     *         Returns information about changed entities inside a customer's account.
     *         
     *         @param selector Specifies the filter for selecting changehistory events for a customer.
     *         @return A Customer->Campaign->AdGroup hierarchy containing information about the objects
     *         changed at each level.  All Campaigns that are requested in the selector will be returned,
     *         regardless of whether or not they have changed, but unchanged AdGroups will be ignored.
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201402.ch.CustomerChangeData
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/ch/v201402")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/ch/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.ch.CustomerSyncServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/ch/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.ch.CustomerSyncServiceInterfacegetResponse")
    public CustomerChangeData get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/ch/v201402")
        CustomerSyncSelector selector)
        throws ApiException
    ;

}
