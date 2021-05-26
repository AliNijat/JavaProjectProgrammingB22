package Replit_And_Practice_Tasks.ArrayTasks;

import java.util.Arrays;
import java.util.Locale;

/*
Write a program that will find out shortest words in the given string str. If there are few words that are evenly short, print them all. Use split method in order to split str string variable and create an array of strings. Print array with Arrays.toString() method. Sort array before printing.

Hint: Split values by comma: split(", ");

input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

output: [cat, old, ray]
 */
public class ShortestWords {
    public static void main(String[] args) {
        String words = "hello, why, bye, apple, note";

        String [] arr = words.split(", ");
        System.out.println(Arrays.toString(arr));
        String shortestWords = "";
        String shorter = arr[0];
        String tepStr = "";
        for (int i = 0; i < arr.length; i++) {
            tepStr = "";
            for (int j = 0; j < arr[i].length(); j++) {
                tepStr += arr[i].charAt(j);
                }
            if (tepStr.length() < shorter.length()){
                shorter = tepStr;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (shorter.length() == arr[i].length()){
                shortestWords += arr[i] + " ";
            }

        }
        String [] newArr = shortestWords.split(" ");
        Arrays.sort(newArr);
        System.out.println(Arrays.toString(newArr));
        System.out.println(shortestWords);

        System.out.println(shorter + " new " + tepStr);

    }
}
