package Replit_And_Practice_Tasks.Scanner_Practice;

import java.util.*;

public class CouponsInGame {

    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of coupons: ");

        int coupons = scan.nextInt();
        int candies = coupons / 10;
        int gumballs = ((coupons % 10) / 3); // (coupons % 10) -candies;

        if ((candies * 10) + (gumballs * 3) == coupons) {
            System.out.println("Number of Candies: " + candies);
            System.out.println("Number of Gumballs: " + gumballs);
        } else {

            System.out.println(coupons + "\nNot enough coupons");
        }
    }
}
