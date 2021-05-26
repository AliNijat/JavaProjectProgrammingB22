package Replit_And_Practice_Tasks.ArrayTasks;

import java.util.Arrays;
import java.util.Scanner;

/**
Given two arrays of ints sorted in increasing order, outer and inner, print out true if all of the numbers in inner appear in outer. Take advantage of the fact that both arrays are already in sorted order.

Examples:

input (outer): 1, 2, 4, 6
input (inner): 2, 4

output: true
input (outer): 1, 2, 4, 6
input (inner): 2, 4

output: true
input (outer): 1, 2, 4
input (inner): 6, 5

output: false
 */
public class OuterAndInner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] outer = new int[scan.nextInt()];
        int[] inner = new int[scan.nextInt()];

        for(int j = 0; j < outer.length; j++) {
            outer[j] = scan.nextInt();
        }

        for(int i = 0; i < inner.length; i++) {
            inner[i] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);
        //WRITE YOUR CODE HERE
        System.out.println(Arrays.toString(inner));
        System.out.println(Arrays.toString(outer));

        boolean result = false;

        for (int i = 0; i <outer.length ; i++) {
            for (int j = 0; j < inner.length; j++) {
                if (inner[j] == outer[i]){
                    result = true;
                }else {
                    result = false;
                }
            }

        }
        System.out.println(result);
        System.out.println();
//        int count = 0;
//        for (int each : inner) {
//            for (int l = 0; l < outer.length; l++) {
//                if (Arrays.binarySearch(outer, each) >= 0) {
//                    count++;
//                    break;
//                }
//            }
//        }
//        System.out.println((count== inner.length));


    }
}
