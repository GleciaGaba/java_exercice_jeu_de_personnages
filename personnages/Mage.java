package personnages;

public class Mage extends Personnage {

    private int mana;

    @Override
    public void esquiver() {
    }

    /**
     * Une annotation est une information ajouté au code.
     * Une annotation commence par le caractère @.
     * L'annotation @Override permet de préciser que la méthode qui suit est une
     * redéfinition d'une méthode du parent.
     */

    @Override
    public boolean esquiver(int degats) {
        int nbAleatoire = (int) (Math.random() * 10 + 1);
        return nbAleatoire == 1;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    /**
     * EXO: ajouter 2 constructeurs pour Mage: un avec toutes les propriétés du Mage
     * et un constructeur sans la propriété metier (plus le construteur par défault)
     */

    public Mage(String nom, String metier, int force, int vie, int mana) {
        super(nom, metier, force, vie);
        this.mana = mana;
    }

    public Mage(String nom, int force, int vie, int mana) {
        super(nom, force, vie);
        this.mana = mana;
    }

    public Mage() {
    }

    public String fiche() {
        return super.fiche()
                + "\nArmure: " + this.mana;
    }

}
