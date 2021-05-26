package Replit_And_Practice_Tasks.LoopsTasks;

import java.util.Scanner;

/*
Create a program that will take the given String In and print out all the vowels from the String.

Example:

Input: howdyho

Output: oo
Input: howdyho

Output: oo
Input: huehuehuehue

Output: ueueueue
 */
public class TakeOutVowelsLetterFromString {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below

        for (int i = 0; i <= word.length()-1; i++) {

            if (word.charAt(i) == 'a' || word.charAt(i) == 'e'
                    || word.charAt(i) == 'u' || word.charAt(i) == 'o' ||
                    word.charAt(i) == 'i') {
                System.out.print(word.charAt(i));
            }
        }
    }
}
