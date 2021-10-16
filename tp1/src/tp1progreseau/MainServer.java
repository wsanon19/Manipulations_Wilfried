package tp1progreseau;

import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
public static void main (String[] args) {
        try{
            ServerSocket ecoute = new ServerSocket(1500);//ecoute es un serveur de socket 
            System.out.println("Serveur lance");//des quil ya connexion sur le serveur ecoute, il laccepte et stok la socket dans client
            int id = 0;

            while(true){
            	Socket client = ecoute.accept();//des quil ya connexion sur le serveur ecoute, il laccepte et stok la socket dans client
            	new ThreadChat(id,client).start();//cette socket va etre passer en argument dans le thread chat avec id et lance le code de thrat chat
            	//thraead chat cree une instance de classe et effectue le code de sa fonction main 
            	id++;//id est incrementer
            	//La boucle reprends avec id = id + 1
            }

        } catch(Exception e) {
        }
}
}



