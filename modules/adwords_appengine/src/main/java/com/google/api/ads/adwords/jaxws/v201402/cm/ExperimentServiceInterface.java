
package com.google.api.ads.adwords.jaxws.v201402.cm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Use this service to set up campaign experiments which let you accurately
 *       test and measure changes to your keywords, bids, ad groups and placements.
 *       Creating and running a campaign experiment involves the following steps:
 *       
 *       <ol>
 *       <li>Creating an {@link Experiment} object that describes the experiment
 *       itself, including the experiment ID, date range, and the percentage of
 *       traffic that will be directed to the experiment.</li>
 *       
 *       <li>Setting up control and experimental campaign entities by setting the
 *       {@code experimentData} field on {@link AdGroup} and {@link
 *       BiddableAdGroupCriterion} objects. Use the {@link
 *       AdGroup#experimentDataStatus experimentDataStatus} field to choose if the
 *       entity should be part of a control group, part of the experiment group, or
 *       if the entity should handle both control and experimental traffic.</li>
 *       </ol>
 *       
 *       <p>
 *       For more information on campaign experiments, including
 *       tracking the performance of an experiment, see the <a href=
 *       "//support.google.com/adwords/bin/topic.py?topic=1713979">AdWords Help Center</a>.
 *       </p>
 *       <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ExperimentServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ExperimentServiceInterface {


    /**
     * 
     *         Returns a list of experiments specified by the experiment selector from
     *         the customer's account.
     *         @param serviceSelector The selector specifying the {@link Experiment}s to return.
     *         If selector is empty, all experiments are returned.
     *         @return List of experiments meeting all the criteria of each selector.
     *         @throws ApiException if problems occurred while fetching experiment information.
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201402.cm.ExperimentPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.ExperimentServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.ExperimentServiceInterfacegetResponse")
    public ExperimentPage get(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
        Selector serviceSelector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Mutates (add, update or remove) experiments.
     *         <b>Note:</b> To REMOVE use SET and mark status to DELETED.
     *         @param operations A list of unique operations.
     *         The same experiment cannot be specified in more than one operation.
     *         @return The updated experiments. The list of experiments is returned in
     *         the same order in which it came in as input.
     *         @throws ApiException if problems occurred while updating experiment information.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201402.cm.ExperimentReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.ExperimentServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.ExperimentServiceInterfacemutateResponse")
    public ExperimentReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
        List<ExperimentOperation> operations)
        throws ApiException_Exception
    ;

}
