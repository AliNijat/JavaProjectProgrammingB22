package Replit_And_Practice_Tasks.LoopsTasks;

import java.util.Arrays;
/*
Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:

sentence -> Java is fun

reversed > fun is Java
 */
public class ReverseEachWord {
    public static void main(String[] args) {

        String sentence = "java is fun";

        String arr [] = sentence.split(" ");
        String reve  = "";

        for (int i =arr.length-1 ; i >= 0; i--) {
        //    reve += arr[i] + " ";
        }

      //  System.out.println(reve);
        System.out.println("--------------------------------");

        for (int i = sentence.length()-1; i >= 0 ; i--) {

            reve += sentence.charAt(i);
        }
        System.out.println(reve);
    }
}
