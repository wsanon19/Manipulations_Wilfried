package tp1progreseau;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Serveur_TCP {
public static void main (String[] args) {
        
        try{
            ServerSocket ecoute = new ServerSocket(1234);

            while(true){
             Socket client = ecoute.accept();
             
             //2 Utilisation des Stream avec Scanner 
             
             BufferedReader in=
            		 new BufferedReader(new InputStreamReader(client.getInputStream()));
             
             PrintWriter out=new PrintWriter(client.getOutputStream(),true);
            
            Scanner entry = new Scanner(System.in);
            System.out.println("Quel est votre message au Client : ");
            String mot = entry.nextLine();
            
            out.println(mot);
            
            


            
            
            client.close();
            }
            } catch(Exception e){
            //Traitement d’erreur
            }

        
    }


}


/*Part 1
  OutputStream os = client.getOutputStream();
             InputStream is = client.getInputStream();
             
             String mot = "Bonjour Client !";

              os.write(mot.getBytes());

              for(int i=0 ; i<16 ; i++) {
      	        System.out.print((char) is.read());
      	        }
 */
