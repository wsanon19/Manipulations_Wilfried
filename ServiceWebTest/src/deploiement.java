import javax.xml.ws.Endpoint;

public class deploiement {

    public static void main(String[] args) {

        String url = "http://localhost:8787/";
        Endpoint.publish(url, new monServiceTest() );

        System.out.println("WSDL accessible a l'adrese " + url + "?wsdl" );
    }

}
