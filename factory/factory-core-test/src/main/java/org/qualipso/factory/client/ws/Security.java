
package org.qualipso.factory.client.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "security", targetNamespace = "http://org.qualipso.factory.ws/service/security")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Security {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @throws SecurityServiceException_Exception
     */
    @WebMethod
    public void addSecurityRule(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2)
        throws SecurityServiceException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @throws SecurityServiceException_Exception
     */
    @WebMethod
    public void changeOwner(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1)
        throws SecurityServiceException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @throws SecurityServiceException_Exception
     */
    @WebMethod
    public void editSecurityRule(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2)
        throws SecurityServiceException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns org.qualipso.factory.client.ws.FactoryResource
     * @throws FactoryException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public FactoryResource findResource(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0)
        throws FactoryException_Exception
    ;

    /**
     * 
     * @return
     *     returns org.qualipso.factory.client.ws.StringArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public StringArray getResourceTypeList();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws SecurityServiceException_Exception
     */
    @WebMethod
    @WebResult(name = "security-policy", partName = "security-policy")
    public String getSecurityPolicy(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0)
        throws SecurityServiceException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getServiceName();

    /**
     * 
     * @param arg1
     * @param arg0
     * @throws SecurityServiceException_Exception
     */
    @WebMethod
    public void removeSecurityRule(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1)
        throws SecurityServiceException_Exception
    ;

}
