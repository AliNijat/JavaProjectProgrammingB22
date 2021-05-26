package Replit_And_Practice_Tasks;

import java.util.Scanner;

public class aClassForTestCodes {
    public static void main(String[] args) {

        Scanner scan = new  Scanner(System.in);

       String word1 = scan.next();
       String word2 = scan.next();

       if (word1.equals(word2)){
           System.out.println("Word1 equals word2");
       }else
           System.out.println("Word1 does not equals word2");


    }
}
