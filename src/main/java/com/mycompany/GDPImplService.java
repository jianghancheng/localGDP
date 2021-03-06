
package com.mycompany;

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
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GDPImplService", targetNamespace = "http://gdp_service.mycompany.com/", wsdlLocation = "https://arcane-mesa-6923.herokuapp.com/gdp?wsdl")
public class GDPImplService
    extends Service
{

    private final static URL GDPIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException GDPIMPLSERVICE_EXCEPTION;
    private final static QName GDPIMPLSERVICE_QNAME = new QName("http://gdp_service.mycompany.com/", "GDPImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://arcane-mesa-6923.herokuapp.com/gdp?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GDPIMPLSERVICE_WSDL_LOCATION = url;
        GDPIMPLSERVICE_EXCEPTION = e;
    }

    public GDPImplService() {
        super(__getWsdlLocation(), GDPIMPLSERVICE_QNAME);
    }

    public GDPImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GDPIMPLSERVICE_QNAME, features);
    }

    public GDPImplService(URL wsdlLocation) {
        super(wsdlLocation, GDPIMPLSERVICE_QNAME);
    }

    public GDPImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GDPIMPLSERVICE_QNAME, features);
    }

    public GDPImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GDPImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GDPface
     */
    @WebEndpoint(name = "GDPImplPort")
    public GDPface getGDPImplPort() {
        return super.getPort(new QName("http://gdp_service.mycompany.com/", "GDPImplPort"), GDPface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GDPface
     */
    @WebEndpoint(name = "GDPImplPort")
    public GDPface getGDPImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://gdp_service.mycompany.com/", "GDPImplPort"), GDPface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GDPIMPLSERVICE_EXCEPTION!= null) {
            throw GDPIMPLSERVICE_EXCEPTION;
        }
        return GDPIMPLSERVICE_WSDL_LOCATION;
    }

}
