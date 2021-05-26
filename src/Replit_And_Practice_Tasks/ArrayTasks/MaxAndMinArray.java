package Replit_And_Practice_Tasks.ArrayTasks;

public class MaxAndMinArray {
    public static void main(String[] args) {

        int[] nums = {3, 7, 9, 4, 6, 8, 1, 2, -9};

        int max = nums[0];
        int min = nums[0];

        for ( int each : nums ) {

            if (each > max){
                max = each;
            }
            if (each < min){
                min = each;
            }
        }
        System.out.println("Max = " + max +" And min = " + min);

    }
}
