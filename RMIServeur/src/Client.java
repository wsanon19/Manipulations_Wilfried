import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    private Client() {}

    public static void main(String[] args) {


        try {
            Registry registry = LocateRegistry.getRegistry(9595);
            IChat stub = (IChat) registry.lookup("serveur");
            stub.sendChat("Euloge","Bonjour");

            IChat client  = (IChat) registry.lookup("serveur");
            String response = stub.getMessage("Euloge");
            System.out.println( response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }

}

