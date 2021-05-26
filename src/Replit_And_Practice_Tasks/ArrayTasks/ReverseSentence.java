package Replit_And_Practice_Tasks.ArrayTasks;

import java.util.Arrays;
/*
Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:

email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com
copied!
email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com
If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com

Output:
invalid email
email -> hello-gmail.com

Output:
invalid email
email -> my@fancy@email.com

Output:
invalid email
 */
public class ReverseSentence {

    public static void main(String[] args) {

        String sentence = "Java is fun";

        String tt []= sentence.split(" ");
        for (int i = tt.length; i > 0 ; i++) {

        //    String tep += tt[i];
        }


        String email = "info@gmail@.com";
        String[] ar = email.split("@");

        for (int i = 0; i < email.length(); i++) {

            if (email.contains("@")) {
                if (ar.length > 2) {
                    System.out.println("11 invalid email");
                    break;

                } else {
                    String str = ar[0];
                    String str1 = ar[1];
                    System.out.println("Email id: " + str);
                    System.out.println("Email domain: " + str1);
                    break;
                }
            } else {
                System.out.println("12 invalid email");
                break;
            }
        }
        System.out.println("-------------Split sentence----------");

        String sentence1 = "Java is fun";
        String st [] = sentence1.split(" ");

        for ( String each : st  ) {
            System.out.println(each);
        }
    }
}
