package Day21_String_Menipulation_Continue;

import java.util.Scanner;

public class CheckPolandrom {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        if (word.charAt(0) == word.charAt(word.length()-1)){
            System.out.println(word + " is a a palindrom word");
        }else {
            System.out.println(word + " is not a polindrom word");
        }


    }
}
