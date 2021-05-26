package Replit_And_Practice_Tasks.Scanner_Practice;
import Day12_Conditional_Statements.If_Statement.If;

import java.util.*;
public class LeasingOfficeProgram {


            public static void main(String[] args) {

                //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
                // Variables are already declared and given
                Scanner scan = new Scanner(System.in);
                System.out.println("Welcome to Cybertek Apartments!");
                System.out.println("Number of bedrooms you are interested:");

                int numberOfBedrooms = scan.nextInt();
                int startingPrice = 0;
                //,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,

                if (numberOfBedrooms == 1){
                    System.out.println("One Bedroom Selected");
                    startingPrice += 1100;
                    System.out.println("Starting Price: $" + startingPrice);
                }else if (numberOfBedrooms == 2){
                    System.out.println("Two Bedrooms Selected");
                    startingPrice += 1850;
                    System.out.println("Starting Price: $" + startingPrice);
                }else if (numberOfBedrooms == 3){
                    System.out.println("Three Bedrooms Selected");
                    startingPrice += 2550;
                    System.out.println("Starting Price: $" + startingPrice);
                }else {
                    System.out.println("No such Bedrooms available");
                }
    }
}
