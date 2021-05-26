package Extra_Practice.Arrays_Practice1;

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       // System.out.println("Enter the size of array");
       // int size = scan.nextInt();

        int[] numbers = {10, 40, 50, 20, 2, 15, 1, 500};

        int max = numbers[0];
        int min = max;
        for (int eachNums : numbers) {
            if (eachNums > max) {
                max = eachNums;
            }
            if (eachNums < min){
                min = eachNums;
            }
        }
        System.out.println("Maximum number is = " + max + " and minimum number is +  " + min);


    }
}
