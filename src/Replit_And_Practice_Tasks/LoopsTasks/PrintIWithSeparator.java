package Replit_And_Practice_Tasks.LoopsTasks;
/*
Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

Example:

input:
Word
X
3

output: WordXWordXWord
input:
Word
X
3

output: WordXWordXWord
Example:

input:
This
And
2

output: ThisAndThis
input:
This
And
2

output: ThisAndThis
Example:

input:
This
And
1

output: This
 */

import java.util.Scanner;

public class PrintIWithSeparator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

        String result = "";
        for (count = count; count > 0; count--) {

            if (count == 1) {

                result += word;
            } else {
                result += word + separator;
            }
        }
        System.out.print(result);

    }
}
