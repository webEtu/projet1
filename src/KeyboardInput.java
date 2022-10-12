import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Votre nom : ");
        String nom = keyboardInput.nextLine();

        System.out.print("Votre prenom : ");
        String prenom = keyboardInput.nextLine();

        System.out.print("Votre age : ");
        int age = keyboardInput.nextInt();

        System.out.print("Votre poids : ");
        double poids = keyboardInput.nextDouble();

        System.out.printf("Nom : %s\n Prenom : %s\n Age: %d ans\n Poids : %.2f\n " , nom,prenom,age,poids);
    }
}
