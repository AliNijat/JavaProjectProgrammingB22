package Replit_And_Practice_Tasks.ArrayTasks;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestAndLongestWordFromStringArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many word you will enter:");
        String [] words = new String[input.nextInt()];
        input.nextLine();

        for (int i = 0; i < words.length ; i++) {
            System.out.println("Enter word number " + (i+1));
            words[i] = input.nextLine();

        }

        System.out.println(Arrays.toString(words));
        System.out.println();

        String smallAndLarg [] = {words[0], words[0]};

        for (String  i : words ) {
            if (i.length() < smallAndLarg[0].length()){

                smallAndLarg [0] = i;
            }
            if (i.length() > smallAndLarg[1].length()){
                smallAndLarg [1] = i;
            }
        }

        System.out.println("Smallest words = " + smallAndLarg [0]);
        System.out.println("Largest words = " + smallAndLarg [1]);

        System.out.println();
        System.out.println(Arrays.toString(smallAndLarg));


    }
}
