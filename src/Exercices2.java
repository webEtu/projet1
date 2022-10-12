import java.util.Scanner;

public class Exercices2 {
    public static void main(String[] args) {
        /* 2.Ecrivez un programme Java qui permet de résoudre une équation du 2nd degré de la forme ax2+bx+c = 0.
        L'utilisateur devra fournir a,b,c à partir du clavier, ensuite le programme lui donnera la solution
        Principe du fonctionnement d'une équation du 2nd degré:

        a*a + b*b + 2*a*b
         */

        Scanner s = new Scanner(System.in);
        System.out.print("entrez le premier numero :");
        int a = s.nextInt();

        System.out.print("entrez le deuxième numero :");
        int b = s.nextInt();

        double c = Math.pow(a,2) + Math.pow(b,2) + 2*a*b;

        System.out.println("Voici la réponse : " + c);
    }
}
