
package com.mycompany;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GDPface", targetNamespace = "http://gdp_service.mycompany.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GDPface {


    /**
     * 
     * @param arg0
     * @return
     *     returns double
     * @throws NoSuchCountryException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://gdp_service.mycompany.com/GDPface/getGdpRequest", output = "http://gdp_service.mycompany.com/GDPface/getGdpResponse", fault = {
        @FaultAction(className = NoSuchCountryException_Exception.class, value = "http://gdp_service.mycompany.com/GDPface/getGdp/Fault/NoSuchCountryException")
    })
    public double getGdp(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0)
        throws NoSuchCountryException_Exception
    ;

}
