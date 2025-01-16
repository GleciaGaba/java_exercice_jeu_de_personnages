package personnages;

import personnages.categories.Lanceur;

public class Archer extends Guerrier implements Lanceur {

    @Override
    public void attaqueADistance(Personnage cible) {
        // Implementation of attaqueADistance
    }

    @Override
    public boolean esquiverADistance(int degats) {
        return false;
        // Implementation of esquiverADistance
    }
}
