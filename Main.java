// Classe principale contenant la méthode main
public class Main {
    public static void main(String[] args) {
        // Création d'un niveau de jeu avec une taille de 10x5
        Niveau niveau = new Niveau(10, 5);

        // Affichage du niveau initial
        System.out.println("Niveau initial :");
        niveau.afficherNiveau();

        // Création d'un objet Snoopy à la position (0, 0)
        Snoopy snoopy = new Snoopy(0, 0);

        // Déplacement de Snoopy vers la droite et vers le bas
        snoopy.deplacerDroite();
        snoopy.deplacerBas();

        // Affichage du niveau après le déplacement de Snoopy
        System.out.println("Niveau après déplacement de Snoopy :");
        niveau.afficherNiveau();
    }
}
