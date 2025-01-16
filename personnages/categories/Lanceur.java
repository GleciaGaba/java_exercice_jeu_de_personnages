package personnages.categories;

import personnages.Personnage;

/**
 * Une interface ressemble à une classe abstraite:
 * - on ne peut pas instancier une interface
 * - les méthodes de l'interface sont abstraites
 * 
 * Il n'y a que des méthodes sans corps dans une interface.
 * On n'utilise pas le mot-clé abstract dans une interface.
 * 
 * 
 * Il est possible aussi de définir des propriétés dans les interfaces.
 */

public interface Lanceur {

    public int test = 2;

    public void attaqueADistance(Personnage p);

    public boolean esquiverADistance(int degats);

    /**
     * Pour implémenter une méthode dans une interface,
     * il faut utiliser le mot-clé default
     */
    default void test() {
        System.out.println("""
                cette méthode est déclarer
                dans l'interface Lanceur
                """);
    }

    static void essai() {
        System.out.println("méthode statique de l'interface Lanceur");
    }

}
