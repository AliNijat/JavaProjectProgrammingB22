package Replit_And_Practice_Tasks.Methods_Tasks;

import java.util.Arrays;

/*
This method accept two strings (text and badWord) and returns a string.

The method will take out all the occurrences of badWord in the text.

Example:

clean ("one two three","two")

returns "one three"
clean ("one two three","two")

returns "one three"
clean ("foo bar","foo")

returns "bar"
clean ("foo bar","foo")

returns "bar"
clean ("he said bla bla bla","bla")

returns "he said"
 */
public class CleanString {
    public static void main(String[] args) {

        String text = "one two three";
        String badWord = "two";
        clean(text, badWord);
        System.out.println();

        System.out.println(clean2(text, badWord));


    }

    public static void clean(String text, String badWord) {
        String cleaned = "";

        String arr[] = text.split(" ");
        // System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {

            cleaned = "";
            if (!arr[i].equals(badWord)) {
                cleaned = arr[i] + " ";
            }
            System.out.print(cleaned);
        }
    }

    public static String clean2(String text, String badWord) {

        String cleanedWords = text.replace(badWord, "");
        cleanedWords = cleanedWords.replace("  ", " ");

        return cleanedWords;
    }


}
