import java.util.Arrays;
import java.util.Scanner;

public class Exercices10 {
    public static void main(String[] args) {
       /* Écrire un programme Java qui demande à l'utilisateur de remplir un tableau d'entiers à partir du clavier.

                Puis le programme devra lui demander d'entrer un nombre à rechercher dans le tableau.

        Si nombre existe, le programme lui dira que le nombre existe et le nombre de fois qu'ils se retrouve dans le tableau
        Sinon le programme lui dira que le nombre recherché n'existe pas dans le tableau

        Ex : tableau saisi à partir du clavier : 12,45,6,7,12,23,33,6,22,3,6
    ->Entrer un nombre à rechercher : 6
    ->6 existe et se retrouve 3 fois dans le tableau
        */


        //creer un tableau
        var tableau=new int[10];

        //add scanner + message pour utilisateur
        var keyboardInput=new Scanner(System.in);
        System.out.println("Veuiller saisir 10 numero pour tableau ");

        // for simple pour recuperer les saisis d'utilisateur et positionner dans tableau
        for(int i=0;i<tableau.length;i++){
            System.out.print("numero de choix : ");
            var nombre=keyboardInput.nextInt();
            tableau[i] = nombre;
            //System.out.printf("nombre[%d] : %d\n",i,tableau[i]);//nombre[0] : 12
        }

        //afficher un message pour demander un numero à utilisateur
        System.out.println("Veuiller saisir un numero ");
        var nombreSearch= keyboardInput.nextInt();

        //initialliser un compteur
        int count = 0;

        // utiliser la nouvelle version de foreach pour parcourir dans le tableau
        // a chaque fois qu'il trouve le saisi, count+1
        for(int nombre:tableau){
            if(nombreSearch == nombre) {
                count++;
            }
        }

        System.out.println("*********************************");
        System.out.println("\n");
        if(count == 0) {
            System.out.println(nombreSearch + " n'existe pas. ");
        } else {
            System.out.println(nombreSearch + " existe et se retrouve " + count  + " fois dans tableau");
        }
        System.out.print("Voici le tableau des numero que vous venez d'entrer ");
        System.out.println(Arrays.toString(tableau));
        System.out.println("\n");
        System.out.println("*********************************");
    }
}
