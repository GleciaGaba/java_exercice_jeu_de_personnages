package personnages;

import outils.Fonctions;

public class Guerrier extends Personnage {

	private int armure = 1;

	// CONSTRUCTEURS
	public Guerrier() {
		// TODO Auto-generated constructor stub
	}

	public Guerrier(String nom, int force, int vie) { // Appelle 2eme constructeur de Personnage
		super(nom, force, vie);
		// TODO Auto-generated constructor stub
	}

	public Guerrier(String nom, String metier, int force, int vie) {
		super(nom, metier, force, vie);
		// TODO Auto-generated constructor stub
	}

	public Guerrier(String nom, String metier, int force, int vie, int armure) {
		super(nom, metier, force, vie);
		this.setArmure(armure);
	}
	// CONSTRUCTEURS

	public int getArmure() {
		return armure;
	}

	public void setArmure(int armure) {
		if (this.armure < 1) {
			this.armure = 1;
		} else if (this.armure > 5) {
			this.armure = 5;
		} else {
			this.armure = armure;
		}
	}

	public String fiche() {
		return super.fiche()
				+ "\nPoint d'armure : " + this.getArmure() + "\n";
	}

	@Override
	public void esquiver() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean esquiver(int degats) {
		// if (this.getForce() >= 15) {

		// }else if (this.getForce() >= 13) {

		// }else if (this.getForce() >= 10) {

		// }
		// return false;

		boolean esquive = false;

		if (this.getForce() >= 15) {
			esquive = Fonctions.aleatoire(1, 4) == 1;
		} else if (this.getForce() >= 13) {
			esquive = Fonctions.aleatoire(1, 8) == 1;
		} else {
			esquive = Fonctions.aleatoire(1, 10) == 1;
		}

		if (esquive) {
			// degats = degats / 2
			// degats /= 2;

			degats = esquive ? degats / 2 : degats;
			this.setVie(this.getVie() - degats);
		}
		return esquive;

	}

	/*
	 * int nbAleatoire = Fonctions.aleatoire(1, 10);
	 * return nbAleatoire == 1;
	 */

	/*
	 * EXO : implémenter la méthode esquiver de la manière suivante :
	 * si le guerrier a au mois 15 en force,
	 * il a une chance sur 4 d'esquiver,
	 * sinon s'il a au moins 13 en force,
	 * il a une chance sur 8
	 * sinon
	 * il a une chance sur 10.
	 * 
	 * S'il esquive,
	 * il perd la moitié des dégats en points de vie
	 * sinon
	 * il perd autant de points de vie que de dégats.
	 * 
	 * S'il l'esquive est réussie, la méthode retourne true, sinon elle retourne
	 * false
	 * 
	 */

}
