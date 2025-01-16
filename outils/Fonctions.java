package outils;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Le modificateur final pour une classe, signifie qu'on ne peut pas hériter de
 * cette classe.
 */

public final class Fonctions {

	public final int FORCE_MAX = 20;
	private static final Scanner scan = new Scanner(System.in);

	private Fonctions() {

	}

	/**
	 * Retourne un nombre entier (un pseudo) aléatoire compris
	 * entre une valeur minimale et maximum
	 * 
	 * @param min
	 * @param max
	 * @return
	 */

	public static int aleatoire(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}

	public static String saisirTexte(String question) {
		System.out.println(question + " > ");
		String texte = scan.next();
		return texte;
	}

	public static int saisirEntier(String question) {
		Integer nb = null;
		do {
			try {
				System.out.println(question + " > ");
				nb = scan.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("\033[31m Ce n'est pas un nombre \033[0m");
				nb = null;
			} catch (NumberFormatException e) {
				System.out.println("\033[31m Mauvaise saisie \033[0m]");
				nb = null;
			} catch (Exception e) {
				System.out.println("\033[31m Erreur ! \033[0m]");
				nb = null;
			}
		} while (nb == null);
		return nb;
	}

}
