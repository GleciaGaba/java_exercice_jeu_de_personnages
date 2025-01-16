import personnages.Guerrier;
import personnages.Mage;

public class combat {
    public static void main(String[] ars) {
        Guerrier conan = new Guerrier("Conan", "Barbare", 18, 100, "En vie", 8);
        Mage gandalf = new Mage("Gandalf", "Vagabond", 8, 100, "En vie");

        /*
         * EXO : faire un combat entre ces 2 personnages
         * (en utilisant la méthode "attaque") jusqu'à ce que l'un des 2 (ou les 2)
         * meure(nt). Les personnages attaquent l'un après l'autre.
         * Quand l'un des combattants meurt, afficher le nom du combattant victorieux.
         * à chaque tour, vous pouvez afficher les points de vie restant du
         * combattant ciblé.
         * 
         */

        while (conan.getVie() > 0 && gandalf.getVie() > 0) {
            conan.attaque(gandalf);
            System.out.println("Gandalf a " + gandalf.getVie() + " points de vie restants.");
            if (gandalf.getVie() <= 0) {
                System.out.println("Conan a gagné le combat !");
                break;
            }

            gandalf.attaque(conan);
            System.out.println("Conan a " + conan.getVie() + " points de vie restants.");
            if (conan.getVie() <= 0) {
                System.out.println("Gandalf a gagné le combat !");
                break;
            }
        }

    }
}
