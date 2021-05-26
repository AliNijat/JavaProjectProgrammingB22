package Replit_And_Practice_Tasks.Methods_Tasks;

import java.util.Arrays;

public class StringLimit {
    public static void main(String[] args) {

        String text = "abcd";
        int maxLength = 2;

        //String arr [] = new String[maxLength];
        String res = "";

        for (int i = 0; i < maxLength; i++) {

            res += text.charAt(i);

        }
        System.out.println(res);
      //  System.out.println(Arrays.toString(arr));

    }
}
