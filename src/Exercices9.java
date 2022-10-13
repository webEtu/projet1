import java.util.Scanner;

public class Exercices9 {
    public static void main(String[] args) {
        /*9.Ecrivez un programme qui affiche en console les nombres de 1 à n:

        pour les multiples de trois, il affiche "fizz" à la place du nombre
        et pour les multiples de cinq de cinq, imprimez "buzz".
                Pour les nombres qui sont des multiples multiples à la fois de trois et de cinq, imprimez "fizzbuzz".
                Sinon, il affiche le nombre

                Exemple
        Si n = 5
        1
        2
        fizz
        4
        Buzz
         */

       Scanner s = new Scanner(System.in);
        System.out.print("veillez entrer un nombre : ");
        var n = s.nextInt();


        for (int i = 1; i <= n; i++) {
            while ( i % 3 != 0 && i % 5 != 0 ) {
                System.out.println(i);
                i++;
            }
            if (i %3 == 0) {
                System.out.println("fizz");
            }
            if (i %5 == 0) {
                System.out.println("Buzz");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz et Buzz");
            }
        }
    }
}
