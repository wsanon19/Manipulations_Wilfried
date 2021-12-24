package partie_jeu;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.servlet.http.HttpSession;

import personnages.Perso;

@Stateless
@LocalBean
public class Creation {
	Perso j_param = new Perso();

	public Creation() {
	}
	
	public void set_jProperties (String nm, String type) {
		this.j_param.setName(nm);
		this.j_param.setPV(100);
		
		if (type.equals("A")) {
			this.j_param.setPA(30);
			this.j_param.setPD(50);
		}
		
		else {
			this.j_param.setPA(50);
			this.j_param.setPD(30);
		}
		
	}
	
	public Perso getJ() {
		return this.j_param;
	}
	
	private float pV;
	private float pA;
	private float pD;
	
	public void creation_partie(HttpSession masession, String _name, float _attackUnit) {
		pV = 1000;
		pA = _attackUnit * 100 / 5;
		pD = (5 - _attackUnit) * 100 /5;
		String adv_name = "KRATOS";
		
		float adv_pA = 50 ; 
		float adv_pD = 50 ;
		float adv_lvl = 1 ;
		
		masession.setAttribute("j_name", _name);
		masession.setAttribute("j_pV", pV);
		masession.setAttribute("j_pA", pA);
		masession.setAttribute("j_pD", pD);
		
		masession.setAttribute("adv_name", adv_name);
		masession.setAttribute("adv_pV", pV);
		masession.setAttribute("adv_pA", adv_pA);
		masession.setAttribute("adv_pD", adv_pD);
		masession.setAttribute("adv_lvl", adv_lvl);
	}
	

}
