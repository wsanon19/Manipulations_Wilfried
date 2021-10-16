package bataillenavale;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	public static Plateau mon_plateau = new Plateau() ;
	public static Plateau game_plateau = new Plateau();
	
	public static void main (String[] args) {

	    try{
	    	//$$$$$$$$$$$$$$$$ Connexion a la session $$$$$$$$$$$$$$$$
	        Socket s = new Socket("127.0.0.1", 1500);
	        BufferedReader in=
           		 new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out=new PrintWriter(s.getOutputStream(),true);
            Scanner lecture =  new Scanner(System.in);
            
            //$$$$$$$$$$$$$$$$ Parametrage des plateaux $$$$$$$$$$$$$$$$ 
            System.out.println("********* Bienvenue dans la partie ! **************");
           
            
            //Juste pour l'affichage
            String[] navire_tab = {"porte_avion(5)", "croiseur(5)", "contre_croiseur(3)", "sous_marin(3)", "torpilleur(2)"}; 
            int i = 0;
            
            //Configuranton de son plateau
            String coo ;  
	        while (!in.readLine().equals("/finconfig")) { //on place 6 bateaux
	           System.out.println("Entrer les coordoones du 1er et du dernier point du " + navire_tab[i] + "" );
	           System.out.println("Separer les coordonne par une virgule (li,ci,lf,cf)" );
	           System.out.println(navire_tab[i]);
	           coo = lecture.nextLine();
	            	
	            	//Envoyer les donnes au serveur 
	           out.println("/config," + coo );
	            	
	            	//Configurer le plateau en local - entrer le navire sur le plateau
	           String [] navire = coo.split(",");
	           mon_plateau.set_navire(navire);
	           System.out.println(mon_plateau.afficherPlateau());
	           System.out.println(navire_tab[i] + " bien place");
	           i++;
	         }

            System.out.println("Pret !");
            
            
            // $$$$$$$$$$$$$$$$$ Attaque $$$$$$$$$$$$$$$$$
            String attaque;
            while (!in.readLine().equals("/fingame")){
            	System.out.println("********* C'est partie ! ************** \n");
            	
            	//Attendre autorisation de jouer du serveur  
            	
            	System.out.println("Quel point voulez vous attaquer (ligne,colonne) :" );
            	attaque = lecture.nextLine();
            	//Envoyer les donnes au serveur 
            	out.println(attaque);
            	
            	//MAJ des plateaux cote serveur 
            	//Attendre retour ok de la part du serveur pour configurer en local 
            	
            	
            	//MAJ des plateuax cote client 
            	
 	           
            }
            
            
            

 
//	        s.close();
	        }catch(Exception e){
	        //Traitement d’erreur
	        }

}
	}
