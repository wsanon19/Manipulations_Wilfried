package tp1progreseau;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;



public class Client_TCP {
	
	public static void main (String[] args) {

	    try{
	        Socket s =
	        new Socket("127.0.0.1", 1234);
	        
	      
	        
	        
	        //2 Utilisation des Stream avec Scanner 
	        
	        BufferedReader in=
           		 new BufferedReader(new InputStreamReader(s.getInputStream()));
            
            PrintWriter out=new PrintWriter(s.getOutputStream(),true);
	        
            System.out.println("Quel est votre message au Serveur : ");
            Scanner entry = new Scanner(System.in);
            String mot = entry.nextLine();
            
	        out.println(mot);
	        
	        System.out.println(in.readLine());  
	        
	        s.close();
	        }catch(Exception e){
	        //Traitement d’erreur
	        }


	}

}


/* Part1
OutputStream os =
s.getOutputStream();

InputStream is =
s.getInputStream();

String rep = "Bonjour Server!";

os.write(rep.getBytes());

 for(int i=0 ; i<15 ; i++) {
System.out.print((char) is.read());
}
 */