package Day09_Scanner_Practice1;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner inPut = new Scanner(System.in);
        System.out.println("*** Temputure Conveter ***");

        System.out.println("Enter the fahrenheit degree ");

        // celcius = ((fahrenheit -32) * 5/7)
        double fahrenheit = inPut.nextDouble();
        double celsius = ((fahrenheit -32) * 5/7);
        System.out.println( fahrenheit + " ○F = " +celsius +" ○C");



    }
}
