package Exo5;

public class BaseEx5String {
    public static void main(String[] args) {

        String phrase = "il fait beau aujourd'hui";
        // String phrase2 = " et il fait Froid aujourd'hui";
        // System.out.println(phrase + phrase2);
        // phrase += phrase2;
        System.out.println(phrase);

        String find = "beau";
        String change = "Chaud";

        if (phrase.contains(find)) {
            phrase = phrase.replace(find, change);
            System.out.println("Le caractère est présent !");
            System.out.println(phrase);

        } else {
            System.out.println("Le caractère n'est pas présent !");
        }

        boolean estPalindrome = true;

        // String mot = "ottO";
        String mot = "Elu par cette crapule";

        // met en miniscule la string
        mot = mot.toLowerCase().replaceAll("\\s", "");;

        for (int i = 0; i < mot.length() / 2; i++) {
            if (mot.charAt(i) != mot.charAt(mot.length() - 1 - i)) {
                estPalindrome = false;
                break;
            }
        }

        // On compare la chaîne originale et l'inverse
        if (estPalindrome) {
            System.out.println("'" + mot + "' est un palindrome !");
        } else {
            System.out.println("'" + mot + "' n'est pas un palindrome.");
        }
    }
}
