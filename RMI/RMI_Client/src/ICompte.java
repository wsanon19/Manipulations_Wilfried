import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICompte extends Remote {

    public double solde()  throws RemoteException;
    public double credit(double _credit)  throws RemoteException;
    public double debit(double _debit)  throws RemoteException;

}
