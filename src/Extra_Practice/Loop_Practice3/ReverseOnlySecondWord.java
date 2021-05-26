package Extra_Practice.Loop_Practice3;

public class ReverseOnlySecondWord {
    public static void main(String[] args) {

        // Reverse only second word in a string
        String sentence = "I love java";

        String reversedWord = "";
        String secondWOrd = "";
        secondWOrd = sentence.substring(sentence.indexOf(" ") + 1, sentence.lastIndexOf(" ")); // love
        System.out.println(secondWOrd);

        // First solution
        for (int j = sentence.lastIndexOf(" ") - 1; j >= sentence.indexOf(" "); j--) {
            reversedWord += sentence.charAt(j); // evol

        }
        System.out.println(reversedWord);

       //  second solution
        for (int i = secondWOrd.length()-1; i >= 0; i--) {
            reversedWord += secondWOrd.charAt(i); // evol
        }
         System.out.println(reversedWord);

        System.out.println(sentence.replace(secondWOrd, reversedWord));





    }
}
