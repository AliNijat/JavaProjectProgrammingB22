package Replit_And_Practice_Tasks.LoopsTasks;

import java.util.Scanner;

/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).

Example:

input: We study java not python

output: true
input: We study java not python

output: true
Example:

input: What's the difference between java, javascript and python?

output: false
 */
public class JavaEqualsPython {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int countjava =0;
        int countPython =0;
        String currenWord ="";
        for (int i = 0; i <= sentence.length()-4; i++) {
            if (sentence.substring(i, i+4).equals("java")){
                countjava ++;
            }

        }
        for (int i = 0; i <= sentence.length()-6; i++) {

            if (sentence.substring(i, i + 6).equals("python")){
                countPython++;
            }

        }

        System.out.println(countjava == countPython);

    }
}
