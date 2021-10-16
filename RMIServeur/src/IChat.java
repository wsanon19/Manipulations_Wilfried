import java.net.Socket;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IChat extends Remote { //Les paramètres position devront etre envoyer par le serveur
//    public String sendBroadChat(String msg) throws RemoteException;
    public void  sendChat(String name, String msg) throws RemoteException;
    public String getMessage(String name) throws RemoteException;
    public int nbChat() throws RemoteException;
    public void connectUser(String name) throws RemoteException;
}
