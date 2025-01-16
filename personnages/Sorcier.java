package personnages;

public class Sorcier extends Mage {
	
	private int magieNoir;
	
	public Sorcier(int magieNoir) {
		super();
		this.magieNoir = magieNoir;
	}
	
	
	public Sorcier() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Sorcier(String nom, int force, int vie, String status , int magieNoir) {
		super(nom, force, vie, status);
		this.magieNoir = magieNoir;
		// TODO Auto-generated constructor stub
	}


	public Sorcier(String nom, String metier, int force, int vie, String status, int mana ,int magieNoir) {
		super(nom, metier, force, vie, status, mana);
		this.magieNoir = magieNoir;
		// TODO Auto-generated constructor stub
	}


	public int getMagieNoir() {
		return magieNoir;
	}

	public void setMagieNoir(int magieNoir) {
		this.magieNoir = magieNoir;
	}
	
	public String fiche() {
		return super.fiche()
				+ "\nMagie noir : " + this.getMagieNoir();
	}
}
