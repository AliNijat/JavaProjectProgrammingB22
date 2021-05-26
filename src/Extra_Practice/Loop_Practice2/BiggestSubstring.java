package Extra_Practice.Loop_Practice2;

import java.util.Scanner;

public class BiggestSubstring {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = "aabbddddddcccc";
        int count = 0;
        String biggest = "";
        String result = "";

        for (int i = 0; i < str.length() - 1; i++) {
            char ch1 = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);

                if (ch1 == ch2) {
                    count++;
                    biggest += ch1;
                } else {
                    biggest = "";
                    count = 0;
                }
                if (biggest.length() > result.length()) {
                    result = biggest;
                }

            }
        }
        System.out.println(result + " is the biggest substring and it's repeated " + count + " times");



    }
}
