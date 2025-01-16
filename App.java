import java.util.Scanner;

import personnages.Guerrier;
import personnages.Mage;

public class App {
    static Guerrier guerrier = new Guerrier();
    static Mage mage = new Mage();
    static Guerrier guerrier1 = new Guerrier();
    static Mage mage1 = new Mage();

    public static void main(String[] args) {

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Veulez bien choisir entre Guerrier et Mage: ");

            String classe = scan.nextLine();

            if (classe.equals("Guerrier")) {
                System.out.println("Veulez choisir le nom du Guerrier: ");
                String gnom = scan.nextLine();
                System.out.println("Veulez choisir le metier du Guerrier: ");
                String gmetier = scan.nextLine();
                System.out.println("Veulez choisir les points de force entre 1 et 20: ");
                int gforce = scan.nextInt();
                System.out.println("Veulez choisir les points de vie entre 50 et 200: ");
                int gvie = scan.nextInt();

                System.out.println("Veulez choisir les points d'armure entre 1 et 5: ");
                int armure = scan.nextInt();

                guerrier = new Guerrier(gnom, gmetier, gforce, gvie, armure);

            } else if (classe.equals("Mage")) {
                System.out.println("Veulez choisir le nom du Mage: ");
                String mnom = scan.nextLine();
                System.out.println("Veulez choisir le metier du Mage: ");
                String mmetier = scan.nextLine();
                System.out.println("Veulez choisir les points de force entre 1 et 20: ");
                int mforce = scan.nextInt();
                System.out.println("Veulez choisir les points de vie entre 50 et 200: ");
                int mvie = scan.nextInt();

                System.out.println("Veulez choisir les points d'armure entre 1 et 5: ");
                int mana = scan.nextInt();

                mage = new Mage(mnom, mmetier, mforce, mvie, mana);

            } else {
                break;
            }

            System.out.println("Veulez bien choisir entre Guerrier et Mage: ");

            String classe1 = scan.nextLine();

            if (classe1.equals("Guerrier")) {
                System.out.println("Veulez choisir le nom du Guerrier: ");
                String gnom1 = scan.nextLine();
                System.out.println("Veulez choisir le metier du Guerrier: ");
                String gmetier1 = scan.nextLine();
                System.out.println("Veulez choisir les points de force entre 1 et 20: ");
                int gforce1 = scan.nextInt();
                System.out.println("Veulez choisir les points de vie entre 50 et 200: ");
                int gvie1 = scan.nextInt();

                System.out.println("Veulez choisir les points d'armure entre 1 et 5: ");
                int armure1 = scan.nextInt();

                guerrier1 = new Guerrier(gnom1, gmetier1, gforce1, gvie1, armure1);

            } else if (classe.equals("Mage")) {
                System.out.println("Veulez choisir le nom du Mage: ");
                String mnom1 = scan.nextLine();
                System.out.println("Veulez choisir le metier du Mage: ");
                String mmetier1 = scan.nextLine();
                System.out.println("Veulez choisir les points de force entre 1 et 20: ");
                int mforce1 = scan.nextInt();
                System.out.println("Veulez choisir les points de vie entre 50 et 200: ");
                int mvie1 = scan.nextInt();

                System.out.println("Veulez choisir les points d'armure entre 1 et 5: ");
                int mana1 = scan.nextInt();

                mage1 = new Mage(mnom1, mmetier1, mforce1, mvie1, mana1);

            } else {
                break;
            }

            if (guerrier != null && guerrier1 != null) {
                guerrier.attaque(guerrier1);
                System.out.println(guerrier1.fiche());
            } else if (guerrier != null && mage1 != null) {
                guerrier.attaque(mage1);
                System.out.println(mage1.fiche());

            } else if (mage != null && mage1 != null) {
                mage.attaque(mage1);
                System.out.println(mage1.fiche());
            } else if (mage != null && guerrier1 != null) {
                mage.attaque(guerrier1);
                System.out.println(guerrier1.fiche());
            } else {
                break;
            }

        } while (guerrier.getVie() > 0 && mage.getVie() > 0);
    }
}
