/**
 * WorkflowRequestServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201405;

public class WorkflowRequestServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.dfp.axis.v201405.WorkflowRequestService {

    public WorkflowRequestServiceLocator() {
    }


    public WorkflowRequestServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WorkflowRequestServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WorkflowRequestServiceInterfacePort
    private java.lang.String WorkflowRequestServiceInterfacePort_address = "https://www.google.com/apis/ads/publisher/v201405/WorkflowRequestService";

    public java.lang.String getWorkflowRequestServiceInterfacePortAddress() {
        return WorkflowRequestServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WorkflowRequestServiceInterfacePortWSDDServiceName = "WorkflowRequestServiceInterfacePort";

    public java.lang.String getWorkflowRequestServiceInterfacePortWSDDServiceName() {
        return WorkflowRequestServiceInterfacePortWSDDServiceName;
    }

    public void setWorkflowRequestServiceInterfacePortWSDDServiceName(java.lang.String name) {
        WorkflowRequestServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.dfp.axis.v201405.WorkflowRequestServiceInterface getWorkflowRequestServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WorkflowRequestServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWorkflowRequestServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.dfp.axis.v201405.WorkflowRequestServiceInterface getWorkflowRequestServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.dfp.axis.v201405.WorkflowRequestServiceSoapBindingStub _stub = new com.google.api.ads.dfp.axis.v201405.WorkflowRequestServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWorkflowRequestServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWorkflowRequestServiceInterfacePortEndpointAddress(java.lang.String address) {
        WorkflowRequestServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.dfp.axis.v201405.WorkflowRequestServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.dfp.axis.v201405.WorkflowRequestServiceSoapBindingStub _stub = new com.google.api.ads.dfp.axis.v201405.WorkflowRequestServiceSoapBindingStub(new java.net.URL(WorkflowRequestServiceInterfacePort_address), this);
                _stub.setPortName(getWorkflowRequestServiceInterfacePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WorkflowRequestServiceInterfacePort".equals(inputPortName)) {
            return getWorkflowRequestServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "WorkflowRequestService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "WorkflowRequestServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WorkflowRequestServiceInterfacePort".equals(portName)) {
            setWorkflowRequestServiceInterfacePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
