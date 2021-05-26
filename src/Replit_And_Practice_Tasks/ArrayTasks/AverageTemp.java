package Replit_And_Practice_Tasks.ArrayTasks;

import java.util.Scanner;

/**
Given an array temps with temperature values find and print the average value

Example:

input: 80 88 88 84 82 78 60 68

output: 78.5
 */
public class AverageTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        double everageTemp = 0.00;
        for ( double eachTem : temps   ) {

            everageTemp += eachTem;
        }
        System.out.println("Average Temp = " + everageTemp/temps.length);
    }
}
