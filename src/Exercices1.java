import java.util.Scanner;

public class Exercices1 {
    public static void main(String[] args) {
        /* 1.Ecrivez un programme Java qui lit un nombre et indique s'il est positif, négatif ou s'il vaut zéro et s'il est pair ou impair.
        Exemple d'exécution:
        Entrez un nombre entier: 5
        Le nombre est positif et impair
        Entrez un nombre entier: -4
        Le nombre est négatif et pair
        Entrez un nombre entier: 0
        Le nombre est zéro (et il est pair)
         */

        Scanner s = new Scanner(System.in);
        System.out.print("entrez un nombre :");
        int nombre = s.nextInt();

        if(nombre < 0 && nombre%2==0) {
            System.out.println("Le nombre est négatif et pair");
        } else if (nombre < 0 && nombre%2==1) {
            System.out.println("Le nombre est négatif et pair");
        } else if (nombre > 0 && nombre%2==0) {
            System.out.println("Le nombre est positif et pair");
        } else if (nombre > 0 && nombre%2==1){
            System.out.println("Le nombre est positif et impair");
        } else {
            System.out.println(" Le nombre est zéro (et il est pair)");
        }
    }
}
