package Replit_And_Practice_Tasks.LoopsTasks;

import java.util.Scanner;

/*
Print out the number of times that the string "hi" appears anywhere in the given string. Only lowercase "hi" should be counted.

Example:

input: abc hi how hi

output: 2
input: abc hi how hi

output: 2
Example:

input: hi code java please

output: 1
 */
public class CountHi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        // your code here

       // int charCount = str.length();
        int counter = 0;

        for (int i = 0; i <= str.length() -2; i++) {
            if (str.substring(i, i+2).equals("hi")){

                counter++;
            }

        }
        System.out.println(counter);

    }
}
