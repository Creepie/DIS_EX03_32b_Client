package eberthClient;

import eberthClient.generate.EnvData;
import eberthClient.generate.EnvironmentData;
import eberthClient.generate.OpenWeatherService;

public class ClientA {

    public static void main(String[] args) {
        OpenWeatherService srv = new OpenWeatherService();
        EnvironmentData soap = srv.getOpenWeatherPort();
        System.out.println("server --> " + soap.requestEnvironmentDataTypes());
        String[] locations = soap.requestEnvironmentDataTypes().toArray(new String[0]);

        for (int i = 0; i<locations.length; i++){
            System.out.println("server --> "+ locations[i] +" fells like: " + soap.getData(locations[i]).getFeelsLike());
        }
    }
}
