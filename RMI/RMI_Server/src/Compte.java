import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class Compte extends UnicastRemoteObject implements ICompte {
    private double balance;
    private String name;
    private int age;


    protected Compte() throws RemoteException {
    }

    protected Compte(int port) throws RemoteException {
        super(port);
    }

    protected Compte(int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
        super(port, csf, ssf);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public double credit(double _credit){
        balance = balance + _credit;
        return balance;
    }

    @Override
    public double debit(double _debit) {
        balance =  balance - _debit;
        return balance ;
    }

    @Override
    public double solde(){
        return balance;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
