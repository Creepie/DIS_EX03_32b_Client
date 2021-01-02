package eberthClient;

import eberthClient.generate.EnvironmentData;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class ClientB {

    static EnvironmentData mSOAP;

    public static void main(String[] args) throws MalformedURLException {
        Service service = Service.create(
                new URL("http://localhost:8081/OpenWeather?wsdl"),
                new QName("http://eberth/",
                        "OpenWeatherService"));
        mSOAP = service.getPort(EnvironmentData.class);
        
        System.out.println(mSOAP.requestEnvironmentDataTypes());
        String[] locations = mSOAP.requestEnvironmentDataTypes().toArray(new String[0]);

        for(int i = 0; i<locations.length; i++){
            System.out.println("server --> "+ locations[i] +" fells like: " + mSOAP.getData(locations[i]).getFeelsLike());
        }
    }
}
