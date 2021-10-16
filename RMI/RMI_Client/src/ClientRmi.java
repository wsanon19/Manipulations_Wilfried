import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientRmi {
    public static void main(String[] args) {
        try {
            ICompte stub = (ICompte) Naming.lookup("rmi://localhost:9191/Banque");


            System.out.println("Votre solde est de : " + stub.solde() );
            System.out.println("Vous avez droit a 6 opération !");
            Scanner op = new Scanner(System.in);
            int i =0;
            while (i < 6) {
                System.out.println("\nSelectionner 1 pour créditer et 2 pour débiter :");
                int test = op.nextInt();
                if (test == 1){
                    System.out.println("Veuiller entrer le montant :");
                    int montant = op.nextInt();
                    stub.credit(montant);
                    System.out.println("Votre compte a bien ete credité");
                    System.out.println("Votre solde désormais est de "+ stub.solde() );
                }
                else if (test == 2){
                    System.out.println("Veuiller entrer le montant :");
                    int montant = op.nextInt();
                    stub.debit(montant);
                    System.out.println("Votre compte a bien ete debité");
                    System.out.println("Votre solde désormais est de "+ stub.solde() );
                }

                else{
                    System.out.println("Commande Invalide");
                }
                i++;
            }

            System.out.println("Merci pour la visite !");



        }catch (Exception ex) {
            Logger.getLogger(ClientRmi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
