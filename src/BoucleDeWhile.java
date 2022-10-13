import java.util.Scanner;

public class BoucleDeWhile {
    public static void main(String[] args) {
        var keyboardInput=new Scanner(System.in);

        // Création du code PIN
        System.out.print("Veuillez définir un code PIN : ");
        var codePin=keyboardInput.nextInt();

        // Essais de déverouillage de l'appareil
        int codePinATester;
        System.out.print("Veuillez entrer le code PIN pour déverouiller l'appareil :" +
                " ");

        do{
            codePinATester=keyboardInput.nextInt();
            if(codePinATester==codePin){
                System.out.println("Appareil déverouillé!!!!");
                break;
            }
            System.out.print("Code PIN erroné, veuillez recommencer : ");

        } while (true);
    }
}
