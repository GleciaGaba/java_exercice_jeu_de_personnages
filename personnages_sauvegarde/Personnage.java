public class Personnage {
    private String nom;
    private String metier;
    private int force;
    private int vie;

    public void attaque(Personnage cible) {
        // Exo: les points de vie de la cible vont être diminué
        // des points de force de l'attaquant (this)

        // cible.vie -= this.force;
        cible.setVie(cible.getVie() - this.force);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMetier() {
        return metier;
    }

    public void setMetier(String metier) {
        this.metier = metier;
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
    }
}
