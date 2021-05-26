package Day31_Arrays_Practice;

import java.util.Arrays;

public class CharArrays {
    public static void main(String[] args) {


        // char array with following values:

        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};


        for (char eachLetter : letters) {
            System.out.print(eachLetter + " ");


        }
        System.out.println();
        System.out.println("-----------------------------------------");
        for (char eachLetter : letters) {
            System.out.print(eachLetter);


        }
        System.out.println();
        String sentences = new String(letters);
        System.out.print("Sentences = " + sentences);

        System.out.println("-----------------------------------------");


        String item = "Wooden spoon";
        char[] itemArray = item.toCharArray();

        System.out.println("item Array length = " + itemArray.length);
        System.out.println("item string length = " + item.length());
        for (char eachItem : item.toCharArray()) {
            //  System.out.println(item.toCharArray(item.charAt(eachItem)) + ") (");
        }
        System.out.println("-----------------------------------------");

        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};

        System.out.println();

        String fruitsList = "";
        for (String each : fruits) {
            System.out.print(each + " -");

            fruitsList += "-" + each;

        }
        System.out.println("\nFruit list: " + fruitsList);

        System.out.println();
        System.out.println("-----------------------------------------");

        String languages[] = {"java", "python", "c++", "sql", "ruby", "javascript"};

        System.out.println(String.join("|", languages));
        System.out.println();

        String joinedLanguages = String.join(") (", languages);
        System.out.println("Joined Languages = " + joinedLanguages);

        System.out.println("-----------------------------------------");
        System.out.println();

        // how can convert string to array? like this
        String word = "git";

        char letter[] = word.toCharArray();
        System.out.println(letter);

        // and array to string
        char[] grades = {'A', 'B', 'C', 'D'};
        String gradestr = new String(grades);
        System.out.println(gradestr);


        System.out.println("-----------------------------------------");

        int [] num = {9, 21, 0, 7, 10, 5, 3, 8};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));


    }
}
