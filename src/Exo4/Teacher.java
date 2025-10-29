package Exo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Teacher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // Création d’élèves prédéfinis
        ArrayList<Double> grades1 = new ArrayList<>();
        Collections.addAll(grades1, 15.0, 14.0, 13.0, 12.0);
        students.add(new Student("Marty", "Rabord", grades1));

        ArrayList<Double> grades2 = new ArrayList<>();
        Collections.addAll(grades2, 12.0, 16.0, 8.0, 15.0);
        students.add(new Student("Fabio", "Arjunin", grades2));

        ArrayList<Double> grades3 = new ArrayList<>();
        Collections.addAll(grades3, 18.0, 17.0, 19.0);
        students.add(new Student("Lucie", "Martin", grades3));

        // Menu principal
        int choice;
        do {
            System.out.println("\n===== MENU PROFESSEUR =====");
            System.out.println("1  Ajouter un ou plusieurs élèves");
            System.out.println("2  Rechercher un élève par prénom");
            System.out.println("3  Afficher la liste complète des élèves");
            System.out.println("4  Afficher le classement (moyenne Décroissante)");
            System.out.println("5  Afficher le classement (moyenne Croissante)");
            System.out.println("0  Quitter");
            System.out.print("Votre choix : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudents(scanner, students);
                    break;

                case 2:
                    searchStudent(scanner, students);
                    break;

                case 3:
                    displayAllStudents(students);
                    break;

                case 4:
                    displayRankingDescending(students);
                    break;

                case 5:
                    displayRankingAscending(students);
                    break;

                case 0:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }

        } while (choice != 0);

        scanner.close();
    }

    // Méthode pour ajouter des élèves
    public static void addStudents(Scanner scanner, ArrayList<Student> students) {
        System.out.print("Combien d'élèves voulez-vous saisir ? ");
        int nb = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < nb; i++) {
            System.out.println("\n--- Élève " + (i + 1) + " ---");
            System.out.print("Prénom : ");
            String firstName = scanner.nextLine();
            System.out.print("Nom : ");
            String lastName = scanner.nextLine();

            ArrayList<Double> grades = new ArrayList<>();
            System.out.println("Saisissez les notes (tapez 000 pour arrêter) :");
            while (true) {
                double grade = scanner.nextDouble();
                if (grade == 000)
                    break;
                grades.add(grade);
            }
            scanner.nextLine();

            students.add(new Student(firstName, lastName, grades));
        }

        System.out.println("Élèves ajoutés!");
    }

    // Méthode pour rechercher un élève
    public static void searchStudent(Scanner scanner, ArrayList<Student> students) {
        System.out.print("\nEntrez le prénom d’un élève à rechercher : ");
        String searchName = scanner.nextLine();
        boolean found = false;

        for (Student s : students) {
            if (s.getFirstName().equalsIgnoreCase(searchName)) {
                System.out.println("\nÉlève trouvé : " + s.getFirstName() + " " + s.getLastName());
                System.out.println("Notes : " + s.getGrades());
                System.out.println("Moyenne : " + s.getAverage());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Aucun élève trouvé avec ce prénom.");
        }
    }

    // Méthode pour afficher tous les élèves
    public static void displayAllStudents(ArrayList<Student> students) {
        System.out.println("\n===== Liste des élèves =====");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Méthode pour afficher le classement par moyenne décroissante
    public static void displayRankingDescending(ArrayList<Student> students) {
        ArrayList<Student> ranking = new ArrayList<>(students);
        ranking.sort((a, b) -> Double.compare(b.getAverage(), a.getAverage()));

        System.out.println("\nCLASSEMENT DES ÉLÈVES (moyenne décroissante)");
        int rank = 1;
        for (Student s : ranking) {
            System.out.println(rank + ". " + s.getFirstName() + " " + s.getLastName() +
                    " -> Moyenne : " + String.format("%.2f", s.getAverage()));
            rank++;
        }
    }

    // Méthode pour afficher le classement par moyenne croissante
    public static void displayRankingAscending(ArrayList<Student> students) {
        ArrayList<Student> ranking = new ArrayList<>(students);
        ranking.sort((a, b) -> Double.compare(a.getAverage(), b.getAverage()));

        System.out.println("\nCLASSEMENT DES ÉLÈVES (moyenne croissante)");
        int rank = 1;
        for (Student s : ranking) {
            System.out.println(rank + ". " + s.getFirstName() + " " + s.getLastName() +
                    " -> Moyenne : " + String.format("%.2f", s.getAverage()));
            rank++;
        }
    }
}
