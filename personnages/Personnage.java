package personnages;

public class Personnage {
    private String nom;
    private String metier;
    private int force;
    private int vie;

    /**
     * Dès que on définit un construteur dans une classe, le construteur par défault
     * (sans argument)
     * n'est plus accessible.
     * Pour le rendre accessible, il faut le définir explicitement.
     */

    public Personnage() {
    }

    /**
     * Dans une classe, on peut avoir plusieurs méthodes avec le m^me nom. On
     * appelle ça, la SURCHARGE (overloading).
     * 
     * @param nom
     * @param metier
     * @param force
     * @param vie
     */
    public Personnage(String nom, String metier, int force, int vie) {
        this.nom = nom;
        this.metier = metier;
        this.force = force;
        this.vie = vie;
    }

    /**
     * Dans une classe, on peut avoir plusieurs méthodes avec le m^me nom. On
     * appelle ça, la SURCHARGE (overloading).
     * 
     * @param nom
     * @param metier
     * @param force
     * @param vie
     */
    public Personnage(String nom, int force, String metier, int vie) {
        this.nom = nom;
        this.metier = metier;
        this.force = force;
        this.vie = vie;
    }

    public Personnage(String nom, int force, int vie) {
        this.nom = nom;
        this.force = force;
        this.vie = vie;
    }

    public void attaque(Personnage cible) {
        // EXO: les points de vie de la cible vont être diminué des points de force de
        // l'attaquant(this)
        cible.setVie(cible.getVie() - this.force);

    }

    public void fiche() {
        System.out.println("Fiche Personnage");
        System.out.println("Nom: " + this.nom);
        System.out.println("Métier: " + this.metier);
        System.out.println("Points de force: " + this.force);
        System.out.println("Points de vie: " + this.vie);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMetier(String metier) {
        this.metier = metier;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getVie() {
        return vie;
    }

    @Override
    public String toString() {
        return "Personage [nom=" + nom + ", metier=" + metier + ", force=" + force + ", vie=" + vie + "]";
    }

}
