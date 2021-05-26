package Replit_And_Practice_Tasks;

import java.util.Scanner;

/*
Given a string word, print true if "java" appears starting at index 0 or 1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0.

Example:

input: javapython

output: true
input: javapython

output: true
input: cjavac++

output: true
input: cjavac++

output: true
input: c#javaruby

output: false
 */
public class IfWordHasAJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.length() >= 4) {
            if (word.substring(0, 4).equals("java") || word.substring(1, 5).equals("java")) {
                exists = true;
                System.out.print(exists);
            } else {
                System.out.print(exists);
            }
        }else {
            System.out.print(exists);
        }
        System.out.println("------------------------------------");
        String word3 = word.substring(0, 4);
        System.out.println(word3);

    }
}
