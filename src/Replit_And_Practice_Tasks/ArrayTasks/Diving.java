package Replit_And_Practice_Tasks.ArrayTasks;

import java.util.Arrays;
import java.util.Scanner;

/*
In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point value.

The highest and lowest scores are thrown out, and the remaining scores are added together. The sum is then multiplied by the degree of difficulty for that dive. The degree of difficulty ranges from 1.2 to 3.8 points.
The total is then multiplied by 0.6 to determine the divers score.

Flow:

Accept the 7 scores from the judges
Accept the difficulty number
Display the final score
Enter score for judge 1:
1
Enter score for judge 2:
5
Enter score for judge 3:
5
Enter score for judge 4:
5
Enter score for judge 5:
5
Enter score for judge 6:
8
Enter score for judge 7:
9
Enter difficulty:
2.1
Total: 35.28
 */
public class Diving {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //float [] scores = {5, 5, 1, 5, 5, 8, 9};
        float[] scores = new float[7];
        float diversScore = 0.6f;
        float difficulty = 2.1f;

        float totalscores = 0;

        for (int i = 0; i < 7; i++) {
            System.out.println("Enter score for judge " + (i + 1) +":");
            scores[i] = input.nextFloat();
            totalscores += scores[i];
        }



        float lowest = scores[0];
        float highest = scores[0];


        for (int i = 0; i < scores.length; i++) {

            if (lowest > scores[i]) {
                lowest = scores[i];
            }
            if (highest < scores[i]) {
                highest = scores[i];
            }
        }
       // System.out.println(lowest + " " + highest);

        System.out.println("Enter difficulty:");
        difficulty = input.nextFloat();
        System.out.println("Total: " + (totalscores- (lowest + highest)) * difficulty * diversScore );

     //   System.out.println(Arrays.toString(scores));


    }
}
