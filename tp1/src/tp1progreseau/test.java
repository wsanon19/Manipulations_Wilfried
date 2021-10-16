package tp1progreseau;

import java.util.Scanner;

public class test {
	
	public static void main (String[] args) {
		
		try {
			
			Scanner sc = new Scanner(System.in);
	        String message= " ";
	        System.out.println("Entrer une valeur ");
	        message = sc.nextLine();
	        
	        String commm = "att";
	        
	        if (!message.equals(commm)) throw new Exception();
	
        
		}catch (Exception exception) {
			System.out.println("Voulez vous vraiment quitter");
		
		}
		
		
	}
        

}
