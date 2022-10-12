import java.util.Scanner;

public class Exercices4 {
    public static void main(String[] args) {
       /* 4.Ecrire un programme Java qui déclare 3 variables, a,b,c et qui va ensuite effectuer une permutation de ces valeurs :
        Exemple :
        Entrez la première valeur(a) : 51
        Entrez la deuxième valeur(b) : 876
        Entrez la troisième valeur(c) : 235
        Les valeurs entrées sont : a = 51, b = 876 et c = 235
        Permutation: b <== a, c <== b, a <== c
        Les valeurs permutées sont : a = 235, b = 51 et c = 876
        */

        Scanner s = new Scanner(System.in);
        System.out.print("entrez le premier numero :");
        int a = s.nextInt();

        System.out.print("entrez le deuxième numero :");
        int b = s.nextInt();

        System.out.print("entrez le Trosième numero :");
        int c = s.nextInt();

        System.out.printf("a = %d , b = %d , c = %d" , c , a , b);
    }
}
