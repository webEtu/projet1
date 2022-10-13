import java.util.Scanner;

public class Exercices6 {
    public static void main(String[] args) {
       /* 6.Écrivez un petit programme Java, Degre3.java, vous permettant d'évaluer un polynôme du
        3ème degré de la forme:
        ((a+b)/2)x3 + (a+b)2x2 + a + b + c
        Exemple d'exécution:
        Entrez a (int) : 1
        Entrez b (int) : 2
        Entrez c (int) : 3
        Entrez x (double) : 3.5
        La valeur du polynôme est : 180.5625
        */
        Scanner s = new Scanner(System.in);
        System.out.print("entrez le premier numero :");
        int a = s.nextInt();

        System.out.print("entrez le premier numero :");
        int b = s.nextInt();

        System.out.print("entrez le premier numero :");
        int c = s.nextInt();

        System.out.print("entrez le premier numero :");
        double x = s.nextDouble();

        //((a+b)/2)x3 + (a+b)2x2 + a + b + c
        //((a+b)/2)x3 + (a+b)2x2 + a + b + c
        //double result = (((a+b)/2)*Math.pow(x,3)) + ((a+b)*(2*Math.sqrt(2))) + a + b +c;
        //double result = (((a+b)/2)*Math.pow(x,3)) + ((a+b)*(2*Math.sqrt(2))) + a + b +c;
        double result = (((a+b)/2)*(x*3)) + ((a+b)*(2*(x*2))) + a + b +c;
       // double result = ((a+b)/2)*3*x + (a+b)*2*x*2 + a + b +c;
        //double result = ((a+b)/2)*(3*x) + (a+b)*(2*x*2) + a + b +c;
       // double result = ((a+b)/2)*(3*x) + (a+b)*2*x*2 + a + b +c;
        //double result = (((a+b)/2)*(3*x)) + ((a+b)*(2*x*2)) + a + b +c;


        System.out.println("La valeur du polynôme est :" + result );

    }
}
