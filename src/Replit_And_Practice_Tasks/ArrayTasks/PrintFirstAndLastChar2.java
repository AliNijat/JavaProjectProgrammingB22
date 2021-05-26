package Replit_And_Practice_Tasks.ArrayTasks;

import java.util.Arrays;

/*
Given a String array words, iterate through each word and print first and last letter of each element in the format below. Put each first and last letter in an array.

Example:

words → ["hello", "why", "by", "apple" , "note"]

print → [ho, wy, by, ae, ne]
 */
public class PrintFirstAndLastChar2 {
    public static void main(String[] args) {

        String[] words = {"hello", "why", "by", "apple", "note"};

        String newArry[] = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            newArry[i] = words[i].charAt(0) + "" + words[i].charAt(words[i].length() - 1);
          //  System.out.println(Arrays.toString(newArry));
           // System.out.print(words[i].charAt(0) + "" + words[i].charAt(words[i].length() - 1) + " ");

        }
        System.out.println(Arrays.toString(newArry));

    }
}
