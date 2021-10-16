package tp1progreseau;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;



public class ThreadChat extends Thread {
	
	int id;
	BufferedReader in;
	PrintWriter out;
	static PrintWriter[] outs = new PrintWriter[100];
	static int nbid=0;
	
	public ThreadChat(int id, Socket client) {
		try {
			this.id = id;
			nbid++;
			in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			out = new PrintWriter(client.getOutputStream(),true);
			out.println("Id"+ id + "\n");  //Envoie au client de son id 
			outs[id] = out; //stockage dans le taleaux des flux le point de sortie du flux actuel (socket)
		
		
	} catch(Exception e){}
}
	
	
	
	public void run() {
		try {
			
			while (true) {
				String message = in.readLine();//**
				
				
				if (message.equals("quit")) break;
				
				else if (message.substring(0,3).equals("_id")) {
					
					if (message.substring(3,4).equals("1") ) {
						message = id+":"+ message.substring(4);
						System.out.println(message);
						outs[1].println(message);						
					}
					
					else if (message.substring(3,4).equals("2") ) {
						message = id+":"+ message.substring(4);
						System.out.println(message);
						outs[2].println(message);						
					}

				}
				
				
				else {
					message=id+":"+message; 
					System.out.println(message);// afficher le message recu par le client id
					
					
					for(int i=0; i<nbid; i++) { // Envoie du message a tous les utilisateurs connecte
						if (i!=id)outs[i].println(message);
					}
					}
				
				
			}
			System.out.println("Serveur ferme");
			
		}catch(Exception e){}
		
	}
	//Un flux a un out et un in . Ce quenvoie out , in recois forcement.
	// Chaque instance ThreadChat cree un flux (in et out ) 
	//A partir du in ** , le thread capte le message de linstance de threadchat l38,
	//affiche cote serveur l39-40
	//renvoie a toute les instances boucle for l41 en utilisant les out de chaque instance
	// les out de chaque instances sont stocker dans outs l27
	//Pourquoi lancer thread chat lance main client ??????????
	
	//chaque instance de thread es comme une fenetre qui es ouverte a cote et qui continue de tourner indefiniment 
	
}

