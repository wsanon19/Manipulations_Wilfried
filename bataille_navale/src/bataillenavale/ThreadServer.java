package bataillenavale;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Arrays;

public class ThreadServer extends Thread {
	
	BufferedReader in_cl1, in_cl2;
	PrintWriter out_cl1, out_cl2;
	Plateau p_cl1 = new Plateau();
	Plateau p_cl2 = new Plateau();
	
	
	public ThreadServer(Socket cl_1,Socket cl_2) {
		try {
			in_cl1 = new BufferedReader(new InputStreamReader(cl_1.getInputStream()));
			out_cl1 = new PrintWriter(cl_1.getOutputStream(),true);
			
			in_cl2 = new BufferedReader(new InputStreamReader(cl_2 .getInputStream()));
			out_cl2 =new PrintWriter(cl_2.getOutputStream(),true);
					
			} catch(Exception e){}
}
	
	public void run() {
		
		try {
			
			//$$$$$$$$$$$$  Config J1  $$$$$$$$$$$$$$$$$
			System.out.println("J1 Veuillez entrer vos navires !");
			while (!p_cl1.checkConfig(18)) {
				String mess_cl1 = in_cl1.readLine();
				String [] mess_1 = mess_cl1.split(",");
		
					//Verifie qu'on configure un bateau 
					if(mess_1[0].equals("/config")) {
					//retirer le "/config" du tableau pour ne laisser que les coordonnees 
						String [] navire_string = Arrays.copyOfRange(mess_1, 1, mess_1.length);
						out_cl1.println(navire_string);
	
					//entrer le navire sur le plateau
						p_cl1.set_navire(navire_string);
						System.out.println(p_cl1.afficherPlateau());
					}
			}
			out_cl1.println("/finconfig"); //Envoie fin config au client pour qu'il quitte la boucle de configuration
			

			//$$$$$$$$$$$$  Config J2  $$$$$$$$$$$$$$$$$
			System.out.println("J2 Veuillez entrer vos navires !");
			while (!p_cl2.checkConfig(18)) {
			String mess_cl2 = in_cl2.readLine();
			String [] mess_2 = mess_cl2.split(",");
			
				if(mess_2[0].equals("/config")) {
				//retirer le "/config" du tableau pour ne laisser que les coordonnees 
					String [] navire_string = Arrays.copyOfRange(mess_2, 1, mess_2.length);
	
				//entrer le navire sur le plateau
					p_cl2.set_navire(navire_string);
					System.out.println(p_cl1.afficherPlateau());
				}
			}
			
			
			
			//$$$$$$$$$$$$  Jeu  $$$$$$$$$$$$$$$$$
			while ( !p_cl1.checkDestruct() && !p_cl2.checkDestruct()) {
				System.out.println("La partie peut demarrer !");
				
				//Envoie autor J1 Attaque 
				//Recevoir les coo 
				//MAJ des plateaux game et J2 
				//Envoie dinformations a J2
				//Envoie confir de traitement A j1 
				
				
				//Reprise de la procedure pour J2 
				
			}
			//Nous avons un gagnant 
			
			//Avertir les joueurs 
			out_cl1.println("/fingame");
			out_cl2.println("/fingame");
			
			//$$$$$$$$$$$$  Annonce Vainqueur  $$$$$$$$$$$$$$$$$
			if (!p_cl1.checkDestruct()) {
				System.out.println("Joueur 1 vous remporter la partie !!!");
				out_cl1.println("Vous gagner la partie ");
			}
			
			if (!p_cl2.checkDestruct()) {
				
				System.out.println("Joueur 2 vous remporter la partie !!!");
				out_cl2.println("Vous gagner la partie ");
				}
			System.out.println("************   Felicitations !!!   ************");
			
			
			//Fermeture des scanner , des flux et de la socket 
		} catch (Exception e) {
		}
		
		
		
	
	}
	
	
	

}
