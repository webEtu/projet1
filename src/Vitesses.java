public class Vitesses {
    public static void main(String[] args) {
        int distance = 300;
        int temps = 6 ;
        float v = distance/temps;
        System.out.println("Distance : " + distance + "M et " + " temps : " + temps + "S et " + " Vitesse : "+ v + " M/S");
        //        %d : entiers
        //        %f : nombres à virugle
        //         %.2f : pour afficher deux nombre apres
        //        %s : string
        System.out.printf("Vitesse = %d / %d = %.2f m/s" , distance,temps, v);
    }
}
