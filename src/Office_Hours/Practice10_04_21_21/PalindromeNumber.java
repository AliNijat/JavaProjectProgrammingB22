package Office_Hours.Practice10_04_21_21;
/*
[IQ] Palindrome number

 1234321

 -> Approach: Reverse the number with some math
     -> Check is reverse the same as the original

     -> This gives the last digit: number % 10 -> 1

      1234321 | number % 10 -> 1
      1234321 | number / 10 -> 123432

      123432 | number % 10 -> 2
      123432 | number / 10 -> 12343

      12343 | number % 10 -> 3
      12343 | number / 10 -> 1234

      rev = 1
      2
      rev  * 10 -> 10 + 2 -> 12

      rev  * 10 -> 120 + 3 -> 123
 */
public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.println(isPalindrome(12321));

//        System.out.println("___________");
//
//        int number = 1234321;
//
//        int n = number % 10;
//
//        System.out.println(n);
//        System.out.println((number - n) / 10);
//
//        System.out.println((n * 10) + n);
    }
    public static boolean isPalindrome(int number){

        int rev = 0;
        int tep = number;

        while (tep != 0){

            int lastDigit = tep % 10;
            rev = (rev * 10 ) + lastDigit;
            tep /= 10;
            System.out.println(rev);

        }
        return rev == number;
    }
}
