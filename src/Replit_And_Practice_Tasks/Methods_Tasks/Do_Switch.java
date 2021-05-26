package Replit_And_Practice_Tasks.Methods_Tasks;

import java.util.Arrays;

public class Do_Switch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        System.out.println("The reversed verrsion of Array " + Arrays.toString(do_switch(arr)));
        System.out.println("Firs and last Elements changed" + Arrays.toString(reverseArray(arr)));

    }
    public static int[] do_switch(int[] i) {

        // Methods for reversing Array
        int[] reversed = new int[i.length];
        reversed[0] = i[i.length - 1];
        for (int n = i.length - 1, j = 0; n >= 0; n--, j++) {
            reversed[j] = i[n];
        }
        //  System.out.println(Arrays.toString(reversed));
        return reversed;

    }
    public static int[] reverseArray(int []  arr) {

        // Method for swiping only first and last elements of 2 Arrays
        int temp = arr[0]; // 1
        arr[0] = arr[arr.length - 1];//  1 = 4
        arr[arr.length - 1] = temp; // 4 = 1

       // System.out.println("new " + Arrays.toString(arr));
        return arr;

    }
}
