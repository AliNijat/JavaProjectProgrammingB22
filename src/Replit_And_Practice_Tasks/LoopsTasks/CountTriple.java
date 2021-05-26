package Replit_And_Practice_Tasks.LoopsTasks;

import java.util.Scanner;

/*
We'll say that a "triple" in a string is a char appearing three times in a row. Print out the number of triples in the given string. The triples may overlap.

Example:

input: abcXXXabc

output: 1
input: abcXXXabc

output: 1
Example:

input: xxxabyyyycd

output: 3
input: xxxabyyyycd

output: 3
Example:

input: java

output: 0
 */
public class CountTriple {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count = 0;
        // write your code here

//        for (int i = 0; i <=str.length()-2 ; i++) {
//
//            String triple = str.charAt(i) + ""+ str.charAt(i) +""+str.charAt(i);
//            if (str.substring(i, i+3 ).equals(triple)){
//                count++;
//
//            }
//
//        }
//        System.out.println(count);


        for(int i =0; i<str.length()-2; i++){
            if(str.charAt(i)== str.charAt(i+1) &&
                    str.charAt(i)== str.charAt(i+2)){
                count++;
            }

        }
        System.out.println(count);

    }
}
