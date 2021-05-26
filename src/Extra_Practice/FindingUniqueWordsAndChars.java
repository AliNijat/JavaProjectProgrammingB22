package Extra_Practice;

import java.util.Scanner;

public class FindingUniqueWordsAndChars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        String charsAfterRemoveDupl = "";
        String RepeatedChars = "";
        String uniqueChars = "";

        int uniqCount = 0;
        int repeatCount = 0;
        int afterRemoveDupl = 0;

        for (int i = 0; i < str.length(); i++) {

            if (!charsAfterRemoveDupl.contains(str.charAt(i) + "")) {      // The chars after removing duplicates
                charsAfterRemoveDupl += str.charAt(i);
                afterRemoveDupl++;
            } else {
                RepeatedChars += str.charAt(i);                            // The chars that are duplicate
                repeatCount++;
            }

        }
        for (int i = 0; i < charsAfterRemoveDupl.length(); i++) {
            if (!RepeatedChars.contains(charsAfterRemoveDupl.charAt(i) + "")) { // The unique codes formula
                uniqueChars += charsAfterRemoveDupl.charAt(i);
                uniqCount++;
            }

        }

        System.out.println("Repeated Chars = " + RepeatedChars + " = "
                + repeatCount + "\nChars after removed duplicates = "
                + charsAfterRemoveDupl + " = " + afterRemoveDupl
                + "\nMy unique chars = " + uniqueChars + " = " + uniqCount);
    }
}
