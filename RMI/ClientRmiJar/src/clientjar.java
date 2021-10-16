import java.rmi.Naming;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class clientjar {
    public static void main(String[] args) {
        try {
            Compte_Stub stub = (Compte_Stub)
                    Naming.lookup("rmi://localhost:9090/Banque");
            System.out.println("Votre solde est de : " + stub.solde() );
            System.out.println("Vous avez droit a 6 opération !");
            System.out.println("Selectionner 1 pour créditer et 2 pour débiter :");
            Scanner op = new Scanner(System.in);
            int i =0;
            while (i < 6) {
                int test = op.nextInt();
                if (test == 1){
                    System.out.println("Veuiller entrer le montant :");
                    int montant = op.nextInt();
                    System.out.println("Votre compte a bien ete credité");
                    System.out.println("Votre solde désormais est de "+  stub.credit(montant));
                }
                else if (test == 2){
                    System.out.println("Veuiller entrer le montant :");
                    int montant = op.nextInt();
                    System.out.println("Votre compte a bien ete debité");
                    System.out.println("Votre solde désormais est de "+ stub.debit(montant));
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
