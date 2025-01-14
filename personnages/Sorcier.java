package personnages;

public class Sorcier extends Mage {
    private int magieNoire;

    public Sorcier(String nom, String metier, int force, int vie, int mana, int magieNoire) {
        super(nom, metier, force, vie, mana);
        this.magieNoire = magieNoire;
    }

    public Sorcier(String nom, int force, int vie, int mana, int magieNoire) {
        super(nom, force, vie, mana);
        this.magieNoire = magieNoire;
    }

    public Sorcier(int magieNoire) {
        this.magieNoire = magieNoire;
    }

    public Sorcier() {
    }

    public String fiche() {
        return super.fiche()
                + "\nArmure: " + this.magieNoire;
    }

}
