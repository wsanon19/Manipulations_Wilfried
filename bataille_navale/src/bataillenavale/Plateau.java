package bataillenavale;

import java.util.Arrays;
import java.util.Iterator;



public class Plateau {
	
	public int [][]  grille = new int[10] [10] ;
	
	public void plateau() {
	}

	
//	int [] porte_avion = new int[5];
//	int [] croiseur = new int[5];
//	int [] contre_croiseur = new int[3];
//	int [] sous_marin = new int[3];
//	int [] torpilleur = new int[2];
//	
	public void set_navire(String[] nav_coord) {
		
		int coord[] = new int [4];
		for(int j =0; j<4; j++) {
			coord[j] = Integer.parseInt(nav_coord[j]);
    	}
		
		
		if (coord[0]==coord[2]) {
			for (int i =coord[1]; i<coord[3]+1;i++) {
				grille[ coord[0] ][i] =1;
			}
			
		}
		
		else if (coord[1]==coord[3]){
			for (int i =coord[0]; i<coord[2]+1;i++) {
				grille[i] [ coord[1] ] = 1;
			}
			
		}
		
		else {
			System.out.println("Impossible de placer");
		}
	}
	
	
	//Afficher le plateau
	public String afficherPlateau() {
		String str = "";
		for (int i=0; i<this.grille.length; i++) {
			
			for(int j=0; j<this.grille.length; j++) {
				str += "|" + grille[i][j];}
			str += "\n";
		}
		
		return str;
	}
	
	
	//Verifier si tous les bateaux sont K.O renvoie TRUE si oui.
	public boolean checkDestruct() {
		int detruit=0;
		
		for (int i=0; i<this.grille.length; i++) {
			
			for(int j=0; j<this.grille.length; j++) {
				if (this.grille[i][j]==0) detruit++; 
			}
		
		}
		
		if (detruit == 100) return true;
		else return false ;
	}
	
	
	//Verifier si tous les bateaux sont K.O renvoie TRUE si oui.
	public boolean checkConfig(int navires) {
		int nav=0;
		
		for (int i=0; i<this.grille.length; i++) {
			
			for(int j=0; j<this.grille.length; j++) {
				if (this.grille[i][j]== 1) nav++; 
			}
		
		}
		
		if (nav == navires) return true;
		else return false ;
	}
	
		
	
	
	public static void main (String[] args) {
		

		
	
//		
//		Plateau test = new Plateau();
//		
//		int [] coo = {0,0,3,0};
//		
//		test.set_navire(coo);
//		
//		System.out.println(test.afficherPlateau());
//		
//		String src = "/config,7";
//	//
//		
//		
//		//System.out.println(Integer.parseInt(treat_tab[0]) + " et " + Integer.parseInt(treat_tab[1]) );
//		System.out.println(src.split(",")[0]);
		
//		//test
//		String mess_cl1 = "/config,1,2,3,4";
//		String [] tab = mess_cl1.split(",");
//		
//		if(tab[0].equals("/config")) {
//			
//			String [] coop = Arrays.copyOfRange(tab, 1, tab.length); 
//			int treat[] = new int [4];
//			
//			for(int j =0; j<4; j++) {
//        		treat[j] = Integer.parseInt(coop[j]);
////        		System.out.println( treat[j] ) ;
//        	}
//		}
		
		Plateau test = new Plateau();
//		String[] coo = new String [] {"1","1","1","9"};
//		test.set_navire(coo);
	
		System.out.println(test.afficherPlateau()); 
		System.out.println(test.checkDestruct());
	

		

	
}}


	
