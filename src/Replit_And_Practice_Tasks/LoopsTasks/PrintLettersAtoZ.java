package Replit_And_Practice_Tasks.LoopsTasks;
/*
Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.

Example:

input:
A
Z

output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
input:
A
Z

output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
Example:

input:
a
f

output: abcdef
input:
a
f

output: abcdef
Example:

input:
a
d

output: abcd
input:
a
d

output: abcd
Example:

input:
B
O

output: BCDEFGHIJKLMNO
 */
import java.util.Scanner;

public class PrintLettersAtoZ {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);

        char result = 'a';
        for (char i = start; i <= end ; i++) {

            System.out.print(i);

        }


    }
}
