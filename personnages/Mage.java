package personnages;

import outils.Fonctions;

public class Mage extends Personnage {

	private int mana;

	public Mage(String name, String type, int level, int health) {

		super(name, type, level, health);

	}

	public Mage() {
		// TODO Auto-generated constructor stub
	}

	public Mage(String nom, int force, int vie) { // Appelle 2eme constructeur de Personnage
		super(nom, force, vie);
		// TODO Auto-generated constructor stub
	}

	public Mage(String nom, String metier, int force, int vie, int mana) { // Appelle 3eme constructeur
																			// de Personnage
		super(nom, metier, force, vie);
		this.mana = mana;
		// TODO Auto-generated constructor stub
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public void attaqueMagique(Personnage cible) {
		cible.setVie(cible.getVie() - this.mana);
	}

	public String fiche() {
		return super.fiche()
				+ "\nPoint de mana : " + this.getMana();
	}

	@Override
	public void esquiver() {

	};

	@Override
	public boolean esquiver(int dgts) {
		int nbAleatoire = Fonctions.aleatoire(1, 10);
		return nbAleatoire == 1;
	};
}
