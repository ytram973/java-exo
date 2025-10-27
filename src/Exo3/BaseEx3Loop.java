package Exo3;

import java.util.Scanner;

public class BaseEx3Loop {

    public static void Test(int number) {
        String result = "";

        if (number < 0) {
            result += number + " est negatif";
        } else {
            result += number + " est positif";
        }

        if (number % 2 == 0) {
            result += " et pair";
        } else {
            result += " et impair";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            for (String arg : args) {
                try {
                    Test(Integer.parseInt(arg));
                } catch (NumberFormatException e) {
                    System.out.println("'" + arg + "' n'est pas un nombre valide !");
                    System.out.println("---");
                }
            }
        } else {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Entrez un nombre ou 'exit') : ");
                String input = scanner.nextLine();
                if (input.equals("exit"))
                    break;
                try {
                    Test(Integer.parseInt(input));
                } catch (NumberFormatException e) {
                    System.out.println("invalide !");
                    System.out.println("---");
                }
            }
            scanner.close();
        }
    }
}
