package Replit_And_Practice_Tasks.LoopsTasks;
/*
Print true if the string "cat" and "dog" appear the same number of times in the given string word.

Example:

input: catdog
output: true
input: catdog
output: true
Example:

input: catcat
output: false
input: catcat
output: false
Example:

input: cat-cheetah-dog-cat
output: false
 */

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

//        int wordCharCount = word.length();
//        int tCharCount = 3;
//
//        for (int i = 0; i <= wordCharCount - tCharCount; i++) {
//
//            String currentWord = word.substring(i, i + tCharCount);

        for (int i = 0; i <= word.length() -3; i++) {

            String currentWord = word.substring(i, i + 3);
            System.out.println(currentWord);

            if (currentWord.equals("cat")) {
                countOfCats++;
                System.out.println("cat found");
            } else if (currentWord.equals("dog")) {
                countOfDogs++;
                System.out.println("dog found");
            } else {
            }
        }
        System.out.println(countOfDogs);
        System.out.println(countOfCats);
        System.out.println(countOfCats == countOfDogs);


    }
}
