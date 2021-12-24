package personnages;

public class Perso {

	protected float PV ;
	protected float PA;
	protected String name;
	protected float PD;
	
	

	public Perso() {
	}

	public Perso(float pV, float pA,float pD, String name) {
		super();
		PV = pV;
		PA = pA;
		PD = pD;
		this.name = name;
	}

	public float getPD() {
		return PD;
	}

	public void setPD(float pD) {
		PD = pD;
	}

	public void attack(Perso adv) {
		adv.bless(this.PA);
	}
	
	public void bless(float pts) {
		this.PV -= pts;
	}
	
	public void restaur() {
		this.PV += 0.1 * this.PV;
	}
	
	public boolean is_dead() {
		if(this.PV==0) return true;
		else return false;
	}
	
	
	
	public float getPV() {
		return PV;
	}
	public void setPV(float pV) {
		PV = pV;
	}
	public float getPA() {
		return PA;
	}
	public void setPA(float pA) {
		PA = pA;
	}
	public String getName () {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
