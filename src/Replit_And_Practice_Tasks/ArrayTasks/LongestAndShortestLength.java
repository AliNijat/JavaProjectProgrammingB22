package Replit_And_Practice_Tasks.ArrayTasks;

import java.util.Scanner;

/*
Given the array words find and print the word with the largest length. Assume that there are no 2 words with longest length

Example:

words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]

Outputs: jaaaaavvaaaaaaaaaa
 */
public class LongestAndShortestLength {

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            String[] words = new String[5];
            for(int i = 0; i < 5;  i++) {

                words[i] = input.nextLine();

            }

            //write your code below

            String longest = words[0];
            for (String each : words ) {

                if (each.length() > longest.length()){
                    longest = each;
                }
            }
            System.out.println(longest);

            // for finding the shortest word in elements in an arrays
            String shortest = words[0];
            for (String each : words ) {

                if (each.length() < shortest.length()){
                    shortest = each;
                }
            }
            System.out.println(shortest);



    }
}
