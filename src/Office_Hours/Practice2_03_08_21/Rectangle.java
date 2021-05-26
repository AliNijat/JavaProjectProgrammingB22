package Office_Hours.Practice2_03_08_21;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        // PIC ==>> Package > import > class
        // Rifirence
        // double length = 5;
        // double width = 3;
        Scanner entered = new Scanner(System.in);
        System.out.println("Enter the length");
        double length = entered.nextDouble();

        System.out.println("Enter the width");
        double width = entered.nextDouble();

        double perimeter = 2 * (length + width);
        double area = length * width;


        System.out.println("Perimeter of this rectangle is: " + perimeter);
        System.out.println("Area of this rectangle is: " + area);



    }
}
