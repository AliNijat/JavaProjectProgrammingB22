package Office_Hours.Practice10_04_06_21;

/*
Biggest substring of matching characters
Given a String find the biggest substring of chars that match and print
it.
Ex: aaabbbcccccddddee
Output: ccccc
 */
public class LongestSubstring {
    public static void main(String[] args) {

        String str = "aaabbbcccccddddee";

        String longestSub = "";

        String tep = "";

        for (int i = 0; i < str.length(); i++) {

            tep += str.charAt(i);
            System.out.println(tep);

            if (tep.charAt(i) != str.charAt(i + 1)) {
                if (tep.length() > longestSub.length()) {
                    longestSub = tep;
                }
            }
            tep = "";

        }


    }
}
