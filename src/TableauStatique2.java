import java.util.Scanner;

public class TableauStatique2 {
    public static void main(String[] args) {
        var keyboardInput=new Scanner(System.in);
        System.out.print("Veuiller saisir le nombre de notes à entrer : ");
        var nombreNotes=keyboardInput.nextInt();

        var notesPhysique=new int[nombreNotes];

        for(int i=0;i<notesPhysique.length;i++){
            System.out.printf("Note[%d] : ",i);
            notesPhysique[i]=keyboardInput.nextInt();
        }

        for(int note:notesPhysique){
            System.out.println(note);
        }
    }
}
