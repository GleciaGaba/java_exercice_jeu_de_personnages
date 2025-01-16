package personnages;

public class Voleur extends Personnage{ 
	
	private int agilite;
	
	public Voleur() {
		// TODO Auto-generated constructor stub
	}
	public Voleur(String nom, int force, int vie) { // Appelle 2eme constructeur de Personnage
		super(nom, force, vie);
		// TODO Auto-generated constructor stub
	}
	public Voleur(String nom, String metier, int force, int vie, String status) {
		super(nom, metier, force, vie, status);
		// TODO Auto-generated constructor stub
	}
	
	public int getAgilite() {
		return agilite;
	}
	public void setAgilite(int agilite) {
		this.agilite = agilite;
	}
	public void attaqueFurtive(Personnage cible) {
		cible.setVie(cible.getVie() - this.agilite * this.getForce());
	}
}

