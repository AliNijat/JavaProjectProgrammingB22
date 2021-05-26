package Day09_Scanner_Practice1;

import java.util.Scanner;

public class Miles2KmConverter {
    public static void main(String[] args) {

        // 1 mile = 1.609344 KM
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number and currency that you want to convert");
        double mile = scan.nextDouble();
        double oneMileInKm = 1.609344;
        double kiloMeter = oneMileInKm * mile; // = KM

        // 1 Kilometer = Mile?
        double kM = scan.nextDouble();
        double mileTOKm = kM / oneMileInKm;

        System.out.println(mile + " Miles are equal to " + kiloMeter + " KM");

        System.out.println(kM +  " KM are equal to " + mileTOKm + " Miles");




    }
}
