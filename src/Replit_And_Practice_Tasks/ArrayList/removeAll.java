package Replit_And_Practice_Tasks.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class removeAll {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo", "ha", "hi"));
        System.out.println(removeAll(wordList, "hi"));
    }

    public static ArrayList<String>removeAll(ArrayList<String> wordList, String targetWord){

        for ( int i = 0; i < wordList.size(); i++ ) {
            if (targetWord.equalsIgnoreCase(wordList.get(i))){
                wordList.remove(i);
            }
        }

        return wordList;
    }
}
