
package com.ayit.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ICustomerService", targetNamespace = "http://service.ayit.com/")
@XmlSeeAlso({
   
})
public interface ICustomerService {


    /**
     * 
     * @return
     *     returns java.util.List<com.ayit.client.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findCustomerNotAssociation", targetNamespace = "http://service.ayit.com/", className = "com.ayit.client.FindCustomerNotAssociation")
    @ResponseWrapper(localName = "findCustomerNotAssociationResponse", targetNamespace = "http://service.ayit.com/", className = "com.ayit.client.FindCustomerNotAssociationResponse")
    public List<Customer> findCustomerNotAssociation();

    /**
     * 
     * @return
     *     returns java.util.List<com.ayit.client.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://service.ayit.com/", className = "com.ayit.client.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://service.ayit.com/", className = "com.ayit.client.FindAllResponse")
    public List<Customer> findAll();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findDecidedzoneIdByAddress", targetNamespace = "http://service.ayit.com/", className = "com.ayit.client.FindDecidedzoneIdByAddress")
    @ResponseWrapper(localName = "findDecidedzoneIdByAddressResponse", targetNamespace = "http://service.ayit.com/", className = "com.ayit.client.FindDecidedzoneIdByAddressResponse")
    public String findDecidedzoneIdByAddress(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "assigncustomerstodecidedzone", targetNamespace = "http://service.ayit.com/", className = "com.ayit.client.Assigncustomerstodecidedzone")
    @ResponseWrapper(localName = "assigncustomerstodecidedzoneResponse", targetNamespace = "http://service.ayit.com/", className = "com.ayit.client.AssigncustomerstodecidedzoneResponse")
    public void assigncustomerstodecidedzone(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        List<Integer> arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.ayit.client.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findCustomerAssociation", targetNamespace = "http://service.ayit.com/", className = "com.ayit.client.FindCustomerAssociation")
    @ResponseWrapper(localName = "findCustomerAssociationResponse", targetNamespace = "http://service.ayit.com/", className = "com.ayit.client.FindCustomerAssociationResponse")
    public List<Customer> findCustomerAssociation(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.ayit.client.Customer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findCustomerByTelephone", targetNamespace = "http://service.ayit.com/", className = "com.ayit.client.FindCustomerByTelephone")
    @ResponseWrapper(localName = "findCustomerByTelephoneResponse", targetNamespace = "http://service.ayit.com/", className = "com.ayit.client.FindCustomerByTelephoneResponse")
    public Customer findCustomerByTelephone(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
