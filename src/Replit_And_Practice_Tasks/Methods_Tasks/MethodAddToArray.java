package Replit_And_Practice_Tasks.Methods_Tasks;

import java.util.Arrays;
/*
**add_to_r** is a method that accepts an array and a number.

The method takes the same value of the array but adds the given number into the array at the end.
Note: The new number is added which means there is a size difference between the two arrays

Example:

```
method input: add_to_r(new int{1,5,77,8}  ,2)

outputs (int array):
[1, 5, 77, 8, 2]
 */
public class MethodAddToArray {
    public static void main(String[] args) {

        int arr[] = {90, 10, 30, 50, 20, 10, 40};
        int n = 100;

         System.out.println(Arrays.toString(addToArray(arr, n)));
        System.out.println("____________________");
         add_to_r(arr, n);
    }

    public static int[] addToArray(int [] arr, int n) {

        int newArray[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {

            newArray[i] += arr[i];

        }
        newArray[newArray.length - 1] = n;
       // System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public static void add_to_r(int[] arr, int n) {

        int newArray[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {

            newArray[i] += arr[i];

        }
        newArray[newArray.length - 1] = n;
        System.out.println(Arrays.toString(newArray));
       // return newArray;
    }

}
