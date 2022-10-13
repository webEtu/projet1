import java.util.Random;
import java.util.Scanner;

public class Exercices8 {
    public static void main(String[] args) {
        /*8.Écrire un programme Java qui génère un nombre(entier) aléatoire entre 1 et 100 et qui ensuite demandera à l'utilisateur de deviner le nombre jusqu'à ce que la réponse convienne.

        En cas de réponse supérieure à la valeur générée, le programme affichera "Entrer un plus petit nombre".En cas de valeur inférieur, le programme affichera "Entrer un plus grand nombre".
         */

        Random random = new Random();
        int nA;
        nA = random.nextInt(101);
        System.out.println(nA);

        boolean correct = false;


        while (!correct) {
            Scanner s = new Scanner(System.in);
            System.out.print("entrez votre numero entre 1 et 100 : ");
            int nU = s.nextInt();
            //System.out.println(nU);
            if (nU < nA) {
                System.out.println("Too low, try again");
            } else if (nU > nA) {
                System.out.println("Too high, try again");
            } else {
                System.out.println("********************Bravo!*************************");
                correct = true;
            }
        }
    }
}
