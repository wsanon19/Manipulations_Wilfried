package tp1progreseau;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Mainclient {
	
	public static void main (String[] args) {

	    try{
	        Socket s = new Socket("127.0.0.1", 1500);
	        PrintWriter out=new PrintWriter(s.getOutputStream(),true);
	        ListeningThread T = new ListeningThread(s);
	        T.start();
	        System.out.println("Connexion reussi!");
	        Scanner sc = new Scanner(System.in);
	        String message= " ";	
	        
	        while (!message.equals("quit") ) {
	        	message=sc.nextLine();
	        	out.println(message);
	        }
	        
	        System.out.println("Connexion abandonne");
	        sc.close();
	        s.close();
	        }catch(Exception exception){
	        	
	        
	        }
	    
	}

}
