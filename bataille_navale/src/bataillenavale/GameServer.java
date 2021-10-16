package bataillenavale;

import java.net.ServerSocket;
import java.net.Socket;

 

public class GameServer {
	public static void main (String[] args) {
        try{
            ServerSocket bataill = new ServerSocket(1500);//ecoute es un serveur de socket 
            System.out.println(" Bataille Navale ! ");//des quil ya connexion sur le serveur ecoute, il laccepte et stok la socket dans client
    

//            while(true){ 
            	
            	System.out.println("En attente de connexion des deux joueurs : ");
            	Socket cl_1 = bataill.accept();//des quil ya connexion sur le serveur ecoute, il laccepte et stok la socket dans client
            	System.out.println("Joueur 1 accepte ! En attente d'un second joueur : ");
            	Socket cl_2 = bataill.accept();
            	System.out.println("Joueur 2 accepte ! La partie peut demarrer ");
            	new ThreadServer(cl_1,cl_2).start();//cette socket va etre passer en argument dans le thread chat avec id et lance le code de thrat chat
            	System.out.println("******** La partie peut demarrer *********** ");
//            }

        } catch(Exception e) {
        }
}

}

//thraead chat cree une instance de classe et effectue le code de sa fonction main 
//id++;//id est incrementer
//La boucle reprends avec id = id + 1