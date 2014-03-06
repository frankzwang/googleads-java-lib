
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
 *       Use the {@code MutateJobService} to schedule large batches of updates to
 *       your AdWords campaigns as asynchronous mutate jobs, and to retrieve the
 *       status, results or statistics of your recent jobs.
 *       
 *       <p>Use this service when you wish to release your application from actively
 *       waiting on a synchronous response. Your application can do other things or
 *       even shutdown while we execute mutations asynchronously.</p>
 *       
 *       <p>Requests to the service will fail if the request was invalid or if any of
 *       a job's structural constraints are violated, and depending on the operation,
 *       the job will not get created or updated.</p>
 *       <p>
 *       Once a job has been submitted, you may check its status periodically, by
 *       calling {@link #get}.</p>
 *       <p class="caution"><b>Caution:</b>
 *       Do not poll the job status too frequently or you will risk getting your
 *       customer rate-limited.</p>
 *       
 *       <p>Once a job's status changes to {@code COMPLETED}, you can retrieve the
 *       job's results.</p>
 *       
 *       <p>A job can fail even after it has been accepted for processing. For
 *       example, a job may fail if the system experienced too many transient errors.
 *       In this scenario, the job will get a status of {@code FAILED} and will
 *       stop processing.</p>
 *       
 *       <p>The submitted operations are processed in batches for efficiency. Each
 *       batch is processed atomically so that either all of them have successful
 *       results, or they all fail with a failure result for the entire batch.</p>
 *       
 *       <p>Normally, jobs could be processed in parallel. This may cause concurrent
 *       mutations to the same entities to fail, though these would be retried later,
 *       see below. If you want to serialize the processing of jobs, you could
 *       specify prerequisites through the optional {@link JobPolicy}.</p>
 *       
 *       <p>You may choose to avoid submitting a new job for mutating an entity while
 *       another job for the same entity has not completed yet.</p>
 *       
 *       <p>The service will keep retrying operations when transient failures occur.
 *       However, if these failures persist for several hours or more serious ones
 *       occur, the service will abort a job leaving some or all of its operations
 *       unprocessed.</p>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "MutateJobServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MutateJobServiceInterface {


    /**
     * 
     *         Query the status of existing jobs, both simple and bulk API.
     *         <p>Use a {@link JobSelector} to query and return a list which may
     *         contain both {@link BulkMutateJob} and/or {@link SimpleMutateJob}.</p>
     *       
     * 
     * @param selector
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201402.cm.Job>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.MutateJobServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.MutateJobServiceInterfacegetResponse")
    public List<Job> get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
        JobSelector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Query mutation results, of a {@code COMPLETED} job.
     *         <p>Use a {@link JobSelector} to query and return either a
     *         {@link BulkMutateResult} or a {@link SimpleMutateResult}. Submit only one job ID
     *         at a time.</p>
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201402.cm.JobResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
    @RequestWrapper(localName = "getResult", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.MutateJobServiceInterfacegetResult")
    @ResponseWrapper(localName = "getResultResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.MutateJobServiceInterfacegetResultResponse")
    public JobResult getResult(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
        JobSelector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Simplified way of submitting a mutation job. The provided list of
     *         operations, if valid, will create a new job with a unique id, which will
     *         be returned. This id can later be used in invocations of
     *         {@link #get} and {@link #getResult}. Policy can optionally be specified.
     *         
     *         <p>When this method returns with success, the job will be in
     *         {@code PROCESSING} or {@code PENDING} state and no further action is
     *         needed for the job to get executed.</p>
     *       
     * 
     * @param policy
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201402.cm.SimpleMutateJob
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.MutateJobServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.MutateJobServiceInterfacemutateResponse")
    public SimpleMutateJob mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
        List<Operation> operations,
        @WebParam(name = "policy", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
        BulkMutateJobPolicy policy)
        throws ApiException_Exception
    ;

}
