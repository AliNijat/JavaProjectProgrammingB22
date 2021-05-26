package Replit_And_Practice_Tasks.LoopsTasks;

import java.util.Scanner;

/*
Print the number of times that the string "java" appears anywhere in the given string word

Example:

input: javaxjava

output: 2
input: javaxjava

output: 2
Example:

input: javaxjavaapplepearjavaegg

output: 3
 */
public class CountJava {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        int countJava = 0;

        for (int i = 0; i <= word.length() - 4; i++) {

            if (word.substring(i, i + 4).equals("java") ||
                    word.substring(i, i + 4).equals("Java") || word.substring(i, i + 4).equals("JAVA")) {
                countJava++;
            }
        }
        System.out.println(countJava);
    }
}
