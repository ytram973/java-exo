package Exo6;

public class Matrix {

    // Méthode pour vérifier que deux matrices ont la même taille
    public static boolean sameSize(int[][] a, int[][] b) {
        return a.length == b.length && a[0].length == b[0].length;
    }

    // Méthode pour additionner deux matrices
    public static int[][] add(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }

    // Méthode pour soustraire deux matrices
    public static int[][] subtract(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }

        return result;
    }

    // Méthode pour multiplier une matrice par un scalaire
    public static int[][] multiply(int[][] a, int scalar) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] * scalar;
            }
        }

        return result;
    }

    // Méthode pour afficher une matrice
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] tableau1 = { { 1, 2, 0 }, { 4, 3, -1 } };
        int[][] tableau2 = { { 5, 2, 3 }, { 1, 3, 4 } };

        // Vérifier qu'ils ont la même taille
        if (!sameSize(tableau1, tableau2)) {
            System.out.println("Les tableaux doivent avoir la même taille !");
            return;
        }

        // Addition
        int[][] addition = add(tableau1, tableau2);
        System.out.println("Résultat de l'addition :");
        printMatrix(addition);

        // Soustraction
        int[][] soustraction = subtract(tableau1, tableau2);
        System.out.println("Résultat de la soustraction :");
        printMatrix(soustraction);

        // Multiplication par un scalaire
        int scalaire = 4;
        int[][] multiplication = multiply(tableau1, scalaire);
        System.out.println("Résultat de la multiplication par " + scalaire + " :");
        printMatrix(multiplication);
    }
 
}
