package Exo2;

import java.util.Scanner;

public class Main {


    public static void Test(int number) {

        if (number < 0) {
            System.out.println("le chiffre est negatif");
        } else {
            System.out.println("le chiffre est positif");
        }

        if (number % 2 == 0) {
            System.out.println("le chiffre est pair");
        } else {
            System.out.println("le chiffre est inpair");
        }
    }

    public static void main(String[] args) {
        int number;

        if (args.length > 0) {

            number = Integer.parseInt(args[0]);

        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entrez un nombre :");
            number = scanner.nextInt();
            scanner.close();
        }
        Test(number);
    }
}
