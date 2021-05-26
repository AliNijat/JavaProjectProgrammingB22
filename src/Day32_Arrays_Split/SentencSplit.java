package Day32_Arrays_Split;

public class SentencSplit {
    public static void main(String[] args) {

        String sentence = "java is fun but selenium is cool fun";

        String[] words = sentence.split(" ");

        System.out.println("1st word is = " + words[0]);
        System.out.println("2st word is = " + words[1]);
        System.out.println("3st word is = " + words[2]);
        System.out.println("4st word is = " + words[3]);
        System.out.println("5st word is = " + words[4]);
        System.out.println("6st word is = " + words[5]);
        System.out.println("7st word is = " + words[6]);

        System.out.println();

        for (String elements : words) {
            System.out.println(elements + " ");
        }
        System.out.println();

        String sentences = "About 1,810,000 results (0,68 seconds)";
        String[] newWords = sentences.split(" ");
        // replace '(' with ""
        System.out.println(newWords[1] +" and " + newWords[3].replace("(", ""));
        // print just by substring with out '('
        System.out.println(newWords[1] +" and " + newWords[3].substring(1));
        System.out.println();

        // --- counting some word in sentences or arraylist
        String count [] = sentence.split("fun");
        System.out.println("number of count = " + (count.length-1));



    }
}

