import java.util.Scanner;

public class Exercices3 {
    public static void main(String[] args) {
       /* Ecrire un programme qui permet à l'utilisateur de saisir un entier entre 1 et 12 et qui affiche le nom du mois correspondant.
        */

        Scanner s = new Scanner(System.in);
        System.out.print("entrez un numero entre 1 et 12 :");
        int nombre = s.nextInt();

        if (nombre >= 1 && nombre <= 12) {
            switch (nombre) {
                case 1 :
                    System.out.println("Janvier");
                    break;
                case 2 :
                    System.out.println("Fevrier");
                    break;
                case 3 :
                    System.out.println("Mars");
                    break;
                case 4 :
                    System.out.println("Avril");
                    break;
                case 5 :
                    System.out.println("mai");
                    break;
                case 6 :
                    System.out.println("Juin");
                    break;
                case 7 :
                    System.out.println("Juillet");
                    break;
                case 8 :
                    System.out.println("Aout");
                    break;
                case 9 :
                    System.out.println("Septembre");
                    break;
                case 10 :
                    System.out.println("Octobre");
                    break;
                case 11 :
                    System.out.println("Novembre");
                    break;
                case 12 :
                    System.out.println("Decembre");
                    break;
            }
        } else {
            System.out.print("Le numero n'est pas entre 1 et 12");
        }

    }
}
