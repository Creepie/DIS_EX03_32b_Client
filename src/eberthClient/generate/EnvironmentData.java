
package eberthClient.generate;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EnvironmentData", targetNamespace = "http://eberth/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EnvironmentData {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "saySomething", targetNamespace = "http://eberth/", className = "eberthClient.generate.SaySomething")
    @ResponseWrapper(localName = "saySomethingResponse", targetNamespace = "http://eberth/", className = "eberthClient.generate.SaySomethingResponse")
    @Action(input = "http://eberth/EnvironmentData/saySomethingRequest", output = "http://eberth/EnvironmentData/saySomethingResponse")
    public String saySomething();

    /**
     * 
     * @return
     *     returns java.util.List&lt;java.lang.String&gt;
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "requestEnvironmentDataTypes", targetNamespace = "http://eberth/", className = "eberthClient.generate.RequestEnvironmentDataTypes")
    @ResponseWrapper(localName = "requestEnvironmentDataTypesResponse", targetNamespace = "http://eberth/", className = "eberthClient.generate.RequestEnvironmentDataTypesResponse")
    @Action(input = "http://eberth/EnvironmentData/requestEnvironmentDataTypesRequest", output = "http://eberth/EnvironmentData/requestEnvironmentDataTypesResponse")
    public List<String> requestEnvironmentDataTypes();

    /**
     * 
     * @param arg0
     * @return
     *     returns eberthClient.generate.EnvData
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getData", targetNamespace = "http://eberth/", className = "eberthClient.generate.GetData")
    @ResponseWrapper(localName = "getDataResponse", targetNamespace = "http://eberth/", className = "eberthClient.generate.GetDataResponse")
    @Action(input = "http://eberth/EnvironmentData/getDataRequest", output = "http://eberth/EnvironmentData/getDataResponse")
    public EnvData getData(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}