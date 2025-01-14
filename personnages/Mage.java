package personnages;

public class Mage extends Personnage {

    private int mana;

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

}