package Extra_Practice.Loop_Practice2;

import java.util.Scanner;

public class IQPalindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        String palindrome = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            palindrome += word.charAt(i);
          //  System.out.print((palindrome));

        }
        System.out.println(word.equalsIgnoreCase(palindrome));

        if (word.equalsIgnoreCase(palindrome)){
            System.out.println(word + " is a Palindrome word");
        }else {
            System.out.println(word + "is not a Palindrome word");
        }



    }

}
