// Classe représentant un bloc dans le niveau
public class Bloc {
    // Attribut indiquant si le bloc est solide ou non
    private boolean solide;

    // Constructeur de Bloc
    public Bloc(int x, int y) {
        // Exemple simple : chaque bloc est solide s'il est sur une colonne paire
        solide = (x % 2 == 0);
    }

    // Méthode pour vérifier si le bloc est solide
    public boolean estSolide() {
        return solide;
    }
}
