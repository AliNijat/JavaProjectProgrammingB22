package Day21_String_Menipulation_Continue;

import java.nio.charset.StandardCharsets;

public class ReplacePractice {
    public static void main(String[] args) {

        String s = "java";

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
        //System.out.println(s.charAt(4));

        System.out.println(s + "-" +s.length());

        System.out.println("first later " + s.charAt(0));

        String company = "Cybertek";
        char fist = company.charAt(0);
        char second = company.charAt(1);
        char third = company.charAt(2);
        char forth = company.charAt(3);
        char fifth = company.charAt(4);
        char sixth = company.charAt(5);
        char s7 = company.charAt(6);
        char s8 = company.charAt(7);

        System.out.println(fist + " " + second + " " + third + " " + forth +
                                  " " + fifth + " " + sixth + " " + s7 + " " + s8);
        int i;
        for (i = 0; i < company.length(); i ++ ){
            System.out.print(company.charAt(i) + " ");
        }



    }
}

