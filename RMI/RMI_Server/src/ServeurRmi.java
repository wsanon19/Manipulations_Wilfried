import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServeurRmi {
    public static void main(String[] args) {
        try {

            LocateRegistry.createRegistry(9191);
            Compte compte = new Compte();
            compte.setAge(18);
            compte.setName("Wilfried");
            compte.setBalance(12765);
            Naming.rebind("rmi://localhost:9191/Banque", compte);

            System.out.println(compte.toString());

        }catch (Exception ex) {
            Logger.getLogger(ServeurRmi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
