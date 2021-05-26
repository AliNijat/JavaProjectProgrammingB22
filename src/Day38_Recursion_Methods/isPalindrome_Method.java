package Day38_Recursion_Methods;

import static Day38_Recursion_Methods.isPalindrome_Method.*;

public class isPalindrome_Method {
    public static void main(String[] args) {

        System.out.println("is palindrome ");

    }
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
