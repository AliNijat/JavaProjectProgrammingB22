package Replit_And_Practice_Tasks.Second_Week_Practice;
import java.util.Scanner;
public class ConvertCentsInExch {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter cents:");
        int cents = scan.nextInt();

        int guarters = cents / 25;
        int remainderOfQuarter = cents % 25;
        int dimes = remainderOfQuarter / 10;
        int remainderODimes = remainderOfQuarter % 10;
        int nickels = remainderODimes / 5;
        int pennies = remainderODimes % 5;

        if ( cents >  0 && cents < 100){
            System.out.println("Your change is " + guarters + " quarters, " +
                    dimes + " dimes, " + nickels + " nickels and " + pennies + " pennies");

        }else {

            System.out.println("Invalid cents amount");
        }
    }
}
