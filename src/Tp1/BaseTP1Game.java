package Tp1;

import java.util.Scanner;

import java.lang.Math;

public class BaseTP1Game {

    public static void Guess(int number, Scanner scanner) {
        int essais = 0;

        while (true) {
            System.out.println("Entrez un nombre: ");
            int input = scanner.nextInt();
            essais++;

            if (input == number) {
                System.out.println("yeah tu a trouver le bon chiffre '" + number + "' en " + essais + " essais");
                break;
            } else if (input > number) {
                System.out.println("Trop grand essayez encore");
            } else {
                System.out.println("Trop petit essayez encore");
            }

        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean rejouer = true;

        while (rejouer) {
            int number = (int) (Math.random() * 100) + 1;
            Guess(number, scanner);

            System.out.print("Voulez-vous rejouer ? (o/n) : ");
            String reponse = scanner.next();

            if (!reponse.equals("o")) {
                rejouer = false;
                System.out.println("A ++");
            }
        }
        scanner.close();
    }

}
