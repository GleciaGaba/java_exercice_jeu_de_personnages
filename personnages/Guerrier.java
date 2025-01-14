package personnages;

public class Guerrier extends Personnage {
    private int armure = 1;

    public Guerrier(String nom, String metier, int force, int vie, int armure) {
        super(nom, metier, force, vie);
        this.setArmure(armure);

    }

    public int getArmure() {

        return armure;
    }

    public void setArmure(int armure) {
        if (armure >= 1 && armure <= 5) {
            this.armure = armure;
        } else if (armure < 1) {
            this.armure = 1;
        } else {
            this.armure = 5;

        }
    }

    public String fiche() {
        return super.fiche()
                + "\nArmure: " + this.armure;
    }
}
