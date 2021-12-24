package personnages;

import java.util.ArrayList;
import java.util.List;

public class Adversaire extends Perso {
	
	private ArrayList<String> names;
	private int level;
	
	public Adversaire() {
		super();
		names = new ArrayList<String>();
		names.add("L.Messi");
		names.add("Zoro");
		names.add("C.Ronaldo");
		names.add("Kratos");
		this.level = 0;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	

	
	
	
	
	
	
	
	

}
