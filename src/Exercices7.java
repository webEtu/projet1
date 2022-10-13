import java.util.Scanner;

public class Exercices7 {
    public static void main(String[] args) {
       /* 7.Écrivez un programme Java qui demande à l'utilisateur d'entrer un nombre et qui ensuite va calculer et afficher la factorielle de ce nombre:

        Ex:

        Nombre : 3

        Factorielle de 3 : 3x2x1 = 6
        */
        Scanner s = new Scanner(System.in);
        System.out.print("entrer un nombre pour calculer la factorielle : ");
        var nombre = s.nextInt();
        var resultat = 1;

        for (int i= 1 ; i <= nombre ; i++) {
            resultat = resultat * i;
        }
        System.out.println("Voici la factrille de numéro " + nombre + " est " + resultat);
    }
}
