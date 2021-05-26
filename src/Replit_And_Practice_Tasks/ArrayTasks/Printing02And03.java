package Replit_And_Practice_Tasks.ArrayTasks;
/**
 * The code provided in your main method will take in eight Strings and save them into an array arr.
 * <p>
 * Print out the 4 lines using for loop: each line should contain a pair of array elements
 * <p>
 * Example:
 * <p>
 * arr -> ["apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"]
 * arr -> ["apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"]
 * Output:
 * apple , banana
 * kiwi , grape
 * milk, soda
 * juice, coffee
 */

import java.util.Arrays;
import java.util.Scanner;

public class Printing02And03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = input.nextLine();
        }
        // Do not touch above
        String towArray = "";
        for (int i = 0; i < arr.length; i++) {

            towArray += arr[i];

        }
        System.out.println(towArray +"\n");

    }
}
