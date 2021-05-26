package Day32_Arrays_Split;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence = "java is fun";

        String [] sentence1 = sentence.split(" ");
        System.out.println(Arrays.toString(sentence1));

        System.out.println();

        for (int i = sentence1.length-1 ; i >= 0 ; i--) {

            String word = sentence1[i];

            System.out.print(word + " ");
        }
        System.out.println();

        String newstr = sentence.replace(" ", "");
        System.out.println(newstr);
        System.out.println();

        for (int i = newstr.length()-1 ; i >=0 ; i--) {
            System.out.print(newstr.charAt(i) + " ");

        }
        System.out.println();



    }
}
