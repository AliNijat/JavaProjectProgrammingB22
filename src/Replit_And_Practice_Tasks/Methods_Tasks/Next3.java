package Replit_And_Practice_Tasks.Methods_Tasks;

import java.util.Scanner;

/*
Create a method called next3 . This method has an int argument and prints the next 3 numbers after that number. Call the method from main method and pass num to it.

flow:

enter number
1
next 3 are:
2 3 4
enter number
1
next 3 are:
2 3 4
(put a space between numbers)
 */
public class Next3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter number");
        int num = inp.nextInt();

        next3(num);
    }

    // Do not touch above

    public static void next3(int num) {
        System.out.println("next 3 are:");
        for (int i = num+1 ; i <= num + 3; i++) {

            System.out.print(i + " ");
        }
    }
}

