import java.util.Scanner;

public class BoucleWhile {

    public static void main(String[] args) {

        var keyboardInput = new Scanner(System.in);

        //Creation du code PIN
        System.out.print("Veuillez définir un code Pin : ");
        var codePin = keyboardInput.nextInt();
        var codePineATester = 0;

        // Tant que le code pin à tester est différent du code pin, alors
        // Demander à l'utilisateur de ressayer

        while (codePineATester != codePin) {
            System.out.print("Veuillez entre le code PIN pour deverouiller l'appareil : " + " ");
            codePineATester = keyboardInput.nextInt();
            if(codePineATester != codePin) {
                System.out.println("code PIN erroné, veuillez recommecer.");
            } else {
                System.out.println("Appareil deverouillé!!!!");
            }
        }
    }
}
