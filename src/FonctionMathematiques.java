import java.util.Scanner;

public class FonctionMathematiques {
    public static void main(String[] args) {
        //double nombre = 3;
        //double nombrePower = Math.pow(nombre,10);

        //Carré
       //double nombreCarre = Math.sqrt(6);

        //PI

       //double pi = Math.PI;

        Scanner s = new Scanner(System.in);
        System.out.print("Diametre : ");
        double diametre = s.nextDouble();
        double surface =  Math.pow(diametre,2)*Math.PI;
        double rayon = diametre/2;
        System.out.printf("Diametre : %.2f et Surface : %.2f et Rayon : %.2f" , diametre,surface,rayon);



    }
}
