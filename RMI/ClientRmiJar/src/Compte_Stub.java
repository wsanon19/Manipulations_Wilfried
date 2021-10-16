//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.lang.reflect.Method;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.UnexpectedException;
import java.rmi.server.RemoteRef;
import java.rmi.server.RemoteStub;

public final class Compte_Stub extends RemoteStub implements ICompte, Remote {
    private static final long serialVersionUID = 2L;
    private static Method $method_credit_0;
    private static Method $method_debit_1;
    private static Method $method_solde_2;

    static {
        try {
            $method_credit_0 = (class$ICompte != null ? class$ICompte : (class$ICompte = class$("ICompte"))).getMethod("credit", Double.TYPE);
            $method_debit_1 = (class$ICompte != null ? class$ICompte : (class$ICompte = class$("ICompte"))).getMethod("debit", Double.TYPE);
            $method_solde_2 = (class$ICompte != null ? class$ICompte : (class$ICompte = class$("ICompte"))).getMethod("solde");
        } catch (NoSuchMethodException var0) {
            throw new NoSuchMethodError("stub class initialization failed");
        }
    }

    public Compte_Stub(RemoteRef var1) {
        super(var1);
    }

    public double credit(double var1) throws RemoteException {
        try {
            Object var3 = super.ref.invoke(this, $method_credit_0, new Object[]{new Double(var1)}, 1789876744206566254L);
            return (Double)var3;
        } catch (RuntimeException var4) {
            throw var4;
        } catch (RemoteException var5) {
            throw var5;
        } catch (Exception var6) {
            throw new UnexpectedException("undeclared checked exception", var6);
        }
    }

    public double debit(double var1) throws RemoteException {
        try {
            Object var3 = super.ref.invoke(this, $method_debit_1, new Object[]{new Double(var1)}, 2116414240947609511L);
            return (Double)var3;
        } catch (RuntimeException var4) {
            throw var4;
        } catch (RemoteException var5) {
            throw var5;
        } catch (Exception var6) {
            throw new UnexpectedException("undeclared checked exception", var6);
        }
    }

    public double solde() throws RemoteException {
        try {
            Object var1 = super.ref.invoke(this, $method_solde_2, (Object[])null, -2917528257077645031L);
            return (Double)var1;
        } catch (RuntimeException var2) {
            throw var2;
        } catch (RemoteException var3) {
            throw var3;
        } catch (Exception var4) {
            throw new UnexpectedException("undeclared checked exception", var4);
        }
    }
}
