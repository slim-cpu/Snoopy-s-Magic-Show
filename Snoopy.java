// Classe représentant le personnage Snoopy
public class Snoopy {
    // Attributs représentant la position de Snoopy
    private int positionX;
    private int positionY;

    // Constructeur de Snoopy
    public Snoopy(int startX, int startY) {
        this.positionX = startX;
        this.positionY = startY;
    }

    // Méthode pour déplacer Snoopy vers la gauche
    public void deplacerGauche() {
        positionX--;
        System.out.println("Snoopy se déplace vers la gauche. Nouvelle position : (" + positionX + ", " + positionY + ")");
    }

    // Méthode pour déplacer Snoopy vers la droite
    public void deplacerDroite() {
        positionX++;
        System.out.println("Snoopy se déplace vers la droite. Nouvelle position : (" + positionX + ", " + positionY + ")");
    }

    // Méthode pour déplacer Snoopy vers le haut
    public void deplacerHaut() {
        positionY++;
        System.out.println("Snoopy se déplace vers le haut. Nouvelle position : (" + positionX + ", " + positionY + ")");
    }

    // Méthode pour déplacer Snoopy vers le bas
    public void deplacerBas() {
        positionY--;
        System.out.println("Snoopy se déplace vers le bas. Nouvelle position : (" + positionX + ", " + positionY + ")");
    }
}
