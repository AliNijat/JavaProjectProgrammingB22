package Replit_And_Practice_Tasks.Methods_Tasks;

import java.util.Arrays;

public class WordsCount {
    public static void main(String[] args) {

        String words = "foo bar bla";
        int count = 0;

        String [] newWords = words.split(" ");
        System.out.println(Arrays.toString(newWords));

        for (int i = 0; i < newWords.length; i++) {
            count ++;
        }
        System.out.println(count);
    }
}
