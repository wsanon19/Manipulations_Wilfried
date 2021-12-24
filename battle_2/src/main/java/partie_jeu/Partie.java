package partie_jeu;


import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.servlet.http.HttpSession;

import personnages.Adversaire;
import personnages.Perso;

@Stateless
@LocalBean
public class Partie {
	
	private Perso j1;
	private Adversaire adv;
	
	
	public Partie() {
	};
	
	public Partie(Perso _j1, Adversaire _adv) {
		j1 = _j1;
		adv = _adv;
	}
	
	public void set_J(Perso _j) {
		this.j1 = _j;
	}

	
	
	
	/************* A l'appuie du boutton attaque **************/
	public float refresh_attack() { //J1 attaque l'adversaire.Les PV de l'adv sont MAJ et renvoyee2
		j1.attack(adv);
		return adv.getPV();
	}
	
	
	
	
	
	
	public float refresh_ripost() { //adv riposte on renvoie les PV de J1
		adv.attack(j1);
		return j1.getPV();
	}
	
	
	
	/************** A l'appuie du boutton Restaure **************/
	public float refresh_restaur() { //restauration on renvoie les PV de J1
		j1.restaur();
		return j1.getPV();
	}
	
	
	
	public boolean fin() {
		if (j1.is_dead() || adv.is_dead()) return true;
		else return false;
	}
	
	public boolean win() {
		if (j1.is_dead()) {
			adv.setLevel(adv.getLevel()+1);
			return true;
		}
		else return false;
		
	}
	
	
	public void attack(HttpSession masession) {
		float j_pA = (float) masession.getAttribute("j_pA");
		float adv_pV = (float) masession.getAttribute("adv_pV");
		float adv_pD = (float) masession.getAttribute("adv_pD");
		
		if ( adv_pD <  j_pA  ) {
			adv_pV  = adv_pV + adv_pD - j_pA;
			masession.setAttribute("adv_pV", adv_pV);
		}
	}
	
	public void ripost(HttpSession masession) {
		float pA = (float) masession.getAttribute("adv_pA");
		float j_pV = (float) masession.getAttribute("j_pV");
		float j_pD = (float) masession.getAttribute("j_pD");
		if ( j_pD <  pA  ) {
			j_pV  = j_pV + j_pD - pA;
			masession.setAttribute("j_pV", j_pV);
		}
		
	}
	
	public void restaur(HttpSession masession) {
		float j_pV = (float) masession.getAttribute("j_pV");
		j_pV += 0.1 * j_pV;
		masession.setAttribute("j_pV", j_pV);
	}

//	public void set_jProperties (String nm, float _pV, float _pA) {
//		this.j1.setName(nm);
//		this.j1.setPV(_pV);
//		this.j1.setPA(_pA);
//	}


//	public int getLevel() {
//		return level;
//	}
//
//
//	public void setLevel(int level) {
//		this.level = level;
//	}
//	
//	public void next_level () {
//		
//	}
	
	
	
	
	
	
	

}
