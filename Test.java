
import personnages.Arbaletrier;
import personnages.Archer;
import personnages.Guerrier;
import personnages.categories.Lanceur; // Commented out because Lanceur class does not exist
import personnages.categories.Race;
import personnages.Mage;
import personnages.Personnage;
import personnages.Sorcier;
import personnages.Voleur;

public class test {
	public static void main(String[] args) {

		Guerrier Conan = new Guerrier("Conan", "Barbare", 18, 100, "En vie", 8);
		Mage Gandalf = new Mage("Gandalf", "Vagabond", 8, 100, "En vie", 100);
		Sorcier Ermurazor = new Sorcier("Ermurazor", "Méchant", 10, 200, "En vie", 75, 100);

		System.out.println(Conan.fiche());
		System.out.println(Gandalf.fiche());
		System.out.println(Ermurazor.fiche());

		Conan.attaque(Ermurazor);
		System.out.println(Ermurazor.fiche());
		Ermurazor.attaque(Conan);
		System.out.println(Conan.fiche());
		Gandalf.attaqueMagique(Ermurazor);
		Gandalf.attaqueMagique(Ermurazor);
		System.out.println(Ermurazor.fiche());
	}

	public static void main2(String[] args) { // Ajoutez un 2 permet de l'empêcher de s'executer sans bousiller le
												// programme

		// Personnage p1 = new Personnage();
		// p1.setNom("Conan");
		// p1.setMetier("Barbare");
		// p1.setVie(100);
		// p1.setForce(18);

		Mage p2 = new Mage();
		try {
			p2.setNom("Merlin");
			p2.setMetier("Ermite");
			p2.setVie(100);
			p2.setForce(3);
			p2.setMana(100);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Voleur p3 = new Voleur();
		try {
			p3.setNom("Shipper");
		} catch (Exception e) {
			e.printStackTrace();
		}
		p3.setMetier("Eclaireur");
		p3.setVie(100);
		p3.setForce(8);
		p3.setAgilite(2);

		Guerrier p4 = new Guerrier();
		try {
			p4.setNom("Attila");
		} catch (Exception e) {
			e.printStackTrace();
		}
		p4.setMetier("Fléau");
		p4.setVie(100);
		p4.setForce(8);
		p4.setArmure(8);

		System.out.println("---------------------------------------");
		// System.out.println(p1.getNom() + " le " + p1.getMetier() + " , vie : " +
		// p1.getVie() + " , force : "
		// + p1.getForce() + " status : " + p1.getStatus());
		System.out.println(p2.getNom() + " l' " + p2.getMetier() + " , vie : " + p2.getVie() + " , force : "
				+ p2.getForce() + " , mana : " + p2.getMana() + " status : " + p2.getStatus());
		System.out.println(p3.getNom() + " l' " + p3.getMetier() + " , vie : " + p3.getVie() + " , force : "
				+ p3.getForce() + " , agilite : " + p3.getAgilite() + " status : " + p3.getStatus());
		System.out.println("---------------------------------------");
		// p1.attaque(p2);
		// System.out.println(p1.getNom() + " le " + p1.getMetier() + " , vie : " +
		// p1.getVie() + " , force : "
		// + p1.getForce() + " status : " + p1.getStatus());
		System.out.println(p2.getNom() + " l' " + p2.getMetier() + " , vie : " + p2.getVie() + " , force : "
				+ p2.getForce() + " , mana : " + p2.getMana() + " status : " + p2.getStatus());
		System.out.println(p3.getNom() + " l' " + p3.getMetier() + " , vie : " + p3.getVie() + " , force : "
				+ p3.getForce() + " , agilite : " + p3.getAgilite() + " status : " + p2.getStatus());
		System.out.println("---------------------------------------");

		// p3.attaqueFurtive(p1);
		p2.attaqueMagique(p3);

		// System.out.println(p1.getNom() + " le " + p1.getMetier() + " , vie : " +
		// p1.getVie() + " , force : "
		// + p1.getForce() + " status : " + p1.getStatus());
		System.out.println(p2.getNom() + " l' " + p2.getMetier() + " , vie : " + p2.getVie() + " , force : "
				+ p2.getForce() + " , mana : " + p2.getMana() + " status : " + p2.getStatus());
		System.out.println(p3.getNom() + " l' " + p3.getMetier() + " , vie : " + p3.getVie() + " , force : "
				+ p3.getForce() + " , agilite : " + p3.getAgilite() + " status : " + p3.getStatus());

		// System.out.println(p1.fiche());
		System.out.println(p2.fiche());
		System.out.println(p3.fiche());

		Lanceur lanceur = new Archer();
		String ficheLanceur = "";
		try {
			((Archer) lanceur).setNom("Robin de Bois");
			ficheLanceur = ((Archer) lanceur).fiche();
			System.out.println(ficheLanceur);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Personnage p = new Guerrier();
		try {
			p.setNom("Dar l'invicible");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(p.fiche());

		Guerrier guerrier = new Arbaletrier();
		// Arbaletrier a = new Guerrier();=> ne fonctionne pas dans ce sens
		Lanceur.essai();
		((Arbaletrier) guerrier).test();

		// Personnage p5 = new Mage();
		// Mage m1 = new Personnage();
		Sorcier sauron = new Sorcier("Sauron", "Dark Loard", 9, 2, ficheLanceur, 0, 0);
		Guerrier conan = new Guerrier("Conan", "Barbare", 18, 100, "En vie", 8);
		((Personnage) sauron).attaque(conan);
	}

	public static void main3(String[] args) {
		Guerrier conan = new Guerrier("Conan", "Barbare", 18, 100, "En vie", 8);
		Mage gandalf = new Mage("Gandalf", "Vagabond", 8, 100, "En vie");

		conan.setRace(Race.Humain);
		gandalf.setRace(Race.Istar);
		System.out.println(conan.fiche());
		System.out.println("Race: " + conan.getRace());
		System.out.println(gandalf.fiche());
		System.out.println("Race: " + gandalf.getRace());

	}

}
