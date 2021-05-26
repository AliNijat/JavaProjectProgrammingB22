package Replit_And_Practice_Tasks.LoopsTasks;

import java.util.Scanner;

/*\
Given a String, use a loop to print every character from the String on a new line.

Examples:

Input: hello
h
e
l
l
o
Input: hello
h
e
l
l
o
Input: zimbabwe
z
i
m
b
a
b
w
e
 */
public class PrintInNewLineEveryLetter {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        String word = n.nextLine();

        int i = 0;
        for ( i = 0; i <=word.length()-1; i++) {

            System.out.println(word.charAt(i));

        }
    }
}
