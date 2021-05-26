package Replit_And_Practice_Tasks.Methods_Tasks;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {

        String word1 = "aleie4";
        String word2 = "ilaee4";

        String [] arr1 = word1.toLowerCase().split("");
        String [] arr2 = word2.toLowerCase().split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1) + " = " + Arrays.toString(arr2));


        boolean result = true;
        for (int i = 0; i < word1.length() ; i++) {
            if (arr1[i].equalsIgnoreCase(arr2[i])){
                result = true;
            }else {
              result = false;
            }
        }
        System.out.println(result);

    }
}
