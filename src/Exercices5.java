import java.util.Scanner;

public class Exercices5 {
    public static void main(String[] args) {
        /*5.Ecrivez un programme Age.java qui :
        demande son âge à l'utilisateur ;
        lit la réponse de l'utilisateur et l'enregistre dans une variable age de type entier ;
        Effectue le calcul de l'année de naissance de l'utilisateur et l'enregistre dans la variable annee de type entier ;
        affiche l'année de naissance ainsi calculée.

        Exemple d'exécution du programme:
        Donnez votre age : 29
        Votre année de naissance est : 1992
         */
        Scanner s = new Scanner(System.in);
        System.out.print("entrez votre age :");
        int age = s.nextInt();

        int anne = 2022 - age;
        System.out.println(" Vous avez née en " + anne);
    }
}
