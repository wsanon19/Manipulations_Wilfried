
package fr.polyschool;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "monServiceTestService", targetNamespace = "www.polyschool.fr", wsdlLocation = "file:/Users/sanonwilfried/Desktop/Manipulations_Wilfried/Clientjava/src/MonServiceTestService.wsdl")
public class MonServiceTestService
    extends Service
{

    private final static URL MONSERVICETESTSERVICE_WSDL_LOCATION;
    private final static WebServiceException MONSERVICETESTSERVICE_EXCEPTION;
    private final static QName MONSERVICETESTSERVICE_QNAME = new QName("www.polyschool.fr", "monServiceTestService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/sanonwilfried/Desktop/Manipulations_Wilfried/Clientjava/src/MonServiceTestService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MONSERVICETESTSERVICE_WSDL_LOCATION = url;
        MONSERVICETESTSERVICE_EXCEPTION = e;
    }

    public MonServiceTestService() {
        super(__getWsdlLocation(), MONSERVICETESTSERVICE_QNAME);
    }

    public MonServiceTestService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MONSERVICETESTSERVICE_QNAME, features);
    }

    public MonServiceTestService(URL wsdlLocation) {
        super(wsdlLocation, MONSERVICETESTSERVICE_QNAME);
    }

    public MonServiceTestService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MONSERVICETESTSERVICE_QNAME, features);
    }

    public MonServiceTestService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MonServiceTestService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MonServiceTest
     */
    @WebEndpoint(name = "monServiceTestPort")
    public MonServiceTest getMonServiceTestPort() {
        return super.getPort(new QName("www.polyschool.fr", "monServiceTestPort"), MonServiceTest.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MonServiceTest
     */
    @WebEndpoint(name = "monServiceTestPort")
    public MonServiceTest getMonServiceTestPort(WebServiceFeature... features) {
        return super.getPort(new QName("www.polyschool.fr", "monServiceTestPort"), MonServiceTest.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MONSERVICETESTSERVICE_EXCEPTION!= null) {
            throw MONSERVICETESTSERVICE_EXCEPTION;
        }
        return MONSERVICETESTSERVICE_WSDL_LOCATION;
    }

}
