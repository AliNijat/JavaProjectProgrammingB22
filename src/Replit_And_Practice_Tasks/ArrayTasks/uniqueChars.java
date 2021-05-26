package Replit_And_Practice_Tasks.ArrayTasks;

import java.util.*;

public class uniqueChars {
   private String unique;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));

    }

    public static String uniqueChars(String str) {
        //TODO: write your code

       //String str = "aliijjann alig like";
        String uniqueChars = "";
        String nonUnique = "";

        for (int i = 0; i < str.length(); i++) {

            if (!uniqueChars.contains(str.charAt(i)+ "" )){
                uniqueChars += str.charAt(i);
            }
            if (!nonUnique.contains(str.charAt(i) +" ")){
                nonUnique += str.charAt(i);
            }

        }
       // System.out.println(tepStr + " < Unique chars are = " + uniqueChars);
        return  uniqueChars;
        //return nonUnique;
    }
}