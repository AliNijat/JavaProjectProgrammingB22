package Replit_And_Practice_Tasks.ArrayTasks;

import java.util.Arrays;
import java.util.Scanner;

/*
Given an int array num of any length, print a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.

Examples:

input: 1, 2, 3

output: [1, 2]
input: 1, 2, 3

output: [1, 2]
input: 1

output: [1]
input: 1

output: [1]
input: 4, 5, 4, 3, 8

output: [4, 5]
 */
public class FrontPiece {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        // your code here

        int myArray[] = null;

        if (num.length < 2) {
            myArray = num;
        } else {
            myArray = new int[2];
            for (int i = 0; i < 2; i++) {
                myArray[i] = num[i];
            }
        }
        System.out.println(Arrays.toString(myArray));

    }
}
