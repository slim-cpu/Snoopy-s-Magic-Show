// Classe représentant un niveau composé de blocs
public class Niveau {
    // Tableau bidimensionnel de blocs représentant le niveau
    private Bloc[][] blocs;

    // Constructeur de Niveau
    public Niveau(int largeur, int hauteur) {
        // Initialisation du tableau de blocs avec la taille spécifiée
        blocs = new Bloc[largeur][hauteur];
        initialiserNiveau(); // Appel à la méthode pour initialiser le niveau
    }

    // Méthode privée pour initialiser le niveau avec des blocs
    private void initialiserNiveau() {
        for (int i = 0; i < blocs.length; i++) {
            for (int j = 0; j < blocs[i].length; j++) {
                blocs[i][j] = new Bloc(i, j); // Création d'un nouveau bloc à chaque position
            }
        }
    }

    // Méthode pour afficher le niveau avec les blocs
    public void afficherNiveau() {
        for (int i = 0; i < blocs.length; i++) {
            for (int j = 0; j < blocs[i].length; j++) {
                // Affichage "#" si le bloc est solide, sinon affichage " "
                System.out.print(blocs[i][j].estSolide() ? "#" : " ");
            }
            System.out.println(); // Nouvelle ligne pour passer à la ligne suivante
        }
    }
}
