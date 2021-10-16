import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Server extends UnicastRemoteObject implements IChat {

    private String name;
    private int nbchatsend;
    private ArrayList<String> clientList;  //L'indice de chaque client dans cette table est celle de son message dams la
    private ArrayList<String> messages ;  // table message

    public Server() throws RemoteException {

    }

    public Server(String name) throws RemoteException {
        messages = new ArrayList<String>() ;
        clientList = new ArrayList<String>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getClientList() {
        return clientList;
    }

    public ArrayList<String> getMessages() {
        return messages;
    }

    @Override
    public synchronized void sendChat(String name,String msg) throws RemoteException {

        int k = clientList.indexOf(name);
        messages.set(k, "["+this.name+"] "+msg);

        nbchatsend++;
    }

    @Override
    public synchronized String getMessage(String name) throws RemoteException {
        int k = clientList.indexOf(name);

        return messages.get(k);
    }

    @Override
    public int nbChat() throws RemoteException {
        return nbchatsend;
    }

    @Override
    public void connectUser(String name) throws RemoteException {
        clientList.add(name);
        messages.add(" ");
    }

    public static void main(String[] args) {

        try {
            Server server = new Server("Global");

            server.connectUser("Wilfried");
            server.connectUser("Euloge");

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.createRegistry(9595);
            registry.bind("serveur", server);


            System.out.println("Server ready");
            System.out.println("["+server.getClientList().get(0)+"]");
            System.out.println("["+server.getClientList().get(1)+"]");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }

    }
}


