package Office_Hours.Practice_05_03_21;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {
    public static void main(String[] args) {


        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript", "java", "word" ));
        char targetLetter = 'a';

        int count = 0;

        for(String word: words){
            if(word.equals(targetLetter)) {
                count++;
            }

        }

        System.out.println(targetLetter + " was found " + count + " times");

    }
}
