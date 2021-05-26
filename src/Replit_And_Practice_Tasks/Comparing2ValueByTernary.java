package Replit_And_Practice_Tasks;

import java.util.Scanner;

/*
Write an expression using the conditional operator (? :) that compares the value of the variable x to 5 and results in:

Display x if x is greater than or equal to 5
Display -x if x is less than 5 (flip sign - negative/positive)

DO NOT USE IF STATEMENT or SWITCH CASE
 */
public class Comparing2ValueByTernary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();
        int result = (x > 5 || x == 5)?  -x: x;
        System.out.println(result);


    }
}
