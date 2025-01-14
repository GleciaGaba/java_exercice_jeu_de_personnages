import personnages.*;

public class Test {

    // EXO: créez un personnage nommé Conan, profession barbare.
    // avec 18 en force et 100 points de vie.

    public static void main(String[] args) {
        Personnage persoGuerrier = new Personnage();
        persoGuerrier.setNom("Conan");
        persoGuerrier.setMetier("barbare");
        persoGuerrier.setForce(18);
        persoGuerrier.setVie(100);
        System.out.println(persoGuerrier);

        Personnage persoMage = new Mage();
        persoMage.setNom("Gandalf");
        persoMage.setMetier("vagabond");
        persoMage.setForce(9);
        persoMage.setVie(90);
        ((Mage) persoMage).setMana(180);

        persoGuerrier.attaque(persoMage);
        System.out.println(persoMage);
        persoMage.attaque(persoGuerrier);
        System.out.println(persoGuerrier);
        persoGuerrier.attaque(persoMage);
        System.out.println(persoMage);
        persoMage.attaque(persoGuerrier);
        System.out.println(persoGuerrier);

        Personnage perso1 = new Personnage("Aragorn", 14, "rôdeur", 90);
        Guerrier g = new Guerrier("Mad Martigan", "mercenaire", 12, 80, 2);

        /**
         * Créer une classe Socier qui hérite de la classe Mage et qui a les propriétés
         * suivantes:
         * nom String
         * force int
         * metier String
         * vie int
         * magieNoire int
         * 
         * 2. Dans la classe Personnage, ajouter une méthode nommée "fiche" qui retourne
         * une chaine de caractères qui ressemnle à:
         * Fiche Personnage
         * 
         * Nom:
         * Métier:
         * Pioints de force:
         * Points de vie:
         */

        Sorcier sorcier = new Sorcier("Merlin", "mage", 10, 80, 100, 50);
        sorcier.fiche();
        System.out.println(sorcier);

    }

}
