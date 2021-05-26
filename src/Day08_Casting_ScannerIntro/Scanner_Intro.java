package Day08_Casting_ScannerIntro;

import java.util.Scanner; // 1 step: import the scanner class

public class Scanner_Intro {
    public static void main(String[] args) {

        Scanner inPut = new Scanner(System.in); // 2 step: write the scanner object, using NEW keyword.
        System.out.println("Please enter your question or data:"); // 3 step: ask for entering the question or data.

        String word = inPut.nextLine(); // Capture the data typed
        String word2 = inPut.next();

        System.out.println("You entered the word: " + word);
        System.out.println("You entered the data: " + word2);


    }
}
