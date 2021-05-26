package Replit_And_Practice_Tasks.ArrayTasks;

import java.util.Scanner;

/**
 * Given an array nums, count and print the number of even numbers in the array
 * <p>
 * Examples:
 * <p>
 * nums → [2, 1, 2, 3, 4]) → 3
 * <p>
 * nums → [2, 2, 0, 3, 5]) → 3
 * <p>
 * nums → [1, 3, 5, 7, 9]) → 0
 */
public class CountEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
// your code here
        int even = 0;
        for ( int eachElement : nums ) {
            if (eachElement % 2 == 0){
                even ++;
            }
        }
        System.out.println(even);
    }
}
