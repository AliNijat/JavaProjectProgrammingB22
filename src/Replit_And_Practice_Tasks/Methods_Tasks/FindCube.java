package Replit_And_Practice_Tasks.Methods_Tasks;

import java.util.Scanner;

/*
Create a method called cube. It is a void method with no arguments. Write all required code inside this method in order to read a number from the console and then prints the cubed value of that number:

Example:

input: 5

output: 125
input: 5

output: 125
hint: cube of a number n = n^3 ->

n * n * n
 */
public class FindCube {
    public static void main(String[] args) {

cube();


    }

    public static void cube(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scan.nextInt();

//       for (int i = 1; i <= 3 ; i++) {
//
//             number *= number;
//       }
        number = (number * number ) * number;
        System.out.println(number);
    }
}
