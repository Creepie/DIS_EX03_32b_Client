
package eberthClient.generate;

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
 * JAX-WS RI 2.3.3-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "OpenWeatherService", targetNamespace = "http://eberth/", wsdlLocation = "http://localhost:8081/OpenWeather?wsdl")
public class OpenWeatherService
    extends Service
{

    private final static URL OPENWEATHERSERVICE_WSDL_LOCATION;
    private final static WebServiceException OPENWEATHERSERVICE_EXCEPTION;
    private final static QName OPENWEATHERSERVICE_QNAME = new QName("http://eberth/", "OpenWeatherService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/OpenWeather?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OPENWEATHERSERVICE_WSDL_LOCATION = url;
        OPENWEATHERSERVICE_EXCEPTION = e;
    }

    public OpenWeatherService() {
        super(__getWsdlLocation(), OPENWEATHERSERVICE_QNAME);
    }

    public OpenWeatherService(WebServiceFeature... features) {
        super(__getWsdlLocation(), OPENWEATHERSERVICE_QNAME, features);
    }

    public OpenWeatherService(URL wsdlLocation) {
        super(wsdlLocation, OPENWEATHERSERVICE_QNAME);
    }

    public OpenWeatherService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OPENWEATHERSERVICE_QNAME, features);
    }

    public OpenWeatherService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OpenWeatherService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EnvironmentData
     */
    @WebEndpoint(name = "OpenWeatherPort")
    public EnvironmentData getOpenWeatherPort() {
        return super.getPort(new QName("http://eberth/", "OpenWeatherPort"), EnvironmentData.class);
    }

    /**
     * 
     * @param features
     *     A list of {&#064;link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the &lt;code&gt;features&lt;/code&gt; parameter will have their default values.
     * @return
     *     returns EnvironmentData
     */
    @WebEndpoint(name = "OpenWeatherPort")
    public EnvironmentData getOpenWeatherPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://eberth/", "OpenWeatherPort"), EnvironmentData.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OPENWEATHERSERVICE_EXCEPTION!= null) {
            throw OPENWEATHERSERVICE_EXCEPTION;
        }
        return OPENWEATHERSERVICE_WSDL_LOCATION;
    }

}