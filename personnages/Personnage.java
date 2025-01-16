package personnages;

import personnages.categories.Race;

public abstract class Personnage {
	public final int FORCE_MAX = 20;
	public final int FORCE_MIN = 1;
	private String nom;
	private String metier;
	private int force;
	protected int vie; // Accessible dans le package (par toute les classe du même package) -> dans le
						// main personnage.vie ne devrait pas fonctionner.
	private Race race;

	private String status = "En vie";

	/**
	 * Clonage: permet de créer une copie d'un objet
	 * 
	 * @throws CloneNotSupportedException
	 */

	public Personnage clone() throws CloneNotSupportedException {

		return (Personnage) super.clone();

	}

	/**
	 * Un constructeur est une méthode qui permet de 'constuire' (= instancier) un
	 * objet d'une classe.
	 * Le constructeur est appelé avec le mot-clé new.
	 * Il n'y a pas de type de retour dans la définition (=signature) de la méthode.
	 * Le nom du constructeur est le nom de la classe.
	 * 
	 * @param nom
	 * @param metier
	 * @param force
	 * @param vie
	 * 
	 */
	public Personnage() {
		// TODO Auto-generated constructor stub
	}

	public Personnage(String nom, String metier, int force, int vie) {
		this.nom = nom;
		this.metier = metier;
		this.force = force;
		this.vie = vie;

	}

	// Surcharge : un 2ème constructeur avec des paramètres différent METIER et
	// STATUS sont exclus
	public Personnage(String nom, int force, int vie) {
		this.nom = nom;
		this.force = force;
		this.vie = vie;
	}

	public String getNom() {
		return nom;
	}

	/**
	 * Si une méthode peut lancer une exception, dans le corps de la méthode, il
	 * faut:
	 * - soit capturer l'exception et la gérer (avec un bloc try catch)
	 * - soit définir que la méthode peut lancer une exception(avec throws)
	 * 
	 * @param nom
	 * @throws Exception
	 */

	public void setNom(String nom) throws Exception {
		if (nom != "") {
			this.nom = nom;
		} else {
			throw new Exception("Le nom du personage ne peut pas être vide!");
		}

	}

	public String getMetier() {
		return metier;
	}

	public void setMetier(String metier) {
		if (force >= FORCE_MAX) {
			this.force = FORCE_MAX;
		} else if (force <= FORCE_MIN) {
			this.force = FORCE_MIN;
		}

	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		this.vie = vie;
		if (this.vie <= 0) {
			this.vie = 0;
			this.status = "Mort";
		}
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race humain) {
		this.race = humain;
	}

	public void attaque(Personnage gandalf) {
		gandalf.setVie(gandalf.getVie() - this.force);
	}

	public String fiche() {

		return """
				\nFiche personnage
				-----------------------
				"""
				+ "\nNom : " + this.nom
				+ "\nMétier : " + this.metier
				+ "\nPoints de forces : " + this.force
				+ "\nPoints de vie : " + this.vie
				+ "\nStatus : " + this.status;
	}

	/**
	 * Méthode abstraite, à implémenter dans les enfants de personnage.
	 * 
	 */
	public abstract void esquiver();

	public abstract boolean esquiver(int degats);

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

}
